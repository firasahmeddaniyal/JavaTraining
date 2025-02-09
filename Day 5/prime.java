import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=1; i<=n/2; i++){
            if(n%i == 0)
                count+=1;
            }
            if(count==1){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
    }

}
