import java.util.*;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int i = 1;
        System.out.println("Factors of number "+num+ " are:");
        while(i<=num){
            if(num%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
        scanner.close();
    }
}
