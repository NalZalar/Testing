public class Drevo{
    public static void drevo(int n , Zelva z , double korak){
        StdDraw.setPenRadius(n * 0.0001);
        z.naprej(korak);
        if(n == 0){
            return;
        }
        Zelva leva = new Zelva(z.X , z.Y , z.fi - 120);
        Zelva desna = new Zelva(z.X , z.Y , z.fi + 120);
        Zelva srednja = new Zelva(z.X , z.Y , z.fi);
        drevo(n - 1 , leva , korak * (1 / 3));
        drevo(n - 1 , desna , korak * (1 / 3));
        drevo(n - 1 , srednja , korak * (1 - (1 / 3));
    }
    public static void main(String[] args){
        Zelva z = new Zelva(0.5 , 0 , 90);
        int n = 10;
        double korak = 0.3;
        drevo(n , z , korak);
    }
}