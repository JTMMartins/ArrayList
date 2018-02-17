package com.noshio.ArrayList;


public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        
        for (int i=0;i<ar.size();i++) {
        	System.out.println(ar.get(i));
        }
        
        ArrayList<String> ars=new ArrayList<String>();
        ars.add("A");
        ars.add("B");
        ars.add("C");
        
        for (int i=0;i<ars.size();i++) {
        	System.out.println(ars.get(i));
        }      
        
    }
}
