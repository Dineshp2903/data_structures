package javamine;

public class Stack {
	
	int top = -1;
	int MAX_LIMIT = 100;
	int[] stack = new int[MAX_LIMIT];
	
	
	public void push(int data)
	{
		if (top == MAX_LIMIT)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			stack[++top] = data;
		}
	}
	
	
	public Integer pop()
	{
		if(top == -1)
		{
			System.out.println("Stack underflow");
			return null;
		}
		
		return stack[top--];
	}
	
	public void print()
	{
		if(top == -1)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			for(int i = 0;i<=top;i++)
			{
				System.out.println(stack[i]);
			}
		}
	}
	

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.pop();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.print();
		stack.pop();
		stack.print();
		
		

	}

}
