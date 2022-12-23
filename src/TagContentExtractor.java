import java.util.*;
import java.util.regex.*;

    public class TagContentExtractor{
        public static void main(String[] args){

            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
            while(testCases>0){
                String line = in.nextLine();
                //Write your code here
                int flag=0;
                Pattern pat = Pattern.compile("<(.+)>([^<>]+)</\\1>");
                Matcher mat = pat.matcher(line);
                while(mat.find()) {
                    System.out.println(mat.group(2));
                    flag++;
                }
                if (flag==0) System.out.print("None");
                testCases--;
            }
        }
}
