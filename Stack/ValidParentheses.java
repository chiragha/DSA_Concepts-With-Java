package dsa_with.java;
import java.util.Stack;
public class ValidParentheses {
  public static void main(String[] args) {
        String exp = "({[]})";
        System.out.println(isBalanced(exp));
    }
    
    public static boolean isBalanced(String exp) {
        Stack<Character> st = new Stack<>();
        
       
        for(int i = 0; i < exp.length(); i++){
            
            // Get current character 
            char ch = exp.charAt(i);
            
            // If the stack is empty, push the current character into the stack
            if(st.isEmpty()){
                st.push(ch);
            }
            else if((ch==')' && st.peek() == '(')||(ch=='}' && st.peek() == '{')||(ch==']' && st.peek() == '[')){
                st.pop();
            }
            else{
                st.push(ch);
            }      
        }
        return (st.isEmpty());
    }
}
