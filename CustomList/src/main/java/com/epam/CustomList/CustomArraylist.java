package com.epam.CustomList;

import java.util.Arrays;

public class CustomArraylist<E> {
	
	private int size=0;
	private static final int DEFAULT_CAPACITY=10;
	private Object elements[];
	public CustomArraylist() {
		// TODO Auto-generated constructor stub
		elements=new Object[DEFAULT_CAPACITY];
	}
	//increasing the size of CustomList By double
	private void increaseCapacity() {
		int newSize=elements.length*2;
		elements=Arrays.copyOf(elements, newSize);
	}
	//Adding element to the list
	public void add(E ele) {
		if(size==elements.length) {
			increaseCapacity();
		}
		elements[size++]=ele;
	}
	
	//removing element at index i from the list
	@SuppressWarnings("unchecked")
	public E remove(int i) {
		try {
			if(i<0 || i>elements.length) {
				throw new IndexOutOfBoundsException("Index out of range");
			}
			for(int j=i;j<size-1;j++) {
				elements[j]=elements[j+1];
			}
			size--;
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		return (E) elements[i];
	}
	
	//getting element from the Custom list{
	@SuppressWarnings("unchecked")
	public E get(int i) {
		try {
			if(i<0 || i>elements.length) {
				throw new IndexOutOfBoundsException("Index out of range");
			}
			
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		return (E) elements[i];
	}
	
	//Overriding the to StringMethod
	@Override
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(elements[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
}
