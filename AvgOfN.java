import java.util.*;
public class AvgOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter the numbers: ");
        double sum = 0;
        for(int i=1;i<=n;i++){
            double num = scanner.nextDouble();
            sum+=num;
        }
        
        double avg = sum/n;
        System.out.println("The average of n numbers are : "+avg);
        scanner.close();
    }
}
