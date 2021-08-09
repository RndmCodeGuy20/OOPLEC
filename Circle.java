class Operation {
    public int square(int n) {
        return n * n;
    }
}

public class Circle {
    Operation Op = new Operation();

    double pi = 3.1415;

    public double Area(int rad) {
        int rsq = Op.square(rad);
        return pi*rsq;
    }

    public static void main(String[] args) {
        Circle cir = new Circle();

        double res = cir.Area(5);
        System.out.println(res);
    }
}