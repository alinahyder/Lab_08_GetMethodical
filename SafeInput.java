import java.util.Scanner;

public class SafeInput {
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt) {
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                int num = pipe.nextInt();
                pipe.nextLine();
                return num;
            } else {
                String trash;
                trash = pipe.nextLine();
                System.out.println("You entered " + trash);
                System.out.println("Please enter an integer.");
            }
        } while (true);

    }

    public static double getDouble(Scanner pipe, String prompt){
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                double num = pipe.nextDouble();
                pipe.nextLine();
                return num;
            } else {
                String trash;
                trash = pipe.nextLine();
                System.out.println("You entered " + trash);
                System.out.println("Please enter a number.");
            }
        } while (true);

    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){
        do {
            System.out.print("\n" + prompt + "["+low+ " - " +high+"]" + ": ");
            if (pipe.hasNextInt()) {
                int num = pipe.nextInt();
                pipe.nextLine();
                if (num>=low && num<=high){
                    return num;
                }
                else {
                    System.out.println("You entered " + num);
                    System.out.println("Please enter an integer between " +low+ " and " +high);
                }
            } else {
                String trash;
                trash = pipe.nextLine();
                System.out.println("You entered " + trash);
                System.out.println("Please enter an integer between " +low+ " and " +high);
            }
        } while (true);

    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){
        do {
            System.out.print("\n" + prompt + "["+low+ " - " +high+"]" + ": ");
            if (pipe.hasNextDouble()) {
                double num = pipe.nextDouble();
                pipe.nextLine();
                if (num>=low && num<=high){
                    return num;
                }
                else {
                    System.out.println("You entered " + num);
                    System.out.println("Please enter an number between " +low+ " and " +high);
                }
            } else {
                String trash;
                trash = pipe.nextLine();
                System.out.println("You entered " + trash);
                System.out.println("Please enter an number between " +low+ " and " +high);
            }
        } while (true);
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt){
        do {
            System.out.print("\n" + prompt + ": ");
            String userInput = pipe.nextLine();
            if (userInput.equalsIgnoreCase("Y")){
                return true;
            }
            else if (userInput.equalsIgnoreCase("N")){
                return false;
            }
            else {
                System.out.println("You entered "+userInput);
                System.out.println("Please enter Y/N");
            }

        } while (true);

    }
    public static String getRegExString(Scanner pipe, String prompt, String regExPattern){
        do {
            System.out.print("\n" + prompt + ": ");
            String userInput = pipe.nextLine();
            if (userInput.matches(regExPattern)){
                return userInput;
            }
            else {
                System.out.println("Invalid entry " +userInput);
            }

        }while (true);
    }

    public static void prettyHeader(String msg){
        for (int i = 0; i < 60; i++){
            System.out.print("*");
        }
        System.out.println("");

        for (int i=0; i<3; i++){
            System.out.print("*");
        }
        int numSpaces= (54-msg.length())/2;
        for (int i=0; i<numSpaces; i++){
            System.out.print(" ");
        }

        System.out.print(msg);

        numSpaces= (54-msg.length())/2;
        if (msg.length()%2==1){
            System.out.print(" ");
        }
        for (int i=0; i<numSpaces; i++){
            System.out.print(" ");
        }
        for (int i=0; i<3; i++){
            System.out.print("*");
        }
        System.out.println("");

        for (int i = 0; i < 60; i++){
            System.out.print("*");
        }
        System.out.println("");

    }

}
