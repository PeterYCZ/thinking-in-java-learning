package org.learning.innerclasses;

//Inheriting an inner class

class WithInner {
    class Inner {
        Inner(int x){

        }
    }
}

public class InheritInner extends WithInner.Inner{
    InheritInner(WithInner wi,int x){
        wi.super(x);
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi,1);
    }
}
