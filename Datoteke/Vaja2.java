import java.io.*;
public class Vaja2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Rac4\\Datoteke\\clanek.txt"));
        FileWriter fw = new FileWriter("C:\\Rac4\\Datoteke\\stBesed.txt");
        String vrstica = br.readLine();
        int x = 0;
        while(vrstica != null){
            String [] besede =  vrstica.split(" ");  
            for(int i = 0; i < besede.length; i++){
                String beseda = besede[i];
                if(beseda.length() > 1){
                    if(beseda.charAt(beseda.length() - 1) == ',' || beseda.charAt(beseda.length() - 1) == '.' || beseda.charAt(beseda.length() - 1) == '!' || beseda.charAt(beseda.length() - 1) == '?'){
                        beseda = beseda.substring(0 , beseda.length() - 1);
                    }
                }
                if(beseda.equalsIgnoreCase("danes")){
                    x++;
                }
            }
            vrstica = br.readLine();
        }
        fw.write("Pojavitve besede \"danes\": " + x);
        br.close();
        fw.close();
    }
}
