import java.util.Scanner;
public class palicheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to check Palindrome : ");
        int num = sc.nextInt();
        int ori = num;
        int rem, rev = 0;
        while (num != 0) {
            rem = num % 10;
            rev = (rev*10)+rem;
            num = num / 10;
        }
        if (ori == rev) {
            System.out.println("The Number "+ori+" is Palindrome");
        }
        else{
            System.out.println("The Number "+ori+" is not Palindrome");
        }
    }
}
