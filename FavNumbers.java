import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int favoriteInt= SafeInput.getInt(in, "What is your favorite integer?");
        double favoriteNum= SafeInput.getDouble(in, "What is your favorite number?");
        System.out.println("Your favorite integer is "+ favoriteInt);
        System.out.println("Your favorite number is "+favoriteNum);
    }

}
