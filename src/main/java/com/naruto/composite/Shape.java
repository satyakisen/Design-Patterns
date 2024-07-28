package com.naruto.composite;

public class Shape implements Component {
    private final String type;

    public Shape() {
        this.type = "";
    }

    public Shape(String type) {
        this.type = type;
    }

    @Override
    public void render() {
        System.out.println("Rendering shape of type: " + type);
    }
}
