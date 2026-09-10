public class Vaja1 {
    public static int naloga1(int n){
        if(n == 1 || n == 2){
            return 2;
        }
        return naloga1(n - 2) * naloga1(n - 1) - 1;
    }
    public static int naloga2(int n){
        if(n == 1){
            return 2;
        }
        return 3 * naloga2(n - 1) +2;
    }
    public static int naloga3(int n){
        if(n == 1){
            return 1;
        }        
        if(n == 2){
            return 2;
        }
        return naloga3(n-1) * 2 + naloga3(n - 2);
    }
    public static int naloga4(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 4;
        }
        return naloga4(n - 1) + 2;
    }

    public static void main(String[] args){
        System.out.println("Naloga 1: " + naloga1(5));
        System.out.println("Naloga 2: " + naloga2(5));
        System.out.println("Naloga 3: " + naloga3(5));
        System.out.println("Naloga 4: " + naloga4(5));
    }
}