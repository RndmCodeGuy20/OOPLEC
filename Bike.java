public class Bike {
    int speed = 150;
    public static void main(String[] args) {
        Bike objBike = new honda();
        System.out.println(objBike.speed);
    }
}

class honda extends Bike{
    int speed = 170;
}