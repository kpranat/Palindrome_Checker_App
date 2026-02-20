//version 3.0
//author pranat kheria
//UseCase-1 : Welcome Page
//Usecase-2 : Palindrome Check using Two pointer method
//UseCase-3 Palindrome check using string reversal method
import java.lang.String;
import java.util.Stack;
public class PalindromeCheckerApp{
    //USE CASE - 5
    static void checkpalindromeUsecase5(String org){
        Stack <Character> stack = new Stack<>();
        for (char c : org.toCharArray()){
            stack.push(c);
        }
        for (char c : org.toCharArray()){
            if (!(stack.pop() == c)){
                System.out.println("is it a palindrome-False");
                return;
            }
        }
        System.out.println("is it a palindrome-True");


    }
    //USE CASE - 4;
    static void checkpalindromeUsecase4(String org){
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
        //USE CASE - 4
        String orgString_4 = "radar";
        System.out.println("USE CASE - 4");
        System.out.println("Input String-" + orgString_4);
        checkpalindromeUsecase4(orgString_4);
        //USE CASE - 5
        String orgString_5 = "noon";
        System.out.println("USE CASE - 5");
        System.out.println("INput String-" + orgString_5);
        checkpalindromeUsecase5(orgString_5);


    }
}