import java.io.*;
public class Vaja{
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter("C:\\Rac4\\Datoteke\\Binarne-datoteke\\a.txt");
        pw.println("A");
        pw.close();

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Rac4\\Datoteke\\Binarne-datoteke\\a.dat"));
        dos.writeChar('A');
        dos.close();
    }
}