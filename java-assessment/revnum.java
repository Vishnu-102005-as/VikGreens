import java.util.Scanner;
public class revnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to Reverse : ");
        int num = sc.nextInt();
        int ori = num;
        int rem, rev = 0;
        while (num != 0) {
            rem = num % 10;
            rev = (rev*10)+rem;
            num = num / 10;
        }
        System.out.println("The Reverse of the Number "+ori+" is "+rev);
    }
}
