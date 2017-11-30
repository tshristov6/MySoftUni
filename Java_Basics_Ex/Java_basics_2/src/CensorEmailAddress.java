import java.util.Scanner;

public class CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = scan.nextLine();
        int index = email.indexOf('@');
        String text = scan.nextLine();
        String replacement = "";
        for (int i = 0; i < index; i++){
            replacement += "*";
        }
        text = text.replace(email, replacement+email.substring(index));
        System.out.println(text);
    }
}
