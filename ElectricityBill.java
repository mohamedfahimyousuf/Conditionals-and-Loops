import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Total Units consumed: ");
        int units = scanner.nextInt();
        int bill_amount = 0;
        if(units<= 100){
            bill_amount = units * 5;
        }
        else if(units <= 200){
            bill_amount = units * 7;
        }
        else{
            bill_amount = units * 10;
        }
        System.out.println("The Bill amount is :"+bill_amount);
        scanner.close();
    }
}
