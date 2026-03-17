import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to Check : ");
        int num = sc.nextInt();
        boolean check = true;
        for(int i = 2; i <= (num/2);i++){
            if((num%i)==0){
                check = false;
                break;
            }
        }
        if(check == true){
            System.out.println(num+" is a Prime Number!");
        }
        else{
            System.out.println(num+" is Not a Prime Number!");
        }
    }
}
