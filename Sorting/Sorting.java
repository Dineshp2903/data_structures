package javamine;

public class Sorting {
	
	
	
	public static int[] selection_sort(int[] arr)
	{
		
		/*
		 * 
		 * Time Complexity: The time complexity of Selection Sort is O(N2)
		 * Auxiliary Space: O(1)
		 */
		for(int i = 0 ;i<arr.length-1 ;i++)
		{
			int min_idx = i;

			for(int j = i+1;j< arr.length ;j++)
			{
				
				
				if(arr[min_idx] > arr[j])
				{
					min_idx = j;
				}
			}
			
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
	public static void printarr(int[] arr)
	{
		for(int i = 0; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		
		int arr[] = {64,25,12,22,11};
		arr = selection_sort(arr);
		printarr(arr);
		

	}

}
