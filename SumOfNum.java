import java.util.*;
public class SumOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number : ");
        while(true){
            int num = scanner.nextInt();
            if(num == 0){
                System.out.println("The user enters 0");
                break;
            }
            else{
                sum+=num;
            }
        }
        System.out.println("The sum of all numbers : "+sum);
        scanner.close();
    }
}
