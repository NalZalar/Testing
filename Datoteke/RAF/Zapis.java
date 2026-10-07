import java.io.*;
public class Zapis{
    private int maticnaStevilka;
    private String telefon;
    private String naziv;
    private int delovnaDoba;
    public Zapis(int a, String f, String l, int b){
        maticnaStevilka=a;
        telefon=f;
        naziv=l;
        delovnaDoba=b;
    }
    public Zapis(){
        maticnaStevilka=0;
        telefon="";
        naziv="";
        delovnaDoba=0;
    }
    public int getMaticnaStevilka(){
        return maticnaStevilka;
    }
    public String getTelefon(){
        return telefon;
    }
    public String getNaziv(){
        return naziv;
    }
    public int getDelovnaDoba(){
        return delovnaDoba;
    }
    public void beri(RandomAccessFile datoteka) throws IOException{
        maticnaStevilka=datoteka.readInt();
        telefon=datoteka.readUTF();
        naziv=datoteka.readUTF();
        delovnaDoba=datoteka.readInt();
        // iz datoteke prebere en zapis
    }
    public void pisi(RandomAccessFile datoteka) throws IOException{
        // na datoteko zapise en zapis
        datoteka.writeInt(maticnaStevilka);
        datoteka.writeUTF(telefon);
        datoteka.writeUTF(naziv);
        datoteka.writeInt(delovnaDoba);
    }
    public void izpisNaZaslon(){
        System.out.println("Matična "+maticnaStevilka+ "\nTelefon "+telefon+
        "\nNaziv "+naziv+ "\nDelovna doba "+delovnaDoba);
        System.out.println();
    }
    public int velikost(){
        // vrne velikost zapisa
        return 4+telefon.length()+2+naziv.length()+2+4;
    }
} 