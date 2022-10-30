package pdcassessment;

import java.util.*;

public class BalancedParantheses {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to verify balanced Paranthesis:");
		String text = sc.nextLine();
		
		BalancedParantheses bp = new BalancedParantheses();
		bp.isValidParantheses(text);
		
		sc.close();

	}
	
	void isValidParantheses(String text)
	{
	
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i)!='[' && text.charAt(i)!='(' && text.charAt(i)!=']' && text.charAt(i)!=')')
				continue;
			else if(text.charAt(i)=='[' || text.charAt(i)=='(')
				stack.push(text.charAt(i));
			else
			{
				if(stack.isEmpty())
					System.out.println("False");
				else
				{
					char laststack = stack.pop();
					if(text.charAt(i)==']' && laststack !='[')
						System.out.println("False");
					else if(text.charAt(i)==']' && laststack!='[')
						System.out.println("False");
				}
			}
				
		}
		
		if(stack.isEmpty())
			System.out.println("True");
    /*  else
			System.out.println("False"); */
	}

}
