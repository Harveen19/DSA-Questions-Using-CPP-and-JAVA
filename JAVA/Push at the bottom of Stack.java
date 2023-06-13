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
    
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int data = s.nextInt();
	    System.out.println();
	    
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		pushAtBottom(data, st);
		
		while(!st.isEmpty()){
		    System.out.println(st.peek());
		    st.pop();
		}
	}
}
