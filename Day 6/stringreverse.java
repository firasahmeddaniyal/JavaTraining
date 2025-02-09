import java.util.*;
public class stringreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String rev = "";
        for(int i=0; i<n.length(); i++){
            rev=n.charAt(i)+rev;
        }System.out.println(rev);

    }
}
