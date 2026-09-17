import java.io.*;
public class Vaja1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Rac4\\Datoteke\\clanek.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Rac4\\Datoteke\\ostevilcenClanek.txt"));
        String vrstica = br.readLine();
        int x = 1;
        while(vrstica != null){
            pw.println(x + "  " + vrstica);
            vrstica = br.readLine();
            x++;
        }
        br.close();
        pw.close();
    }
}