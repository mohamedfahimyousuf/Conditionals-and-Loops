import java.util.*;
class ProductAndSumOfDigits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int sum = 0;
        int product = 1;
        while(num>0){
            int rem = num%10;
            sum+=rem;
            product*=rem;
            num /= 10;
        }
        System.out.println("Sum of Digits : "+sum);
        System.out.println("Product of Digits : "+product);
        int sub = product - sum;
        System.out.println("Result (product - sum) : "+sub);
        scanner.close();
    }
}
