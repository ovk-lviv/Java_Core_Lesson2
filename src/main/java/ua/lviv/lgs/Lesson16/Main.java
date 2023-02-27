package ua.lviv.lgs.Lesson16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{

        Class parentClass = Mechanism.class;
        Class [] children = parentClass.getClasses();

        Class childClass = Forklift.class;
        Class c = childClass.getSuperclass();

        Method [] methods = parentClass.getMethods();

        Field [] fields = parentClass.getDeclaredFields();
        Field [] childFields = childClass.getDeclaredFields();

        Constructor[] parentConstructors = parentClass.getConstructors();

        Class [] interfaces = childClass.getInterfaces();

        Package packParent = parentClass.getPackage();
        Package packChild = childClass.getPackage();


        System.out.println(parentClass);
        System.out.println(Arrays.toString(children));
        System.out.println(c);
        System.out.println(Arrays.toString(methods));
        System.out.println(Arrays.toString(fields));
        System.out.println(Arrays.toString(childFields));
        System.out.println(Arrays.toString(parentConstructors));
        System.out.println(Arrays.toString(interfaces));
        System.out.println(parentClass.getSimpleName());
        System.out.println(childClass.getSimpleName());
        System.out.println(packChild);
        System.out.println(packParent);

    }
}
