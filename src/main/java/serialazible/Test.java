package serialazible;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {



        User user = new User("aza1",28);
        User user1 = new User("aza2",28);

        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());

        HashSet<User> set = new HashSet<>();
        set.add(user);
        set.add(user1);



        set.forEach(System.out::println);




//        String fileName = "filename.ser";
//        serializable(fileName);
//        deserialization(fileName);
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
