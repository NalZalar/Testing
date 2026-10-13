import java.io.*;
import java.nio.charset.Charset;
public class Naloga2{
    public static void main(String[] args) throws IOException{  
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("nal2_text.txt") , Charset.forName("UTF-8")));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Rac4\\Domače naloge\\nal2_rezultat.txt"));
        int znak = br.read();
        int stevecZnakov = 0;
        while (znak != -1){
            stevecZnakov++;
            znak = br.read();
        }
        pw.write("Število znakov je " + stevecZnakov);
        br.close();
        pw.close();
    }
}
