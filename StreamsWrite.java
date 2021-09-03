import java.io.FileOutputStream;

public class StreamsWrite {
    public static void main(String[] args) {
        try {

            FileOutputStream f1 = new FileOutputStream("Test_File.txt");

            // f1.write(001);
            String s = "Hello World! My name is Shantanu!";
            byte b[] = s.getBytes();
            f1.write(b);
            f1.close();
            System.out.println("Saved Successfully!!!");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}