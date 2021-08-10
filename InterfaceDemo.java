public class InterfaceDemo {
    public static void main(String[] args) {
        Bank bank = new SBI();
        System.out.println("Rate of Interest : " + bank.rate());
    }
}

interface Bank {
    float rate();
};

class SBI implements Bank {
    public float rate() {
        return 6.5f;
    }
}

class PNB implements Bank {
    public float rate() {
        return 9.5f;
    }
}

/**
 * $class extends class $class implements interface $interface extends interface
 */