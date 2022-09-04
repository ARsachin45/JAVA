import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        String a = "";
        for (int i = n-1;i>=0;i--) {
            a += str.charAt(i);
        }
        if(a.equals(str)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not");
        }
    }
}
