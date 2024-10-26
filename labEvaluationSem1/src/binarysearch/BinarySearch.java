package binarysearch;

import java.util.Scanner;

public class BinarySearch {

	static Scanner sc=new Scanner(System.in);
	
	//Function to take an array inputs
    static int[] takeInput(int n)
    {
        int[] array = new int[n];
        System.out.print("Enter "+n+" elements: ");
        for(int i=0; i<n; i++)
            array[i] = sc.nextInt();
 
	    return array;
	}
    
    //Function to check for the sorted array.
    static boolean isSorted(int[] array) 
    {
        for (int i = 0; i < array.length - 1; i++) 
        {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }
    
    //Recursive function to search element using binary search algorithm
    static int binarySearch(int array[], int element, int start, int end) {
        if ( end >= start) 
        {
            int mid = start + (end - start)/2;
            if (array[mid] == element)
            	//if the element is at mid return mid index
                return mid;
            if (array[mid] > element)
            	//if the element is less than mid element, then we will find element in lesser part of array only.
                return binarySearch(array, element, start, mid - 1);
            //else if the element is greater than mid element, then we will find element in greater part of array only.
            return binarySearch(array, element, mid + 1, end );
        }
        
        return -1;
    }
    
    public static void main(String args[]) {
    	
    		System.out.print("Provide input array length:");
    		int n=sc.nextInt();
        	int array[]=takeInput(n);
        	if(isSorted(array)==false)
        		System.out.println("Enter sorted array only! Try again.");
        	else {
	        	System.out.print("Provide no of test inputs: ");
	        	int e=sc.nextInt();
	        	int testElements[]=takeInput(e);
	  
	        	int result=0;      	
	        	for(int i=0; i<e; i++){
	                result = binarySearch(array, testElements[i], 0, array.length-1);
	                System.out.print(result+" ");
	        	}
        	}   	
    }
}

