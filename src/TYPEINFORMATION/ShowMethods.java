package TYPEINFORMATION;

import java.lang.reflect.*;
import java.util.*;
import java.util.regex.Pattern;

public class ShowMethods {
    private static String usage = "usage:\n" +
            "ShowMethods qualified.class.name word\n" +
            "To show all methods in class or:\n" +
            "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor<?>[] ctors = c.getConstructors();

         if (args.length == 1) {
                for (Method method : methods) {
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                }
                for (Constructor<?> ctor : ctors) {
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                }
            } else {
                for (Method method : methods) {
                    if (method.toString().contains(args[1])) {
                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                    }
                }
                for (Constructor<?> ctor : ctors) {
                    if (ctor.toString().contains(args[1])) {
                        System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                    }
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }
    }
}
