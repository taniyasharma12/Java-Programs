package Stack;
import java.util.Stack;

public class StackIntrodcution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.peek());
		System.out.println(st);
		st.pop();
		System.out.println(st);
        System.out.println(st.size());
	}
	

}
