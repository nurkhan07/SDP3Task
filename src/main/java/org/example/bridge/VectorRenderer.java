package org.example.bridge;

public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println(
                "Drawing circle using Vector Renderer. Radius: " + radius
        );
    }

    @Override
    public void renderSquare(double side) {
        System.out.println(
                "Drawing square using Vector Renderer. Side: " + side
        );
    }
}