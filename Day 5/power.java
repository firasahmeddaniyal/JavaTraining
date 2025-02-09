import java.util.*;
public class power {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Base :");
        int a = sc.nextInt();
        System.out.println("power :");
        int b = sc.nextInt();
        int ans = 1;
        for(int i=0; i<b; i++){
            ans*=a;

        }System.out.println(ans);

    }    
}

