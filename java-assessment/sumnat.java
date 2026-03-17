import java.util.Scanner;
public class sumnat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N value : ");
        int num = sc.nextInt();
        double sum = (num*(num+1))/2;
        System.out.println("The Sum of Natural Numbers upto "+num+" is "+sum);
    }
}
