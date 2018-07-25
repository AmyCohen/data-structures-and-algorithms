package day12;

public class Pet {

    public String name;
    public String sound;

    public Pet(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name + " " + this.sound;
    }

    public String sound() {
        return "";
    }
}


