import java.util.*;
public class pattsmallalphacross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(j+96)+"  ");
            }
        System.out.println();    
        }

    }
}
