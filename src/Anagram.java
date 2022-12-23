import java.util.Scanner;

public class Anagram {

    //sorting function
    static char[] sort(char arr[]){

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                char tmp = 0;
                if (arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
//anagram function

    static boolean isAnagram(String a, String b) {
        //length check
        if(a.length()!= b.length())
            return false;
        // character array
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        int ind = 0;
        while (ind< arr1.length) {
           arr1[ind] = Character.toLowerCase(arr1[ind]);
           arr2[ind] = Character.toLowerCase(arr2[ind]);
           ind++;
        }

        //sorting the arrays
        System.out.println("Sorted Character Arrays:");
        arr1 = sort(arr1);
        System.out.println(arr1);
        arr2 = sort(arr2);
        System.out.println(arr2);

        boolean flag = true;

        for(int i=0; i<arr1.length; i++){
            if (arr1[i] != arr2[i]){
                flag = false;
                break;
            }
        }
        return flag;
    }
// main function

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
