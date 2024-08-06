import java.util.Stack;
class NextGreater {

    
    
   // Time complexity: O(n)
    //Question:  This function will find the next greater element for each element
   
    public static int[] nextGreaterElement(int arr[], int n)
    {
          Stack<Integer> stack = new Stack<>();
          int result[] = new int[n];
        
        // Iterate over the given array
        for(int i = n - 1; i>= 0; i--){
            
            // While stack is not empty and the current
            // element is greater than the top of the
            // stack, keeping removing the top of the stack
            while(!stack.isEmpty() && arr[i] >= stack.peek()){
                stack.pop();
            }
            
            // If the stack is empty, then it mean there is no next greater
            // element for this element
            if(stack.isEmpty()){
                result[i] = -1;
            } 
            // Otherwise, the top of the stack is the next greater
            // element for this element
            else {
                result[i] = stack.peek();
            }
            
            // Push the current element to the stack
            stack.push(arr[i]);
        }
        return result;

    }
    
    public static void main(String[] args) {
        int arr[] = new int[]{2, 8, 9, 6, 7};
        int result[] = nextGreaterElement(arr, arr.length);
        for(int e : result){
            System.out.print(e+" ");  //8 9 -1 7 -1
        }
    }
}