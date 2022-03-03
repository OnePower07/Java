import java.sql.SQLOutput;
import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        int l,b,h;
        int volume,area;
        System.out.println("Enter length: ");
        System.out.println("Enter breadth: ");
        System.out.println("Enter height: ");
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        area=2*(l+b+h);
        volume=l*b*h;
        System.out.println("Area of the cuboid is: "+area);
        System.out.println("Volume of the cuboid is: "+volume);
    }
}
