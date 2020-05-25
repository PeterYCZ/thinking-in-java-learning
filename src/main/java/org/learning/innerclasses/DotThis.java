package org.learning.innerclasses;

public class DotThis {
    private int x = 0;

    DotThis(int x){
        this.x = x;
    }

    void f() {
        System.out.println("DotThis.f() "+this.x);
    }
    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }
    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis(2);
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
