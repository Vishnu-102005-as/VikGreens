import java.util.Scanner;

public class simint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle : ");
        int pr = sc.nextInt();
        System.out.print("Enter the Rate : ");
        int ra = sc.nextInt();
        System.out.print("Enter the Time : ");
        int ti = sc.nextInt();
        double si = (pr*ra*ti)/100;
        System.out.println("Simple Interest is "+si);
    }
}
