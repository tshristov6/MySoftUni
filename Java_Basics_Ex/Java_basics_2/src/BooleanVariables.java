import java.util.Scanner;

public class BooleanVariables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean boolVar = Boolean.parseBoolean(scan.nextLine());
        if (boolVar){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
