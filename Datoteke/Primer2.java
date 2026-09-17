import java.io.*;
public class Primer2 {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("C:\\Rac4\\Datoteke\\a.txt");
        FileWriter fw = new FileWriter("C:\\Rac4\\Datoteke\\b.txt");
        int c = fr.read();
        while(c != -1){
            System.out.println((char) c);
            fw.write(c);
            c = fr.read();
        }
        fr.close();
        fw.close();
    }
}