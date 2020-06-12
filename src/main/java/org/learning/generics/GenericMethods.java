package org.learning.generics;

public class GenericMethods {
    public <T> T f(T x, T y){
        System.out.println(x.getClass().getName() + " "+y.getClass().getName());
        return x;
    }

    public static void main(String[] args){
        GenericMethods gm = new GenericMethods();
        System.out.println("return type:"+gm.f(gm,1));
        System.out.println("return type:"+gm.f(1,2));
        gm.f("test",3);
    }

}
