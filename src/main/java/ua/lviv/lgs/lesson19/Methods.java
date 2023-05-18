package ua.lviv.lgs.lesson19;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Methods {
    public static void serialize(Employee e) {
        try {
            FileOutputStream serialize = new FileOutputStream("C:\\Users\\okovalska\\Desktop\\employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(serialize);
            out.writeObject(e);
            out.close();
            serialize.close();
            System.out.println("Class serialized");

        } catch (IOException i) {
            i.getMessage();
        }
    }

    public static Employee deserialize() {
        Employee e = new Employee();
        try {
            FileInputStream deserialize = new FileInputStream("C:\\Users\\okovalska\\Desktop\\employee.ser");
            ObjectInputStream in = new ObjectInputStream(deserialize);
            e = (Employee) in.readObject();
            in.close();
            deserialize.close();

        } catch (IOException i) {
            i.getMessage();
        } catch (ClassNotFoundException a) {
            a.getCause();
        }
        return e;
    }

    public static void serializeCollection(List<Employee> l) {
        try {
            FileOutputStream serialize = new FileOutputStream("path\\employeeList.ser");
            ObjectOutputStream out = new ObjectOutputStream(serialize);
            out.writeObject(l);
            out.close();
            serialize.close();
            System.out.println("Collection serialized");

        } catch (IOException i) {
            i.getMessage();
        }
    }

    public static void deserializeCollection() {

        try {
            FileInputStream deserialize = new FileInputStream("path\\mployeeList.ser");
            ObjectInputStream in = new ObjectInputStream(deserialize);
            ArrayList list = (ArrayList) in.readObject();
            in.close();


        } catch (IOException i) {
            i.getMessage();
            System.out.println("The filename is not correct");
        } catch (ClassNotFoundException a) {
            a.getCause();
        }


    }


}
