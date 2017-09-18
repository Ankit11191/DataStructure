package prog1;

class AVLnode
{
	AVLnode left,right;
	int data;
	int hight;
	
	public AVLnode()
	{
		left=null;
		right=null;
		data=0;
		hight=0;
	}
	
	public AVLnode(int n)
	{
		left=null;
		right=null;
		data=n;
		hight=0;
	}
}
class AVLTree
{
	public AVLnode root;
	
}
