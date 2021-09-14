package algorithms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main1122 {

    public static void main(String[] args) {


        int[] arr1 = new int[]{2,3,1,3,2,4,6,19,9,2,7};
        int[] arr2 = new int[]{2,1,4,3,9,6};


        int[]res = relativeSortArray(arr1,arr2);

        System.out.println(Arrays.toString(res));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        Integer[] hasIntegers = hasElement(arr1,arr2);
        Integer[] hasNotIntegires = hasNotElement(arr1,arr2);


        quickSort(hasNotIntegires, 0 , hasNotIntegires.length-1);


        int[] resArr = new int[hasIntegers.length+ hasNotIntegires.length];


        for (int i = 0; i < hasIntegers.length ; i++) {
            resArr[i] = hasIntegers[i];
        }



        int j = 0;
        for (int i = hasIntegers.length; i < hasNotIntegires.length+hasIntegers.length ; i++) {
            resArr[i] = hasNotIntegires[j];
            j++;
        }



        return resArr;
    }


    public  static  Integer[] hasElement(int[] arr1, int[] arr2){
        List<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < arr2.length ; i++) {

            int valArr2 = arr2[i];

            for (int j = 0; j < arr1.length ; j++) {

                if (arr1[j] == valArr2) {
                    integerList.add(arr1[j]);
                }
            }
        }
        Integer[] array = integerList.toArray(new Integer[0]);
        return array;
    }

    public  static  Integer[] hasNotElement(int[] arr1, int[] arr2){

        Arrays.sort(arr2);

        List<Integer> integerList = new LinkedList<>();

        for (int i = 0; i < arr1.length ; i++) {

            int varArr1 = arr1[i];

            int r = binarySearch(arr2,varArr1);
            if ( r == -1)
                integerList.add(varArr1);

        }

        Integer[] array = integerList.toArray(new Integer[0]);


        return array;
    }


    public static int binarySearch(int[] arr, int item) {

        int low = 0;
        int high = arr.length -1;


        while (low<=high) {

            int mid = (low+ high)/2;
            int guess = arr[mid];

            if (guess == item)
                return mid;

            if (guess>item)
                high = mid - 1;
            else
                low = mid+1;
        }

        return -1;
    }

    public static void quickSort(Integer[] array, int low, int high) {


        if (array.length ==0)
            return;

        if (low>=high)
            return;

        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        int i = low;
        int j = high;
        while (i<= j) {

            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);


    }
}
