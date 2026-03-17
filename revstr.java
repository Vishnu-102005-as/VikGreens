import java.util.Scanner;
public class revstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();
        for(int i = sent.length()-1;i>=0;i--){
            System.out.print(sent.charAt(i));
        }
    }
}
