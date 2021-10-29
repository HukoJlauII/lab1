import java.util.*;

public class rndmas {
    public static int fact(int n){
        int res=1;
        for(int f=2;f<=n;f++)
        res*=f;
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n+"! = "+fact(n));
    }
}
