//version 11.0
//author pranat kheria
//UseCase-1 : Welcome Page
//Usecase-2 : Palindrome Check using Two pointer method
//UseCase-3 : Palindrome check using string reversal method
//UseCase-4 : Character Array Based Palindrome Check
//UseCase-5 : Stack-Based Palindrome Checker
//UseCase-6 : Queue + Stack Based Palindrome Check
//UseCase-7 : Deque-Based Optimized Palindrome Checker
//UseCase-8 :Linked List Based Palindrome Checker
//UseCase-9 :Recursion Based Palindrome Checker
//Usecase-10 : Case-Insensitive & Space-Ignored Palindrome
//UseCase-11 : Object-Oriented Palindrome Service

import java.lang.String;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;

//USE CASE - 12
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare stack pop with original string
        for (char c : input.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }

        return true;
    }
}
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        // Compare first and last elements
        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }

        return true;
    }
}
class PalindromeContext {

    private PalindromeStrategy strategy;

    // Constructor Injection
    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    // Setter Injection (optional - dynamic change)
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    // Executes selected strategy
    public void executeStrategy(String input) {
        boolean result = strategy.isPalindrome(input);

        if (result) {
            System.out.println("is it a palindrome - true");
        } else {
            System.out.println("is it a palindrome - false");
        }
    }
}


//USE CASE - 11;
class PalindromeCheck{
    public String orgString;
    public PalindromeCheck(String a){
        orgString = a;
    }
    public void checkpalindromeUsecase11(){
        int start = 0;
        int end = orgString.length()-1;
        boolean isPalindrome = false;
        while (start<=end){
            if (orgString.charAt(start) != orgString.charAt(end)){
                isPalindrome = false;
                System.out.println("is it a palindrome - false");
                return;
            }
            start++;
            end--;
            isPalindrome = true;


        }
        if (isPalindrome){
            System.out.println("is a palindrome - true");
            return;
        }

    }
}
public class PalindromeCheckerApp{
    //USE CASE - 10
    static void checkpalindormeUsecase10(String org){
        String orgLowerCase = org.toLowerCase();
        String[] words= orgLowerCase.trim().split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (String words_ : words){
            builder.append(words_);

        }
        String normalizedResult = builder.toString();
        int start = 0; int end = normalizedResult.length()-1;
        boolean isPalindrome = false;
        while  (start<=end) {
            if (normalizedResult.charAt(start) != normalizedResult.charAt(end)) {
                System.out.println("is it a palindrome = false");
                isPalindrome = false;
                return;
            }
            start++;
            end--;
            isPalindrome = true;

        }
        if (isPalindrome){
            System.out.println("is it a palindrome - true");
            return;
        }



    }
    //USE CASE - 9
    static boolean checkpalindromeUsecase9(String org,int start,int last){
        if (start > last){
            return true;
        }
        if (org.charAt(start) == org.charAt(last)){
            return checkpalindromeUsecase9(org,start+1,last-1);
        }
        else{
            return false;
        }

    }
    //USE CASE - 8
    static void checkpalindromeUsecase8(String org){
        LinkedList <Character> list = new LinkedList<>();
        for (char c : org.toCharArray()){
                list.addLast(c);

        }
        boolean isPalindrome = false;
        while (list.size()>1){
            if (list.removeFirst() == list.removeLast()){
                isPalindrome = true;
            }
            else {
                isPalindrome = false;
            }
        }
        if (isPalindrome){
            System.out.println("is it a palindrome - true");

        }
        else{
            System.out.println("is it a palindrome - false");
        }

    }
    //USE CASE - 7
    static void checlpalindromeUsecase7(String org){
        Deque<Character> deque = new ArrayDeque<>();
        boolean isPalindrome = false;
        for (char c : org.toCharArray()){
            deque.add(c);
        }
        while (deque.size() > 1){
            if (deque.pollFirst() == deque.pollLast()){
                isPalindrome = true;

            }
            else{
                isPalindrome = false;
                break;
            }

        }
        if (isPalindrome){
            System.out.println("is it a palindrome - true");

        }
        else{
            System.out.println("is it a palindrome - false");
        }


    }
    //USE CASE - 6
    static void checkpalindromeUsecase6(String org){

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into both Queue and Stack
        for (char c : org.toCharArray()){
            queue.add(c);     // FIFO insertion
            stack.push(c);    // LIFO insertion
        }

        // Compare elements
        while (!queue.isEmpty()){
            if (queue.remove() != stack.pop()){
                System.out.println("Is it a Palindrome - False");
                return;
            }
        }

        System.out.println("Is it a Palindrome - True");
    }
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
        System.out.println("Input String-" + orgString_5);
        checkpalindromeUsecase5(orgString_5);
        // USE CASE - 6
        String orgString_6 = "level";
        System.out.println("\nUSE CASE - 6 (Queue + Stack Method)");
        System.out.println("Input String - " + orgString_6);
        checkpalindromeUsecase6(orgString_6);
        // USE CASE - 7
        String orgString_7 = "refer";
        System.out.println("USE CASE - 7");
        System.out.println("Input String-" + orgString_7);
        checlpalindromeUsecase7(orgString_7);
        // USE CASE - 8
        String orgString_8 = "level";
        System.out.println("USE CASE - 8");
        System.out.println("Input String-" + orgString_8);
        checkpalindromeUsecase8(orgString_8);
        // USE CASE - 9
        String s = "madam";
        System.out.println("USE CASE - 9");
        System.out.println("Input String-" + s);
        int start = 0;
        int last = s.length()-1;
        if(!checkpalindromeUsecase9(s,start,last)){
            System.out.println("is it a palindrome - false");
        }else{
            System.out.println("is it a palindrome - true");
        }
        // USE CASE - 10
        String orgString_10 = "A man a plan a canal Panama";
        System.out.println("USE CASE - 10");
        System.out.println("Input String-" + orgString_10);
        checkpalindormeUsecase10(orgString_10);
        //USE CASE - 11
        String orgString_11 = "racecar";
        System.out.println("USE CASE - 11");
        System.out.println("Input String-" + orgString_11);
        PalindromeCheck checkusecase11 = new PalindromeCheck(orgString_11);
        checkusecase11.checkpalindromeUsecase11();
        //USE CASE - 12
        System.out.println("USE CASE - 12");
        System.out.println("Strategy Pattern Demonstration");

        String testString = "level";
        System.out.println("Input String: " + testString);

        // Using Stack Strategy
        System.out.println("Using Stack Strategy:");
        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeContext context = new PalindromeContext(stackStrategy);
        context.executeStrategy(testString);

        //deque strategy
        System.out.println("Switching to Deque Strategy:");
        PalindromeStrategy dequeStrategy = new DequeStrategy();
        context.setStrategy(dequeStrategy);  // Runtime change
        context.executeStrategy(testString);




    }
}