import java.io.*;
public class Naloga3{
    public static void main(String[] args) throws IOException{
        if(args.length < 1){
            System.out.println("Podajte ime datoteke!");
            return;
        }
        String imeDatoteke = args[0];
        try {
            BufferedReader br = new BufferedReader(new FileReader(imeDatoteke));
            String vrstica = br.readLine();
            int vsota = 0;
            while(vrstica != null){
                int stevilo = Integer.parseInt(vrstica);
                vsota += stevilo;
                vrstica = br.readLine();
            }
            System.out.println("Vsota števil je " + vsota);
            br.close(); 
        }
        catch (Exception e) {
            System.out.println("Datoteka ne obstaja!");
        }
    }
}
