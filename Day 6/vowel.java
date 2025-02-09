import java.util.*;
public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        n=n.toLowerCase();
        String vow = "";
        String cons = "";
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u'){
                vow+=n.charAt(i);
            }else{
                cons+=n.charAt(i);
            }
        }System.out.println("Vowels are :"+vow);
        System.out.println("Consonants are :"+cons);
    }
}
