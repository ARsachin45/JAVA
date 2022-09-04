import java.util.Scanner;
public class Oddoreven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if( a%2 == 0) {
            System.out.println("The given number is Even");
            System.out.println("TRUE");
        }
            else{
            System.out.println("The given number is Odd");
            System.out.println("FALSE");
        }
        }
    }