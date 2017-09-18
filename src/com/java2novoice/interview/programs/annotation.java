package com.java2novoice.interview.programs;


public @interface annotation {
	 
    String name();
    String desc();
}

class call 
{
	 @annotation(name = "test1", desc = "testing annotations")
	    public void myTestMethod(){
	        //method implementation
	    }
}
