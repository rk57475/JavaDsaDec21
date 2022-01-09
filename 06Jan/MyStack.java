package dsa;

public class MyStack {
	//global decleration
	int top;   
	int maxsize = 10;  
	int[] arr = new int[maxsize]; 
	 
	//stack status
	boolean isEmpty(){
		return (top < 0);  
	}  
	
	MyStack(){
		top = -1; 
	}
	//stack push
	boolean push(int x) {
		if (top >= (maxsize - 1)) {
			System.out.println("Stack Overflow");
			return false;
	    } 
		else {
			// top+=1;
			
			arr[++top] = x;
	        System.out.println(x + " pushed into stack");
	        return true;
		}
	}
//stack pop
	int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
		    return 0;
	    } 
		else {
			int x = arr[top--];
			return x;
		}
	}
//stack peek
	int peek() {
		if (top < 0) {
			System.out.println("Stack Underflow");
	        return 0;
	    } 
		else {
			int x = arr[top];
	        return x;
	    }
	}
	
	void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + arr[i]);
        }
    }
	
	public static void main(String args[]) {
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
    }
}
