import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a,b,c,d;
    a = s.nextInt();
    b = s.nextInt();
    c = s.nextInt();
    d = (int)(Math.random() *100);
    System.out.println(Math.max(a,b));
    System.out.println(Math.min(a,b));
    System.out.println(Math.abs(c)); 
    System.out.println(Math.sqrt(a));
    System.out.println(Math.sqrt(b));
    System.out.println(Math.random());
    System.out.println(d);

    }
}
