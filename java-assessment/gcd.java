import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int x = sc.nextInt();
        System.out.print("Enter the First Number : ");
        int y = sc.nextInt();
        while(y!=0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println("The GCD is "+x);
    }
}
