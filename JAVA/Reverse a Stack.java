import java.util.*;

public class Main
{
    public static void pushAtBottom(int data, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        
        int top = st.pop();
        pushAtBottom(data, st);
        
        st.push(top);
    }
    
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        
        int top = st.pop(); // taking out the top element
        reverse(st); // reversing the rest over stack
        
        pushAtBottom(top, st); // again pushing the element at the bottom
    }
    
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		reverse(st);
		
		while(!st.isEmpty()){
		    System.out.println(st.peek());
		    st.pop();
		}
	}
}
