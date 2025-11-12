public class ParenthesesChecker {


    public static void isValid(String S){
        //s.indexOf(String something)
        //s.sutbstring(index1, index2) 
        
        //find a pair of "complete" characters so either (), [] or {}
        //if you do, get rid of them and do it again. 
        // if you don't if the string is empty it's valid if not empty not valid


       char i;
       for (int x = 0; x <= S.length(); x++) {
        if(S.substring(x) == '('){}
       }  
        while(S.length() != 0){
            

            //start by finding the LAST ( or [ or {
            if(S.charAt(i)== '('){
            
            }


        if ((S.indexOf("(") - S.indexOf(")")) == 1){

        

         S = S.substring ( S.indexOf ( "(" ) , S.indexOf (")") + 1);
        }
        else if ((S.indexOf("{") - S.indexOf("}")) == 1){
         S -= S.substring ( S.indexOf ( "{" ) , S.indexOf ("}") + 1);
        }
        else if ((S.indexOf("[") - S.indexOf("]")) == 1){
         S -= S.substring ( S.indexOf ( "[" ) , S.indexOf ("]") + 1);
        }

        } 

 

 }
}