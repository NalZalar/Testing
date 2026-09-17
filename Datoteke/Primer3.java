import java.io.*;
public class Primer3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Rac4\\Datoteke\\a.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Rac4\\Datoteke\\c.txt"));
        String vrstica = br.readLine();
        while(vrstica != null){
            System.out.println(vrstica);
            pw.println(vrstica);
            vrstica = br.readLine();
        }
        br.close();
        pw.close();
    }
}