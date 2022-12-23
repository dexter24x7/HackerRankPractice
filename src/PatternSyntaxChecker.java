import java.util.Scanner;

class PatternSyntaxChecker{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
//MyRegex class
class MyRegex{
//    String pattern ="(\\d{1,3})[.](\\d{1,3})[.](\\d{1,3})[.](\\d{1,3})";
    String pattern ="^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9]).){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])$";
}