package org.example.bridge;

public class Main {
//Client
    public static void main(String[] args) {

        // Create renderers
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        System.out.println("=== Vector Renderer ===");

        Shape circle = new Circle(10, vectorRenderer);
        Shape square = new Square(5, vectorRenderer);

        circle.draw();
        square.draw();

        System.out.println();

        System.out.println("=== Raster Renderer ===");

        Shape rasterCircle = new Circle(10, rasterRenderer);
        Shape rasterSquare = new Square(5, rasterRenderer);

        rasterCircle.draw();
        rasterSquare.draw();
    }
}