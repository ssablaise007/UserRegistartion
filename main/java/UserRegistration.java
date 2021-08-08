import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * Class for User Validation ....
 */
public class UserRegistration {
    Scanner sc = new Scanner(System.in);

    /**
     * Method for Checking FirstName
     */

    public void firstName() {
        System.out.print("Enter First Name: ");
        String FirstName = sc.next();
        boolean result = Pattern.matches("[A-Z][a-z]{2,}", FirstName);
        if (result)
            System.out.println("Success");
        else
            System.out.println("please enter valid first name ");
    }

    /**
     * Method for Checking LastName
     */

    public void lastName() {
        System.out.print("Enter Last Name: ");
        String LastName = sc.next();
        Boolean result = Pattern.matches("[A-Z][a-z]{2,}", LastName);
        if (result)
            System.out.println("Success");
        else
            System.out.println("please enter valid last name ");
    }
    /**
     * Method for Checking EmailID
     */
    public void email() {
        System.out.print("Enter email ID: " );
        String Email = sc.next();
        Boolean result = Pattern.matches("^[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)$",Email);
        if (result)
            System.out.println("Success");
        else
            System.out.println("enter valid emailid");
    }
}