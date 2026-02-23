package algorithms.serializable;

import serialazible.Homonym;

import java.io.*;
import java.time.LocalDate;
import java.util.Date;

public class Run {


  public static void main(String[] args) throws Exception {



    String[] arr = new String[]{"a","b","c"};

    Report report = new Report(new Date(), new Date(), new DbOper());


    FileOutputStream fileOutputStream = new FileOutputStream("yourfile.txt");
    ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(report);


    byte[] arr1 = {0x71,0, 0x7e, 0,5};
    fileOutputStream.write(arr1);

    objectOutputStream.flush();
    objectOutputStream.close();


    FileInputStream fileInputStream
            = new FileInputStream("yourfile.txt");
    //

    RepoerHacking repoerHacking = new RepoerHacking(fileInputStream);
    repoerHacking.doSome();

//    FileInputStream fileInputStream2
//            = new FileInputStream("yourfile.txt");
//    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream2);
//
//    Report p2 = (Report) objectInputStream.readObject();
//    objectInputStream.close();


  }
}
