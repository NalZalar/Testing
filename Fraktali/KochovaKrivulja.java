public class KochovaKrivulja {
    public static void koch(int n, double korak, Zelva m){
        if (n==0){
            m.naprej(korak);
            return;
        }
        koch(n-1,korak,m);
        m.zavijLevo(60);
        koch(n-1,korak,m);
        m.zavijLevo(-120);
        koch(n-1,korak,m);
        m.zavijLevo(60);
        koch(n-1,korak,m);
    }
    public static void main(String[] args){
        Zelva z = new Zelva(0 , 0 , 0);
        koch(1000 , 0.0001 , z);
    }
}
