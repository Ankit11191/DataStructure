package prog1;

class CNode
{
    protected int data;
    protected CNode link;
 
    public CNode()
    {
        link = null;
        data = 0;
    }    

    public CNode(int d,CNode n)
    {
        data = d;
        link = n;
    }
    
    public void setCLink(CNode nptr)
    {
        link = nptr;
    }
    
    public void setCData(int d)
    {
        data = d;
    }

    public CNode getCLink()
    {
        return link;
    }

    public int getCData()
    {
        return data;
    }
}

class ClinkedList
{
    protected CNode start ;
    protected CNode end ;
    public int size ;
 
    public ClinkedList()
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
        CNode nptr = new CNode(val,null);    
        nptr.setCLink(nptr);;
        if(start == null)
        {            
            start = nptr;
            nptr.setCLink(start);
            end = start;            
        }
        else
        {
            end.setCLink(nptr);
            start = nptr;        
        }
        size++ ;
    }
    
    public void insertAtEnd(int val)
    {
        CNode nptr = new CNode(val,null);    
        nptr.setCLink(start);
        if(start == null)
        {            
            start = nptr;
            nptr.setCLink(start);
            end = start;            
        }
        else
        {
            end.setCLink(nptr);
            end = nptr;            
        }
        size++ ;
    }
    
    public void insertAtPos(int val , int pos) 
    {
        CNode nptr = new CNode(val,null);                
        CNode ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                CNode tmp = ptr.getCLink() ;
                ptr.setCLink( nptr );
                nptr.setCLink(tmp);
                break;
            }
            ptr = ptr.getCLink();
        }
        size++ ;
    }
    
    public void display()
    {
        System.out.print("\nCircular Singly Linked List = ");
        CNode ptr = start;
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getCLink() == start) 
        {
            System.out.print(start.getCData()+ "->"+ptr.getCData()+ "\n");
            return;
        }
        System.out.print(start.getCData()+ "->");
        ptr = start.getCLink();
        while (ptr.getCLink() != start) 
        {
            System.out.print(ptr.getCData()+ "->");
            ptr = ptr.getCLink();
        }
        System.out.print(ptr.getCData()+ "->");
        ptr = ptr.getCLink();
        System.out.print(ptr.getCData()+ "\n");
    }
}

public class CirculerLinkList {

	public static void main(String[] args) {

		ClinkedList clinkedList=new ClinkedList();
		clinkedList.insertAtStart(10);
//		clinkedList.insertAtStart(20);
//		clinkedList.insertAtEnd(80);
		clinkedList.insertAtEnd(90);
		clinkedList.insertAtPos(100, 1);
		clinkedList.insertAtPos(200, 2);
		clinkedList.insertAtPos(300, 3);
		clinkedList.insertAtPos(400, 4);
		clinkedList.insertAtPos(500, 5);
		clinkedList.display();

	}

}
