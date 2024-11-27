// Producto
interface Shape {
    void draw();
}

// Productos concretos
class Circle implements Shape {
    public void draw() {
        System.out.println("Dibujando un Círculo");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Dibujando un Rectángulo");
    }
}

// Creador
abstract class ShapeFactory {
    public abstract Shape createShape();
}

// Creadores concretos
class CircleFactory extends ShapeFactory {
    public Shape createShape() {
        return new Circle();
    }
}

class RectangleFactory extends ShapeFactory {
    public Shape createShape() {
        return new Rectangle();
    }
}

// Uso
public class Factory {
    public static void main(String[] args) {
        ShapeFactory factory = new CircleFactory();
        Shape shape = factory.createShape();
        shape.draw();
    }
}
