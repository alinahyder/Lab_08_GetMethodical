public class CtoFTableDisplay {
    public static void main(String[] args){

        System.out.printf("%-10s %-10s%n", "Celsius", "Fahrenheit");
        for (double celsius=-100; celsius<=100; celsius++){
            double fahrenheit= CtoF(celsius);
            System.out.printf("%-10f %-10f%n", celsius, fahrenheit);
        }
    }
    public static double CtoF(double celsius){

        return (celsius*9/5) + 32;
    }
}
