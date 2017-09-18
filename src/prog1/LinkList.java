package prog1;

class Node
{
    int data;
    Node link;
    public Node()
    {
        link = null;        data = 0;
    }
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }
    public void setLink(Node n)
    {
        link = n;
    }
    public void setData(int d)
    {
        data = d;
    }
    public Node getNode()
    {
        return link;
    }
    public int getData()
    {
        return data;
    }
}
class linkedList
{
    Node start;
    Node end ;
    public int size ;
 
    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    public boolean isEmpty()
    {
        return start == null;
    }
    public int getSize()
    {
        return size;
    }    
    public void insertAtStart(int val)
    {
        Node nodestrt = new Node(val, null);    
        size++;
        if(start == null) 
        {
            start = nodestrt;
            end = start;
        }
        else 
        {
            nodestrt.setLink(start);
            start = nodestrt;
        }
    }
    public void insertAtEnd(int val)
    {
        Node nodeEnd = new Node(val,null);    
        size++ ;    
        if(start == null) 
        {
            start = nodeEnd;
            end = start;
        }
        else 
        {
            end.setLink(nodeEnd);
            end = nodeEnd;
        }
    }
    public void insertAtPos(int val , int pos)
    {
        Node insertAtPos = new Node(val, null);                
        Node ptr = start;
        pos--;
        for (int i = 1; i < size; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getNode() ;
                ptr.setLink(insertAtPos);
                insertAtPos.setLink(tmp);
                break;
            }
            ptr = ptr.getNode();
        }
        size++;
    }
    
    public void removeAtstart()
    {
    		start=start.getNode();
    		size--;
    }
    
    public void removeAtend()
    {
            Node s = start;
            Node t = start;
            while (s != end)
            {
                t = s;
                s = s.getNode();
            }
            end = t;
            end.setLink(null);
            size --;
	}
    
    public void removeAtPos(int node)
    {
    	Node anyPoint=start;
    	--node;
    	for(int i=0; i<size; i++)
    	{
    		if(node==i)
    		{
    			Node temp=anyPoint.getNode();
    			temp=temp.getNode();
    			anyPoint.setLink(temp);
    			break;
    		}
    	}
    	size--;
    }
        
    public void display()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (start.getNode() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+ "->");
        ptr = start.getNode();
        while (ptr.getNode() != null)
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getNode();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}
public class LinkList
{
public static void main(String[] args) {
	linkedList linkedList=new linkedList();
	linkedList.insertAtStart(5);
	linkedList.insertAtStart(10);
	linkedList.insertAtEnd(10);
	linkedList.insertAtStart(12);
	linkedList.insertAtStart(14);
	linkedList.insertAtStart(15);
	linkedList.display();
	linkedList.insertAtPos(20, 3);
	linkedList.display();
	linkedList.removeAtstart();
	linkedList.removeAtend();
	System.out.println(linkedList.getSize());
	linkedList.display();
	linkedList.removeAtPos(2);
	linkedList.display();	
}
}
