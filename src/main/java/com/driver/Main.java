package com.driver;

public class Main {

    public static void main(String[] args) {

        B b = new B();
        String result1=b.meth();
        System.out.println(result1);
        String result2= b.meth();
        System.out.println(result2);

    }

    public static class  A{
        public static String meth()
        {
            return "Invoking method from class A";
        }

    }
    public static class B extends A{

        public static String meth() {
            return "Method is overridden in Extendend class B";
        }

    }
}