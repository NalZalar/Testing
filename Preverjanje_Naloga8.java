import java.io.*;
public class Preverjanje_Naloga8 {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(
            new FileReader("C:\\Rac4\\Podatki.txt")
        );

        String vrstica;
        int stBesed = 0;

        while ((vrstica = br.readLine()) != null) {
            String[] besede = vrstica.trim().split("\\s+");
            stBesed += besede.length;
        }

        br.close();

        System.out.println("V besedilu je " + stBesed + " besed.");
    }
}
