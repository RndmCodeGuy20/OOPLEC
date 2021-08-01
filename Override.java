public class Override {
    public static void main(String[] args) {
        Child subChild = new Child(23, 32, 21);
        subChild.show();
    }
}

class Parent {
    int i, j;

    Parent(int a, int b) {
        i = a;
        j = b;
    }

    public void show() {
        System.out.println("i and j : " + i + " " + j);
    }
}

class Child extends Parent {
    int k;

    Child(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    public void show() {
        super.show();
        System.out.println("k : " + k);
    }
}