public class ExtMain {
    public void run(){
        System.out.println("running");
    }
   
}
class Ext2 extends ExtMain{
    public void run2() {
        System.out.println("running 2");
    }
}
class MAIN extends ExtMain{
    public static void main(String[] args) {
        ExtMain rMain;
        rMain = new ExtMain();
        rMain.run();
        Ext2 rExt2 = new Ext2();
        rExt2.run2();
    }
}
