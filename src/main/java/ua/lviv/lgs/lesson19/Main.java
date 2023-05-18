package ua.lviv.lgs.lesson19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import static ua.lviv.lgs.lesson19.Methods.deserializeCollection;
import static ua.lviv.lgs.lesson19.Methods.serializeCollection;

public class Main {
    public static void main(String[] args) {
//        Employee test = new Employee();
//        test.setId(123);
//        test.setName("Sasha");
//        test.setSalary(5500);
//        serialize(test);
//
//        deserialize();
//        System.out.println(deserialize().getId());
//        System.out.println(deserialize().getName());
//        System.out.println(deserialize().getSalary());

//        ArrayList<Employee> list = new ArrayList<>();
//        Employee test1 = new Employee();
//        test1.setName("Olia");
//        test1.setSalary(5.5);
//        test1.setId(1);
//
//        Employee test2 = new Employee();
//        test2.setName("Ivan");
//        test2.setSalary(5.5);
//        test2.setId(2);
//
//        Employee test3 = new Employee();
//        test3.setName("Ania");
//        test3.setSalary(5.5);
//        test3.setId(3);
//
//        list.add(test1);
//        list.add(test2);
//        list.add(test3);
//
//        System.out.println(list);
////
//        serializeCollection(list);
//
deserializeCollection();

    }
}
