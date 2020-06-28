package Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Department implements Serializable {
    String username;
     static   String  password; // it is 
    String DepartmentName;
    public Department(String username, String password, String departmentName) {
        this.username = username;
        this.password = password;
        DepartmentName = departmentName;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Department department = new Department("Praveen", "Sharma","Physics");
      //  Department department1 = new Department("Praveen", "Sharmas","Physics");

        //Serialization
        FileOutputStream file = new FileOutputStream("serialliztbleExample");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(department);
        System.out.println("before serialixarion.......");
        System.out.println((department.DepartmentName +" " +department.password +" "+ department.username));
        out.close();
        file.close();
        //Deserialization
        FileInputStream file1 = new FileInputStream("serialliztbleExample");
        ObjectInputStream in = new ObjectInputStream(file1);
        System.out.println("after deseriliazation.......");
        Department d2= (Department) in.readObject();
        System.out.println(d2.DepartmentName +" " +d2.password +" "+ d2.username);
        in.close();
        file1.close();
    }
}

  
