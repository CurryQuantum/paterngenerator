public class ParenthesesChecker {
     //  Class author:  ernest pedregosa delserieys
     //  Date created:  11/12/2025
     //  General description: checks if a string of parentheses is valid or not
     // Precondition: S is a string containing only the characters '(', ')', '{', '}', '[' and ']'.
     // Postcondition: Prints "Valid" if the parentheses in the string are properly matched and nested ; otherwise, prints "Invalid".
    

    public static void isValid(String S){
        //find a pair of "complete" characters so either (), [] or {}
        //if you do, get rid of them and do it again. 
        // if you don't if the string is empty it's valid if not empty not valid

        int length = S.length();

        while (length > 0) {
        // for (int j = 0; j < 10; j++) {
            // The replace() method removes ALL instances of the pair.
            // We use replace() here because it's a simple, single command.
            S = S.replace("()", "");
            S = S.replace("{}", "");
            S = S.replace("[]", "");

            // If no pairs were removed, break out of the loop.
            if (length == S.length()) {
                break;  
            }
            else{
                // Keep track of the current length before we try to remove pairs.
                length = S.length();
            }
        }

        if (S.length() == 0) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }    
    }
    
    public static void main(String[] args){
        isValid("{{()}}");
    }

}