package org.example.bridge;
//Abstraction
public abstract class Shape {

    protected Renderer renderer; //Bridge

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}