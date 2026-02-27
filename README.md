The objective of the PalindromeChecker App is to design and implement a console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

UC1: Application Entry & Welcome Message
-

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



UC2: Print a Hardcoded Palindrome Result
-

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



UC3: Palindrome Check Using String Reverse
-

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



UC4: Character Array Based Palindrome Check
-

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

UC5: Stack-Based Palindrome Checker
-
**Goal:** Use stack to reverse characters and validate palindrome.
**Flow:**
1) Push characters into stack
2) Pop and compare
3) Print result
**Key Concepts used in UC5:**
1) Stack – A linear data structure that follows the Last In First Out (LIFO) principle.
2) Push Operation – Used to insert characters into the stack.
3) Pop Operation – Used to remove characters from the stack in reverse order.
4) Reversal Logic – Stack naturally reverses the order of elements, making it suitable for palindrome validation.

**Data Structure:** Stack


UC6: Queue + Stack Based Palindrome Check
-
**Goal:** Demonstrate FIFO vs LIFO using Queue and Stack.
**Flow:**
1) Enqueue characters
2) Push characters to stack
3) Compare dequeue vs pop
   
**Key Concepts used in UC6:**
1) Queue – A linear data structure that follows the First In First Out (FIFO) principle.
2) Enqueue & Dequeue Operations – Used to insert and remove elements from the queue.
3) Stack vs Queue – Demonstrates the behavioral difference between LIFO and FIFO structures.
4) Logical Comparison – Matching dequeue (queue) output with pop (stack) output to validate palindrome logic.

**Data Structures:** Queue, Stack

UC7: Deque-Based Optimized Palindrome Checker
-
**Goal:** Use Deque to compare front and rear elements.

**Flow:**
1. Insert characters into deque
2. Remove first & last
3. Compare until empty

**Key Concepts used in UC7:**
1. Deque (Double Ended Queue) – A data structure that allows insertion and deletion from both front and rear ends.
2. Front and Rear Access – Enables direct comparison of first and last characters.
3. Optimized Data Handling – Eliminates the need for separate reversal data structures.

**Data Structure:** Deque

UC8: Linked List Based Palindrome Checker
-
**Goal:** Check palindrome using singly linked list.

**Flow:**
1. Convert string to linked list
2. Reverse second half
3. Compare halves

**Key Concepts used in UC8:**
1. Singly Linked List – A dynamic data structure where elements are connected using node references.
2. Node Traversal – Sequential access to elements using next references.
3. Fast and Slow Pointer Technique – Used to find the middle of the linked list efficiently.
4. In-Place Reversal – Reverses the second half of the list without extra memory.

**Data Structure:** Singly Linked List

UC9: Recursive Palindrome Checker
-
**Goal:** Check palindrome using recursion.

**Flow:**
1. Recursive call compares start & end
2. Base condition exits recursion

**Key Concepts used in UC9:**
1. Recursion – A technique where a method calls itself to solve smaller subproblems.
2. Base Condition – Prevents infinite recursion and terminates the recursive calls.
3. Call Stack – Memory structure used to manage method calls during recursion.

**Data Structure:** Call Stack

UC10: Case-Insensitive & Space-Ignored Palindrome
-
**Goal:** Ignore spaces and case while checking a palindrome.

**Flow:**
1. Normalize string
2. Apply previous logic

**Key Concepts used in UC10:**
1. String preprocessing
2. Regular expressions

**Data Structure:** String / Array










