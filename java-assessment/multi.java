import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which table do you want to Multiply : ");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+(num*i));
        }
    }
}
