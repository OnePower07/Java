import java.util.Scanner;
import java.lang.*;

public class roots {
    public static void main(String[] args)
    {
        int a, b, c;
        System.out.println("Enter value of a,b,c: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        float r1 = (float) (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        float r2 = (float) ((-b- Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        System.out.println("Roots of the equation is: " + r1 + " " + r2);
    }
}
