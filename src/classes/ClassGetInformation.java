package classes;

import java.util.Arrays;

public class ClassGetInformation {


    public static void main(String[] args) {
        String name = "java.lang.String";
        Class aClass;
        try {
            aClass = Class.forName(name);
            System.out.println(name + " getSimpleName(): " + aClass.getSimpleName());
            System.out.println(name + " getCanonicalName(): " + aClass.getCanonicalName());
            System.out.println(name + " getSuperclass(): " + aClass.getSuperclass());
            System.out.println(name + " getName(): " + aClass.getName());
//            System.out.println(name + " getPackageName(): " + aClass.getPackageName());
            System.out.println(name + " getPackage(): " + aClass.getPackage());
//            System.out.println(name + " getTypeName(): " + aClass.getTypeName());
            System.out.println(name + " getDeclaredFields(): " + Arrays.toString(aClass.getDeclaredFields()));

        } catch (ClassNotFoundException e) {
            System.out.println("No such class " + e);
            System.exit(0);
        }
    }
}
