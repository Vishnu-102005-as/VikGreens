import java.util.Scanner;
public class swap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("The Values "+x+" and "+y);
    }
}
