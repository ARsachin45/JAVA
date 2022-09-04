import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int n,n1,n2,n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n = 110;
        System.out.println(n1);
        System.out.println(n2);
        for (int i=0;i<n;i++) {
            n3 = n1+n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
    
}
