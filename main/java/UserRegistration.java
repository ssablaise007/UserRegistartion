import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * Class for User Validation ....
 */
public class UserRegistration {
    Scanner sc  = new Scanner(System.in);
    /**
     *  Method for Checking FirstName
     */
    public void firstName(){
        System.out.print("Enter First Name: " );
        String FirstName = sc.next();
        boolean result = Pattern.matches("[A-Z][a-z]{2,}",FirstName);
        if (result)
            System.out.println("Success");
        else
            System.out.println("please enter valid first name ");
    }

}
