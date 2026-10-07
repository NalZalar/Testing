import java.io.*;
public class UrediZapise{
    public static void main(String[] args) throws IOException{
        /*Zapis x1 = new Zapis(1 , "111111111111" , "Učitelj  1" , 30);
        Zapis x2 = new Zapis(2 , "222222222222" , "Učitelj  2" , 31);
        Zapis x3 = new Zapis(3 , "333333333333" , "Učitelj  3" , 12);
        Zapis x4 = new Zapis(4 , "444444444444" , "Učitelj  4" , 36);
        RandomAccessFile r = new RandomAccessFile("Zapisi.dat" , "rw");
        x1.pisi(r);
        x2.pisi(r);
        x3.pisi(r);
        x4.pisi(r);
        System.out.println("Izračunana velikost " + x1.velikost());
        System.out.println("Dat. kazalec je na " + r.getFilePointer());
        r.seek(35);
        Zapis x5 = new Zapis();
        x5.beri(r);
        x5.izpisNaZaslon();*/
        RandomAccessFile r = new RandomAccessFile("Zapisi.dat" , "r");
        long dolzinaDat = r.length();
        int dolzinaZapisa = 35;
        Zapis[] vsi = new Zapis[(int)(dolzinaDat/dolzinaZapisa)];
        for(int i = 0; i < vsi.length; i++){
            Zapis y = new Zapis();
            y.beri(r);
            vsi[i] = new Zapis(y.getMaticnaStevilka() , y.getTelefon() , y.getNaziv() , y.getDelovnaDoba());
            vsi[i].izpisNaZaslon();
            System.out.println();
        }
        for(int i = 1; i < vsi.length; i++){
            for(int j = 0; j < vsi.length - 1; j++){
                if(vsi[j].getDelovnaDoba() < vsi[j +1].getDelovnaDoba()){
                    Zapis temp = vsi[j];
                    vsi[j] = vsi[j + 1];
                    vsi[j + 1] = temp;
                }
            }
        }
        System.out.println("Po sortiranju:");
        for(int i = 0; i < vsi.length; i++){
            vsi[i].izpisNaZaslon();
            System.out.println();
        }
    }
}
