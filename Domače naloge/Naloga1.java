import java.io.*;
public class Naloga1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Rac4\\Domače naloge\\nal1_stevila.txt"));
        String vrstica = br.readLine();
        double vsota = 0;
        int stevec = 0;
        while(vrstica != null){
            int stevilo = Integer.parseInt(vrstica);
            if(stevilo > 0){
                vsota += stevilo;
                stevec++;
            }
            vrstica = br.readLine();
        }
        br.close();
        System.out.println("Povprečna vrednost pozitivnih števil je: " + vsota / stevec);
    }
}
