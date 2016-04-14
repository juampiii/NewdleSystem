package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class ValidatorUtil {
 
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String PATTERN_PASSWORD = 
            "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%=]).{6,20})";
 
    /**
     * Validate given email with regular expression.
     * 
     * @param email
     *            email for validation
     * @return true valid email, otherwise false
     */
    public static boolean validateEmail(String email) {
 
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
 
    }
    
    public static boolean validatePassword(String password){
    	
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_PASSWORD);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
 
    }
 
}