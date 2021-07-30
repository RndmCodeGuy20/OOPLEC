public class ExtMain {
    public void run(){
        System.out.println("running");
    }

}

class MAIN extends ExtMain{
    public static void main(String[] args) {
        ExtMain rObject = new ExtMain();
        rObject.run();
    }
}
