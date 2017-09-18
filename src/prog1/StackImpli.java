package prog1;

class ArrayStack
{
    int arr[];
    int top, size, len;
    
    public ArrayStack(int n) 
    {
        size = n;
        len = 0;
        arr = new int[size];
        top = -1;
	}
    
    public boolean isEmpty()
    {
        return top == -1;
    }
    
    public boolean isFull()
    {
        return top == size -1 ;        
    }
    
    public int getSize()
    {
        return top+1 ;
    }
    
    public void push(int i)
    {
        if(top + 1 >= size)
            System.out.println("stack overflow");
        if(top + 1 < size )
        {
            arr[++top] = i;
            System.out.println("entered record for position "+(top+1)+ " is "+arr[top]);
        }
        len++ ;
    }
    
    public int pop()
    {
        if( isEmpty() )
            System.out.println("Underflow stack");
        len-- ;
        return arr[top--]; 
    }    

    public void display()
    {
        System.out.print("\nStack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }    
}

public class StackImpli 
{

	public static void main(String[] args) 
	{
		ArrayStack arrayStack=new ArrayStack(10);
		arrayStack.display();
		arrayStack.push(10);
		arrayStack.push(20);
		arrayStack.push(30);
		arrayStack.push(40);
		System.out.println(arrayStack.getSize());
		arrayStack.push(50);
		arrayStack.push(60);
		arrayStack.push(70);
		arrayStack.push(80);
		arrayStack.push(90);
		arrayStack.pop();
		arrayStack.pop();
		arrayStack.pop();
		arrayStack.pop();
		arrayStack.pop();
		arrayStack.push(100);
		System.out.println(arrayStack.getSize());
		arrayStack.push(110);
		arrayStack.push(120);
		System.out.println(arrayStack.getSize());
		arrayStack.display();
	}

}
