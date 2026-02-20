//version 3.0
//author pranat kheria
//UseCase-1 : Welcome Page
//Usecase-2 : Palindrome Check using Two pointer method
//UseCase-3 Palindrome check using string reversal method
import java.lang.String;
public class PalindromeCheckerApp{
    //USE CASE - 3
    static void checkpalindromeUsecase3(String org){
        int j = org.length();
        int k=0;
        char[] orgArray = org.toCharArray();
        char[] reverseArray = new char[j];
        for (int i=org.length()-1;i>=0;i--){
            reverseArray[k] = orgArray[i];
            k++;
        }
        StringBuilder reverseString = new StringBuilder();
        for (char element : reverseArray){
            reverseString.append(element);
        }
        String reverseString_ = reverseString.toString();
        if (reverseString_.equals(org)){
            System.out.println("is it a palindrome-True");
            return;
        }
        else{
            System.out.println("is it a palindrome-False");
        }

    }
    //USE CASE - 2
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
        //USE CASE - 2
        System.out.println("USE CASE - 2");
        checkPalindrome(org);
        //USE CASE - 3
        System.out.println("USE CASE - 3");
        checkpalindromeUsecase3(org);
    }
}