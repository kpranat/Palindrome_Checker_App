The objective of the PalindromeChecker App is to design and implement a console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

#UC1: Application Entry & Welcome Message



**Goal -** Display a welcome message and app details at startup. The goal is to establish a clear startup workflow

**Description -**
The PalindromeCheckerApp class represents the entry point of the Palindrome Check App

**Actor:** User

**Flow:**
1) Program starts.
2) JVM invokes the main() method.
3) Application name is displayed.
4) Application version is displayed.
5) Program continues to next use case or exits.

**Key Concepts used in UC1:**
1) Class – Acts as a container for the Palindrome Checker application logic.
2) Main Method – Entry point of the Java application with the signature
3) public static void main(String[] args).
4) Static Keyword – Allows the JVM to invoke the main() method without creating an object.
5) Console Output – System.out.println() is used to display messages on the console.
6) Application Flow Control – Defines the startup behavior before palindrome processing begins.

-

#UC2: Print a Hardcoded Palindrome Result

**Goal:** Display whether a hardcoded string is a palindrome.

**Actor:** User

**Flow:**
1. Program starts
2. Hardcoded string is checked
3. Result is printed
4. Program exits


**Key Concepts used in UC2:**
1. Class – In Java, even the simplest program must be written inside a class, as a class acts as a container to hold program logic.
2. Main Method – Entry point of the Java application with the signature
3. public static void main(String[] args).
4. Static Keyword – Allows the JVM to invoke the main() method without creating an object of the class.
5. String – A built-in Java class used to store and manipulate textual data. Here, it stores the word to be checked for a palindrome.
6. String Literal – Text enclosed within double quotes ("madam"), stored in the String constant pool.
7. Conditional Statement (if-else) – Used to evaluate whether the given string satisfies the palindrome condition.
8. Console Output – System.out.println() is used to display the result on the console.


**Data Structure:** String

-

#UC3: Palindrome Check Using String Reverse

**Goal:** Check whether a string is a palindrome by reversing it.

**Flow:**
1. Reverse string using loop
2. Compare original and reversed
3. Display result

**Key Concepts used in UC3:**
1. Loop (for loop) – Used to iterate through the characters of the string in reverse order.
2. String Immutability – In Java, String objects are immutable; every modification creates a new String object.
3. String Concatenation (+) – Used to build the reversed string character by character (introduced here to later discuss drawbacks).
4. equals() Method – Used to compare the actual content of two String objects instead of memory references.

**Data Structure:** String

-

#UC4: Character Array Based Palindrome Check

**Goal:** Convert string to character array and compare characters.

**Flow:**
1. Convert string to char[]
2. Use two-pointer approach
3. Compare start & end characters

**Key Concepts used in UC4:**
1. Character Array (char[]) – A primitive array used to store individual characters of a string for index-based access.
2. Array Indexing – Accessing elements using index positions starting from 0.
3. Two-Pointer Technique – One pointer starts from the beginning and the other from the end, reducing unnecessary comparisons.
4. Time Complexity Awareness – Demonstrates efficient comparison without creating extra objects.

**Data Structure:** char[]




