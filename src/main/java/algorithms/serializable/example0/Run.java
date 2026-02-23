package algorithms.serializable.example0;


import java.io.*;
import java.time.LocalDate;

public class Run {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    User user = new User(7878L, LocalDate.now());

    System.out.println(user.toString());

    FileOutputStream fileOutputStream = new FileOutputStream("example0.txt");
    ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(user);


    FileInputStream fileInputStream2 = new FileInputStream("example0.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream2);
    User s = (User) objectInputStream.readObject();

    System.out.println(s.toString());
  }
}
