package com.java2novoice.interview.programs;

import java.util.Stack;

public class StackSOrtWithTempVaraible
{
	public static Stack<Integer> stk(Stack<Integer> number)
	{
		Stack<Integer> tempnum=new Stack<Integer>();
		while(!number.isEmpty())
		{			
			int temp=number.pop();
			while(!tempnum.isEmpty() && tempnum.peek()>temp)
			{
				number.push(tempnum.pop());
			}
			tempnum.push(temp);
		}
		return tempnum;
	}
	
    public static Stack<Integer> sortStack(Stack<Integer> input){
        
        Stack<Integer> tmpStack = new Stack<Integer>();
        System.out.println("=============== debug logs ================");
        while(!input.isEmpty()) {
            int tmp = input.pop();
            System.out.println("Element taken out: "+tmp);
            while(!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                input.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
            System.out.println("input: "+input);
            System.out.println("tmpStack: "+tmpStack);
            System.out.println("------------------------------");
        }
        System.out.println("=============== debug logs ended ================");
        return tmpStack;
    }
  
    public static void main(String a[]){
         
        Stack<Integer> input = new Stack<Integer>();
        input.add(2);
        input.add(3);
        input.add(1);
        System.out.println("input: "+input);
        System.out.println("final sorted list: "+sortStack(input));
    }

}
