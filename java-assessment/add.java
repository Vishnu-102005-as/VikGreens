import java.util.Scanner;
public class add {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X : ");
        int x = sc.nextInt();
        System.out.print("Enter Y : ");
        int y = sc.nextInt();
        System.out.println("X + Y = "+(x+y));
    }
}