package A_Basics;

//import static com.sun.tools.classfile.Module_attribute.RequiresEntry.length;


public class CoderByte
{
    public void run()
    {
        //Main window substring, tree constructor bracket matcher, username validator, find intersection,
        //question marks, first reverse, first factorial, longest word,

        //check Coderbyte,
        //bracketcombinations, main window substring, tree constructor bracket matcher, codeland username validation,
        // find intersection, questions Marks, First reverse, first factorial, longest word. react button toggle
        //So far, foreach only prints stuff with that double-colon thing.

        //1 Bracket combinations
        //balanced parenthesis, method bracket-sets

        //2. Min window substring
        //Example 1 given these inputs, get output "BANC"
        //Given two strings s and t of lengths m and n respectively,
        // return the minimum-window-substring of s such that
        // every character in t (including duplicates) is included in the window.
        // If there is no such substring, return the empty string "".
        //https://leetcode.com/problems/minimum-window-substring/
        String s = "ADOBECODEBANC"; //So for string t, you'd expect MWS to be "BANC"
        String t = "ABC";
        String t2 = "ADOBE";
        String s3 = "rocketlauncher";
        String t3 = "ran";
        //minWindow(s, t2);
        //how to set this up to return minimum string window?
        //other example: MSW of "rocketlauncher" for string "ran" would be "auncher"
        //minWindow(s3,t3);
        //System.out.println("minimum substring window is: " + minWindow2(s3,t3));
        //https://www.javatpoint.com/minimum-window-substring-in-java
        System.out.println("minimum substring window is: " + minWindow03(s3,t3));

        //3. Tree constructor bracket matcher
        //Refers to a binary tree, it's a recursive data structure
        //recursive means made up of SIMILAR SMALLER data structures
        //how do i implement a tree constructor?
        //int data = 2;  //for storing the data
        //ArrayList< Node> children = new ArrayList< >(); //for storing the child nodes
        //Node apple{
        //}
        //children.add(apple);
        //runTree(data,children);


        //4. Bracket Matcher, i need a java based example for this

        //5. codeland username validation
        //take the str parameter being passed and determine if the string
        // is a valid username according to the following rules:
        //1. The username is between 4 and 25 characters.
        //2. It must start with a letter.
        //3. It can only contain letters, numbers, and the underscore character.
        //4. It cannot end with an underscore character.
        //https://gtenpa.medium.com/codeland-username-validation-bbc5130f2c82
        String username = "badApple12!";
        System.out.println("The username provided is: " + username);
        validateUsername(username);

        //6. find intersection
        //How to get the intersection between two arrays as a new array?
        //find the point of intersection of two lines defined by the linear functions in the slope-intercept form.
        //https://www.baeldung.com/java-intersection-of-two-lines


        //7. First Reverse - reverse a string
        //put a string into an array,
        //x = 0;
        // for (index = myArray.length, index > 0, index--)
        // myArray2[x] = myArray[index]
        //x++

        //8. First Factorial
        //factorial of n, is the product of all positive integers less than or equal to n
        //https://www.baeldung.com/java-calculate-factorial
        System.out.println("factorial is: " + factorialUsingForLoop(6));


        //9. longest word detection
        String myString = "That's no moon. It's a space station.";
        myString.indexOf(' ');
        char myChar;

        //divide string into words;
        //iterate through the string, detect good string elements, add it to word,
        // detect space, add word to words string array, increment index2 string array word[0] = myString.ch
        //iterate through words array, detect word[index1].size > biggestWord then = biggestWord
        String[] words = new String[100];
        String word = "";
        int index2 = 0;
        for(int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != ' ') {
                word = word + myString.charAt(i);
            } else {
                //Add word to array words
                words[index2] = word;
                //Increment length, //Make word an empty string
                index2++;
                word = "";
            }
        }

        //10. react button toggle
        //https://www.geeksforgeeks.org/how-to-implement-toggle-using-reactjs/




    }

    //---------------------------------------------------------------------------
    //---------------------------------------------------------------------------
    //1.Bracket Matcher

    //2. Minimum Window
    public static String minWindow03(String S1, String S2)
    {
        // In the beginning, the window is empty
        String win = "";
        int ptr2 = 0;
        int minimum = S1.length() + 1;

        for (int ptr1 = 0; ptr1 < S1.length(); ptr1++)
        {
            // If the characters of both the strings are the same, then increment the ptr2 pointer
            // ptr1 will get incremented itself, as ptr1 is the loop variable.
            if (S1.charAt(ptr1) == S2.charAt(ptr2))
            {
                ptr2++;
                // the string S2 has been traversed completely. Therefore,
                // the time has come to shrink the window.
                if (ptr2 == S2.length())
                {
                        int e = ptr1 + 1;
                        ptr2--;

                    // Reducing the window size
                    while (ptr2 >= 0)
                    {
                        if (S1.charAt(ptr1) == S2.charAt(ptr2))
                        {
                            ptr2--;
                        }
                            ptr1--;
                    }
                    ptr2++;
                    ptr1++;

                    // we have found the window of lesser length
                    // hence, we have to update the window
                    if (e - ptr1 < minimum)
                    {

                        // Updating the var minimum
                        minimum = e - ptr1;

                        // Updating the window
                        win = S1.substring(ptr1, e);
                    }
                }
            }
        }
        //returning our final answer, which is stored in the window
        return win;
    }


    //3. Binary Tree
    /*
    public void runTree(int data2){
        Node root; //unique node for a tree
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Stack< Node> st = new Stack< >();
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == -1)
            {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);

                }
                else
                {
                    root = t;
                }
                st.push(t);
            }
        }

    }
    */

    //4
    /*
    public void bracketMatcher(String str) {
        ArrayList <String> stack;
        for (int i =0, i < str.length(), i++){
            if (str[i] == '(')
                stack.str[])
        }
        else if(str[] == ')')
        {
            if (stack.length ==0) {
                return 0;
            }
        }
        else{
            stack.pop();
        }
    }
    */

    //5. Username Validation
    public boolean  validateUsername(String strParam)
    {
        if ((strParam.length()) < 4 && (strParam.length()) > 25) {
            return false;
        }

        boolean int_flag = false;
        boolean str_flag = false;
        char x = 'a';


        for (char ch : strParam.toCharArray()) {
            if (Character.isDigit(ch) == true) {
                int_flag = true;
                if (Character.isAlphabetic(ch) == true) {
                    str_flag = true;
                }
            }
        }
        return false; //what is I in this scenario?
    }
    //https://www.pepcoding.com/resources/online-java-foundation/generic-tree/generic_tree_constructor/topic
    public boolean  validateUsername02(String strParam)
    {
                //regex??
                boolean y = false;
                //https://www.geeksforgeeks.org/how-to-validate-a-username-using-regular-expressions-in-java/
                return y;
    }

    //6. Find intersection

    //7.

    //8.
    public long factorialUsingForLoop(int n)
    {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }






}
