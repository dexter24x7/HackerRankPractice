import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        scan.close();
        if(s.length()==0) System.out.println("0");
        String[] strarr = s.split("[\\s!,?._'@]+");
        System.out.println(strarr.length);
        for (String str: strarr){
            System.out.println(str);
        }
    }
}

