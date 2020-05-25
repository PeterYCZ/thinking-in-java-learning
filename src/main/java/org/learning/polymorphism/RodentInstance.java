package org.learning.polymorphism;

abstract class Rodent {
    public String test(){
        return "test Instance ";
    }
}

public class RodentInstance {
    /*
    不包含抽象方法的抽象类不能实例化
    Rodent rodent = new Rodent();
    
     */
}
