import java.io.FileInputStream;

public class StreamsRead {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("Test_File.txt");

            int i;

            while ((i = f1.read()) != -1) {
                System.out.print((char) i);
            }
            f1.close();

            System.out.println("\n\nDone Successfully!!!");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
