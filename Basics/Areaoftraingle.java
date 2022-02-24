import java.util.Scanner;

public class Areaoftraingle {
    public static void main(String[] args){
        float Area,base,Height;
        System.out.println("Enter the Base and Height of the Triangle: ");
        Scanner sc=new Scanner(System.in);
        base=sc.nextFloat();
        Height=sc.nextFloat();
        Area=base*Height*0.5f;
        System.out.println("Area is: "+Area);
    }
}
