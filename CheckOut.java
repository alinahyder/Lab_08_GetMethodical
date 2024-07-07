import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        double totalCost= 0;
        do {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the item price: ", 0.5, 10.0);
            totalCost= totalCost+itemPrice;
            System.out.printf("%-10s %-10s%n", "Item Price", "Total Cost");
            System.out.printf("%-10.2f %-10.2f%n", itemPrice, totalCost);
        }while (SafeInput.getYNConfirm(in, "Do you want to enter another item? (Y/N)"));
    }
}
