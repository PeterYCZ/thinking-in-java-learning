package org.learning.innerclasses;

//Nesting a class within a scope.

public class Parcel6 {
    private void internalTracking(boolean b) {
        if(b) {
            class TrackingSlip {
                private String id;
                TrackingSlip(String s) {
                    id = s;
                }
                String getSlip() {
                    return id;
                }
            }
        }
    }

    //Can't use it here! Out of scope
    //! TrackingSlip ts = new TrackingSlip("slip")
    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
