package org.learning.exceptions;

class MyEcxeption extends Exception {
    public MyEcxeption() {

    }

    public MyEcxeption(String msg) {
        super(msg);
    }
}

public class FullConstructors {
    public static void f() throws MyEcxeption {
        System.out.println("Throwing MyException from f()");
        throw new MyEcxeption();
    }

    public static void g() throws MyEcxeption {
        System.out.println("Throwing MyException from g()");
        throw new MyEcxeption("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyEcxeption e) {
            e.printStackTrace(System.err);
        }

        try {
            g();
        } catch (MyEcxeption e) {
            e.printStackTrace(System.out);
        }
    }
}
