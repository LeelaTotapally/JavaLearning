package com.acme.sort;

public class SelectionSort {
	public static void selectionSort(int array[])
	{
	int selectedIndex = 0;
	int selectedElement = array[selectedIndex];
	int smallestElement = selectedElement;
	int smallestIndex;
	
	for(int i = 0; i<array.length-1;i++)
	{
		for(int j =i+1;j<array.length;j++)
		{
			int currentIndex = j;
			int currentElement = array[currentIndex];
			
			if(selectedElement<currentElement)
			{
				  smallestIndex =selectedIndex;
			}
			else
			{
				  smallestIndex =currentIndex;
			}
		
	
		
			int temp = selectedElement;
			array[selectedIndex] = smallestElement;
			array[smallestIndex] = temp;
		}
	}
	
		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
	}
	

}
