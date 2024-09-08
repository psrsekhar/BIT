package edu.bit.training;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyRunner {
    public static void main(String[] args) {
        Class<?> myClass;
        try {
            myClass = Class.forName("edu.bit.training.Main");
            try {
                Method method = myClass.getMethod("main", String[].class);
                try {
                    method.invoke(null, (Object) new String[] {});
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
