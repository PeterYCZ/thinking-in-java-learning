package org.learning.innerclasses;

public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            //Pass constructor argument
            @Override
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
