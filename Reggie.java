import java.util.Scanner;
public class Reggie {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        SafeInput.getRegExString(in,"Enter your SSN (xxx-xx-xxxx): ","^\\d{3}-\\d{2}-\\d{4}$");
        SafeInput.getRegExString(in,"Enter your M number (Mxxxxx): ","^(M|m)\\d{5}$");
        SafeInput.getRegExString(in,"Menu Choice (O-Open, S-Save, V-view, Q-quit): ", "^[OoSsVvQq]$");
    }
}
