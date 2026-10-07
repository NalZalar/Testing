import java.io.*;
public class RAF{
    public static void main(String[] args) throws IOException{
        RandomAccessFile r = new RandomAccessFile("raf.dat" , "rw");
        for(int i = 0; i < 100; i++){
            r.writeInt(i);
        }
        long dolzina = r.length();
        System.out.println(dolzina);
        long pozicija = r.getFilePointer();
        System.out.println(pozicija);
        r.seek(12);
        int vrednost = r.readInt();
        System.out.println(vrednost);
        r.close();
    }
}