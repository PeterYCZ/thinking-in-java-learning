package org.learning.enumerated;

public enum OzWitch {
    WEST("Miss Gulch"),
    NORTH("Glinda"),
    EAST("Wicked Witch of the East"),
    SOUTH("Good by inference");

    private String description;

    OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args){
        for(OzWitch witch : OzWitch.values()){
            System.out.println(witch + ": "+witch.getDescription());
        }
    }

}
