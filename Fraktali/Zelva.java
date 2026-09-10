public class Zelva{
    double X;
    double Y;
    int fi;

    public Zelva(double x1 , double y1 , int a){
        X = x1;
        Y = y1;
        fi = a;
    }

    public void zavijLevo(int kot){
        fi = fi + kot;
    }

    public void naprej(double d){
        double stariX = X;
        double stariY = Y;        
        X = stariX + d * Math.cos(Math.toRadians(fi));
        Y = stariY + d * Math.sin(Math.toRadians(fi));
        StdDraw.line(stariX , stariY , X , Y);
    }

    public static void main(String[] args){
        Zelva z = new Zelva(0.5 , 0.5 , 0);
        for(int i = 0; i < 10000; i++){
            z.naprej(0.01);
            z.zavijLevo((int) (Math.random()* 360));
        }
    }
}