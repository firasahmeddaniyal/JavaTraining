import java.util.*;
public class palindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String rev = "";
        for(int i=0; i<n.length(); i++){
            rev=n.charAt(i)+rev;
        }
        /*f(n.equals(rev)){
            System.out.println("Palidrone");
        }
        else{
            System.out.println("Not a palindrone");

        }*/
        System.out.println(n.equals(rev)? "palindrone":"not a paloindrone");
    }
}
