import java.util.Scanner;
public class lartwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        if(num_1<num_2){
            System.out.println(num_2+" is the Largest");
        }
        else{
            System.out.println(num_1+" is the Largest");
        }
    }
}