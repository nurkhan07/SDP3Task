# Assignment #3 — Bridge Pattern

## Overview

This project demonstrates the **Bridge Design Pattern** using **Java 17**.

The project uses a **Shape–Renderer** system to demonstrate how abstraction and implementation can be separated and developed independently.

## Pattern Structure

### Abstraction
- `Shape`

### Refined Abstractions
- `Circle`
- `Square`

### Implementor
- `Renderer`

### Concrete Implementors
- `VectorRenderer`
- `RasterRenderer`

### Client
- `Main`

## Project Structure

```text
Assignment3_Bridge/
│
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── example/
│                   └── bridge/
│                       ├── Shape.java
│                       ├── Circle.java
│                       ├── Square.java
│                       ├── Renderer.java
│                       ├── VectorRenderer.java
│                       ├── RasterRenderer.java
│                       └── Main.java
│
├── UML/
│   └── bridge.puml
│
├── README.md
└── pom.xml