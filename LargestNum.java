import java.util.*;
public class LargestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max =0;
        System.out.println("Enter a number : ");
        while(true){
            int num = scanner.nextInt();
            if(num == 0){
                System.out.println("User enters 0");
                break;
            }
            else if(num>max){
                max = num;
            }
        }
        System.out.println("The Largest Number: "+max);
        scanner.close();
    }
}
