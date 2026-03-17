import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fibonacci number : ");
        int num = sc.nextInt();
        int a = 0,b = 0,fibo = 1;
        if(num == 0)
            System.out.println("The Fibonacci is 0");
        else if(num == 1)
            System.out.println("The Fibonacci is 1");
        else{
            for(int i = 2;i <= num;i++){
                b = a + fibo;
                a = fibo;
                fibo = b;
            }
        }
        System.out.println("The Fibonacci of "+num+" is "+fibo);
    }
}
