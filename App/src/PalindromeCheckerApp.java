//version 1.0
//author pranat kheria
//UseCase-1 : Welcome Page
import java.lang.String;
public class PalindromeCheckerApp{
    static void checkPalindrome(String org){

        int j = org.length()-1;
        char[] orgArray = org.toCharArray();
        for (int i =0 ; i<org.length()/2;i++){
            if (!(orgArray[i] == orgArray[j-i])){
                System.out.println("Is it a Palindrome-False");
                return;
            }
        }
        System.out.println("Is it a palindrome-True");
        return;
    }
    public static void main (String [] args){
        System.out.println("Welcome to Palindrome Checker Management System\nVersion 1.0\nSystem Initialized Successfully");
        String org  = "madam";
        System.out.println("Input String-" + org);
        checkPalindrome(org);
    }
}