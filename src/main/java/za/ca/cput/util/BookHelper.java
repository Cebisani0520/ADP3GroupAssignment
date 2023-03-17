/** BookHelper.java
 * This is a Helper Class
 * This class would have all the functionality & methods
 * Cebisani Lamani (219104409)
 *  11 March 2023 */
package za.ca.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class BookHelper {

    public static String generateISBN(){
        return UUID.randomUUID().toString();
    }
    public static boolean isNullOrEmpty(String str){
        if(str == null || str.isEmpty()){
            return true;
        }
        else return false;
    }

    public static boolean isLessThanZero(double price){
        if(price <= 0.0){
            return true;
        }
        else return false;
    }

    public static boolean isEmailValid(String email){
        EmailValidator emailValidator = EmailValidator.getInstance();
        return emailValidator.isValid(email);
    }
}
