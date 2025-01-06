import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int og_num = num;
        int rev_num = 0;
        while(num!=0){
            int digit = num%10;
            rev_num = rev_num *10+digit;
            num/=10;
        }
        if(og_num==rev_num){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
        scanner.close();
    }
}
