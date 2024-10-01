package hw7;

import java.io.Serializable;

abstract class Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void speak();
}
