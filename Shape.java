public class Shape {
    public void draw() {
        System.out.println("drawing!");
    }
    public static void main(String[] args) {
      
    Shape shape;

    shape = new rectangle();
    shape.draw();

    shape = new triangle();
    shape.draw();
    
    shape = new circle();
    shape.draw();
    }
    
}

class rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing Rectangle!");
    }
}

class circle extends Shape {
    public void draw() {
        System.out.println("Drawing Circle!");
    }

}

class triangle extends Shape {
    public void draw() {
        System.out.println("Drawing Triangle!");
    }
}