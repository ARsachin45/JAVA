import java.util.*;

public class uppercaseandlowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = "";
        for (int i = 0;i < a.length();i+=2){
            b+=(char)(a.charAt(i)-32);
            b+=a.charAt(i+1);
            }
            System.out.println(b);
            sc.close();

        }
    
    }
