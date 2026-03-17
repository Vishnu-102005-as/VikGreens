import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp = x;
        x = y;
        y = temp;
        System.out.println("The Values "+x+" and "+y);
    }
}
