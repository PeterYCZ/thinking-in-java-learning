package org.learning.containers;

public class Groundhog {

    protected int number;
    public Groundhog(int n) {
        number = n;
    }
    @Override
    public String toString(){
        return "Groundhog #"+number;
    }
}
