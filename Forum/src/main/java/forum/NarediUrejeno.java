/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forum;

/**
 *
 * @author student
 */
import java.io.*;
public class NarediUrejeno {
    public static void uredi() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Rac4\\uporabnik.txt"));
        String[] vsiUporabniki = new String[500];
        String uporabnik = br.readLine();
        int x = 0;
        while(uporabnik != null){
            String mail = br.readLine();
            String geslo = br.readLine();
            vsiUporabniki[x] =  uporabnik + ";" + mail + ";" + geslo;
            x++;
            uporabnik = br.readLine();
        }
        br.close();
        String[] uporabniki = new String[x];
        for(int i = 0; i < x; i++){
            uporabniki[i] = vsiUporabniki[i];
        }
        
        boolean zamenjane;
        for (int i = 0; i < uporabniki.length - 1; i++){
            zamenjane = false;
            for (int j = 0; j < uporabniki.length - i - 1; j++){
                if (uporabniki[j].compareToIgnoreCase(uporabniki[j + 1]) > 0){
                    String temp = uporabniki[j];
                    uporabniki[j] = uporabniki[j + 1];
                    uporabniki[j + 1] = temp;
                    zamenjane = true;
                }
            }
            if (!zamenjane) {
                break;
            }
        }
        
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Rac4\\upUrejeni.txt"));
        for(int i = 0; i < uporabniki.length; i++){
            String[] razdeli = uporabniki[i].split(";");
            for(int j = 0; j < razdeli.length; j++){
                pw.println(razdeli[j]);            
            }
        }
        pw.close();
    }
    
    public static void main(String[] args) throws IOException{
        uredi();
    }
}
