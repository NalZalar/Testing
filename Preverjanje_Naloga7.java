import java.io.*;
public class Preverjanje_Naloga7{
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Rac4\\Naloga7.txt"));
        for(int i = 1; i <= 100; i++){
            pw.println(i + ",");
        }
        pw.close();
    }
}