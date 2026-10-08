import java.io.*;

import javax.imageio.IIOException;
public class Preverjanje_Naloga1 {
    public static void kodiraj() throws IOException{
        FileReader fr = new FileReader("C:\\Rac4\\Osnovna-datoteka.txt");
        FileWriter fw = new FileWriter("C:\\Rac4\\Kodirana-datoteka.txt");
        int znak = fr.read();
        while(znak != -1){
            if((znak >= 'A' && znak <= 'Z') || (znak >= 'a' && znak <= 'z')){
                fw.write(znak - 5);
            }
            else{
                fw.write(znak);
            }
            znak = fr.read();
        }
        fr.close();
        fw.close();
    }
    public static void odkodiraj() throws IOException{
        FileReader fr = new FileReader("C:\\Rac4\\Kodirana-datoteka.txt");
        FileWriter fw = new FileWriter("C:\\Rac4\\Osnovna-datoteka.txt");
        int znak = fr.read();
        while(znak != -1){
            if((znak >= 'A' && znak <= 'Z') || (znak >= 'a' && znak <= 'z')){
                fw.write(znak + 5);
            }
            else{
                fw.write(znak);
            }
            znak = fr.read();
        }
        fr.close();
        fw.close();
    }
    public static void main(String[] args) throws IOException{
        kodiraj();
    }
}
