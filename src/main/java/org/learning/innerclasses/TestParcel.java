package org.learning.innerclasses;

class Parcel4 {
    private class PContents implements Contents {
        private int i;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;
        private PDestination(String whereTo){
            label = whereTo;
        }
        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
       Parcel4 p = new Parcel4();
       Contents c = p.contents();
       Destination d = p.destination("Tasmania");
       //Illegal -- can't access private class:
        //! Parcel4.PContents pc = p.new PContents();
    }
}
