package com.epam.CustomList;

/**
 * Hello world!
 *
 */
//import java.util.*;
public class App {
    public static void main( String[] args ) {
    	
    	CustomArraylist<Integer> customlist=new CustomArraylist<>();
    	customlist.add(10);
    	customlist.add(100);
    	customlist.add(1000);
    	customlist.add(10000);
    	customlist.add(101);
    	customlist.add(102);
    	customlist.add(105);
    	customlist.add(100000);
    	
    	System.out.println(customlist);
    	
    	customlist.remove(2);
    	customlist.remove(2);
    	customlist.remove(2);
    	
    	System.out.println(customlist);
    	
    	System.out.println(customlist.get(4));
    	customlist.get(12);
    	
    }
}
