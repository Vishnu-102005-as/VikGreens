import java.util.Scanner;

public class areaofc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area;
        int r;
        System.out.print("Enter the Radius : ");
        r = sc.nextInt();
        area = 3.14*(r*r);
        System.out.println("Area of "+r+" Circle is "+area);
    }
}
