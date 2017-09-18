package prog1;

class ArrayQueue
{
    protected int Queue[] ;
    protected int front, rear, size;
 
    public ArrayQueue(int n) 
    {
        size = n;
        Queue = new int[size];
        front = -1;
        rear = -1;
    }  
    
    public boolean isEmpty() 
    {
        return front == -1;
    } 
    
    public boolean isFull() 
    {
        return front==0 && rear == size -1 ;
    }    
    
    public int getSize()
    {
        return rear ;
    }  
    
    public int peek() 
    {
        if (isEmpty())
           System.out.println("Queue Is Empty");
        return rear;
    }  
    
    public void insert(int i) 
    {
        if (rear == -1) 
        {
            front = 0;
            Queue[++rear] = i;
            System.out.println("entered record for position "+rear+ " is "+Queue[rear]);
        }
        else if (isFull())
        	System.out.println("Overflow Exception");
        else if ( rear + 1 < size)
        {
            Queue[++rear] = i;
        System.out.println("entered record for position "+rear+ " is "+Queue[rear]);
        }    
    }
    
    public int remove() 
    {
    	int ele = 0;
        if (isEmpty())
        	System.out.println("Underflow Exception");
        else 
        {
            ele = Queue[front];
            if ( front == rear) 
            {
                front = -1;
                rear = -1;
            }
            else
            {
            	for(int i=0;i<rear;i++)
            	{
            		Queue[i]=Queue[i+1];
            	}
            	rear--;
            }
        }        
        return ele;
    }
    
    public void display()
    {
    	System.out.println("Queue = ");
        if (rear <=0)
        {
        	System.out.print("Empty");
            return ;
        }
        for (int i = front; i <= rear; i++)
        	System.out.print(Queue[i]+" ");
        System.out.println();        
    }
}

public class queueImpli {

	public static void main(String[] args) 
	{
		ArrayQueue arrayQueue=new ArrayQueue(10);
		arrayQueue.insert(10);
		arrayQueue.insert(20);
		System.out.println(arrayQueue.remove());
		arrayQueue.insert(30);
		arrayQueue.insert(40);
		arrayQueue.insert(50);
		arrayQueue.insert(60);	
		System.out.println(arrayQueue.remove());
		System.out.println(arrayQueue.remove());
		arrayQueue.insert(70);		
		arrayQueue.insert(80);		
		arrayQueue.insert(90);
		System.out.println("peek is "+arrayQueue.peek());
		System.out.println("Front "+arrayQueue.front);
		System.out.println("Rear "+arrayQueue.rear);
		arrayQueue.display();

	}

}
