package algorithms.serializable.example2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Run {


  public static void main(String[] args) throws Exception{


    IntegerDivider id = new IntegerDivider(10, 5);
    //int r1 = id.divide();

    FileOutputStream fileOutputStream = new FileOutputStream("example2.txt");
    ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(id);


    FileInputStream fileInputStream2 = new FileInputStream("example2_bad.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream2);
    IntegerDivider s = (IntegerDivider) objectInputStream.readObject();
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
