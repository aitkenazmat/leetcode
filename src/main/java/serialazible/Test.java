package serialazible;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "filename.ser";
        serializable(fileName);
        deserialization(fileName);
    }


    public static void serializable(String fileName) throws IOException{
        User user = new User("Azamat",28);
        System.out.println(user);

        FileOutputStream file = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(file);

        out.writeObject(user);

        out.close();
        file.close();
    }


    public static void deserialization(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(file);

        // Method for deserialization of object
        User object1 = (User)in.readObject();

        in.close();
        file.close();

        System.out.println("Object has been deserialized ");
        System.out.println("name = " + object1.getName());
        System.out.println("age = " + object1.getAge());
    }
}
