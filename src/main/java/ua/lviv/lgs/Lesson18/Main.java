package ua.lviv.lgs.Lesson18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //create method that would put any Object to list. The second argument is raw type list
    static void method (Object obj, List list){
        list.add(obj);

    }

    public static void main(String[] args) {
        /*
        generic in method argument is not defined. When list is created, any generic provided
        is considered to be ok, because Integer is an Object. The arguments in the method satisfy conditions
        */
        List<Integer> list = new ArrayList<>();
        method("str", list);
        method(3, list);

        System.out.println(list);





    }




}

