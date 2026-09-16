public class KochovaKrivulja {
    public static void koch(int n, Zelva z, double korak){
        if (n==0){
            z.naprej(korak);
            return;
        }
        koch(n-1, z , korak);
        z.zavijLevo(60);
        koch(n-1, z , korak);
        z.zavijLevo(-120);
        koch(n-1, z , korak);
        z.zavijLevo(60);
        koch(n-1, z , korak);
    }
    public static void main(String[] args){
        int n = 8;
        double korak = 1/Math.pow(3 , n);
        Zelva z = new Zelva(0 , 0 , 0);
        koch(n , z , korak);
    }
}
