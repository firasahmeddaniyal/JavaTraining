import java.util.*;
public class countvowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int count =0;
        int vow = 0;
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i)=='a' || n.charAt(i)=='e' || n.charAt(i)=='i' || n.charAt(i)=='o' || n.charAt(i)=='u'){
                count++;
            }
        }System.out.println(count);
    }    
}
