package algorithms.serializable.example3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Run {


  public static void main(String[] args) throws Exception{


    IntegerDivider id = new IntegerDivider(10, new IntegerWrap(5));
    int r1 = id.divide();

    FileOutputStream fileOutputStream = new FileOutputStream("example3.txt");
    ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(id);

    byte[] arr1 = {0x71,0, 0x7e, 0,8}; // гововрим что здесь есть ссылка на IntegerWrap
    fileOutputStream.write(arr1);


    FileInputStream fileInputStream2 = new FileInputStream("example3.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream2);

    IntegerDivider s = (IntegerDivider) objectInputStream.readObject();

    IntegerWrap integerWrap = (IntegerWrap) objectInputStream.readObject();
    integerWrap.value = 0;


    try {
      int r2 =s.divide();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println(s);
    }




//    IntegerDivider id1 = new IntegerDivider(10, 0);
//
//    FileOutputStream fileOutputStream1 = new FileOutputStream("example1_bad.txt");
//    ObjectOutputStream objectOutputStream1  = new ObjectOutputStream(fileOutputStream1);
//    objectOutputStream1.writeObject(id1);



//    byte[] arr1 = {0x71,0, 0x7e, 0,5};
//    fileOutputStream.write(arr1);

  }
}
