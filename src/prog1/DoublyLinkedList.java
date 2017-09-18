package prog1;

class DNode
{
    int data;
    DNode front;
	DNode back;

	public DNode()
    {
		front = null;
		back=null;
		data = 0;
    }
    
    public DNode(int d,DNode F, DNode B)
    {
        data = d; 
        front = F;
        back=B;
    }
    
    public void setData(int d)
    {
        data = d;
    }
    
    public void setLinkFront(DNode n)
    {
        front = n;
    }
    
    public void setLinkBack(DNode n)
    {
        back = n;
    }
    
    public DNode getLinkFront()
    {
        return front;
    }    
    
    public DNode getLinkBack()
    {
        return back;
    }

    public int getData()
    {
        return data;
    }
}

class DlinkedList
{
    DNode start;
    DNode end ;
    int size ;
    
    DlinkedList()
    {
    	start=null;
    	end=null;
    	size=0;
    }
    
    public boolean isempty()
    {
    	return start==null;
    }
    
    public int getSize()
    {
    	return size;
    }
    
    public void insertAtFront(int value)
    {
        DNode nptr = new DNode(value, null, null);        
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            start.setLinkFront(nptr);
            nptr.setLinkBack(start);
            start = nptr;
        }
        size++;
    }
    
    public void insertAtBack(int value)
    {
        DNode nptr = new DNode(value, null, null);        
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
        	nptr.setLinkFront(end);
            end.setLinkBack(nptr);
            end = nptr;
        }
        size++;
    }

    public void insertFromFrontPosition(int pos,int value)
    {
        DNode fromFrontPosition = new DNode(value, null, null);
        DNode ptr=start;
        for(int i=1;i<=size;i++)
        {
        	if(i==pos)
        	{
                DNode tmp = ptr.getLinkFront();
                ptr.setLinkFront(fromFrontPosition);
                fromFrontPosition.setLinkBack(ptr);
                tmp.setLinkBack(fromFrontPosition);
                break;
        	}
        	ptr=ptr.getLinkBack();
        }
        size++;
    }
     
    public void insertFromBackPosition(int pos,int value)
    {
        DNode FromBAckPosition = new DNode(value, null, null);
        DNode ptr=end;
        for(int i=size-1;i>0;--i)
        {
        	if(i==size-pos)
        	{
                DNode tmp = ptr.getLinkFront();
                ptr.setLinkFront(FromBAckPosition);
                FromBAckPosition.setLinkBack(ptr);
                tmp.setLinkBack(FromBAckPosition);
                break;
        	}
        	ptr=ptr.getLinkFront();
        }
        size++;
    }
    
    public void deleteAtfront()
    {
    	if (size == 1)
        {
    		start = null;
    		end = null;
    		size = 0; 
        }
    	start = start.getLinkBack();
    	size--; 
    	return;
    }
    
    public void deleteAtEnd()
    {
    	end = end.getLinkFront();
    	end.setLinkBack(null);
        size-- ;
    }
    
    public void deletefromFrontPos(int pos)
    {
        DNode ptr = start.getLinkBack();
        System.out.println("ptr1 "+ptr.toString());
        pos--;
        for (int i = 1; i <= size; i++)
        {
        	System.out.println("i"+i);
            if (i == pos)
            {
            	System.out.println("Current pointer"+i);
                DNode linkback = ptr.getLinkBack();
                DNode linkfront = ptr.getLinkFront();
 
                linkback.setLinkFront(linkfront);
                linkfront.setLinkBack(linkback);

                size-- ;
                return;
            }
            ptr = ptr.getLinkBack();
            System.out.println("ptr2 "+ptr);
        }        
    }    
    
    public void display()
    {
        System.out.print("\nDoubly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLinkBack() == null) 
        {
            System.out.println(start.getData());
            return;
        }
        
        DNode ptr = start;
        System.out.print(start.getData()+"("+start.toString()+")"+ " <-> ");
//        System.out.print(start.getData()+ " <-> ");
        ptr = start.getLinkBack();
        while (ptr.getLinkBack() != null)
        {
            System.out.print("("+ptr.getLinkBack()+")"+ptr.getData()+"("+ptr.getLinkFront()+")"+ " <-> ");
//            System.out.print(ptr.getData()+" <-> ");
            ptr = ptr.getLinkBack();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}

public class DoublyLinkedList
{
	public static void main(String[] args) 
		{
			DlinkedList DlinkedList=new DlinkedList();
		
				DlinkedList.insertAtFront(5);
				DlinkedList.insertAtFront(10);
				DlinkedList.insertAtFront(12);
				DlinkedList.insertAtFront(14);
				DlinkedList.insertAtFront(16);
				DlinkedList.insertAtFront(18);
				DlinkedList.insertAtFront(20);
				DlinkedList.insertAtFront(22);
				DlinkedList.insertAtFront(24);
//				DlinkedList.insertAtBack(20);
//				DlinkedList.insertAtBack(30);
//				DlinkedList.insertFromFrontPosition(2, 200);
//				DlinkedList.insertFromBackPosition(6, 100);
				System.out.println(DlinkedList.getSize());
			DlinkedList.display();
//			DlinkedList.deleteAtfront();
//			DlinkedList.deleteAtEnd();
//			DlinkedList.deleteAtEnd();
			System.out.println(DlinkedList.getSize());
			DlinkedList.display();
			DlinkedList.deletefromFrontPos(3);
			DlinkedList.display();
			System.out.println(DlinkedList.getSize());
		}
}