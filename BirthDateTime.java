import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int year= SafeInput.getRangedInt(in, "Enter your birth year: ", 1950, 2015);
        int month= SafeInput.getRangedInt(in, "Enter your birth month: ", 1, 12);
        int maxDay = 31;
        switch (maxDay){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDay=31;
                break;
            case 2:
                maxDay=29;
                break;
            default: maxDay=30;
            break;
        }
        int day= SafeInput.getRangedInt(in,"Enter your birth date: ", 1, maxDay);
        int hours= SafeInput.getRangedInt(in,"Enter the hour you were born: ", 1,24);
        int minutes= SafeInput.getRangedInt(in,"Enter the minutes you were born: ",0,59);

        System.out.println("Your birth date and time are: "+year+"/"+month+ "/" +day+" "+hours+ ":" +minutes);

    }
}
