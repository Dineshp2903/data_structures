package javamine;

public class Searching {
	
	
	public int linear_search(int value)
	{
		/*Linear Search is defined as a sequential search algorithm that starts at one end and goes through each element of a list until the desired element is found, otherwise the search continues till the end of the data set. 
		 * It is the easiest searching algorithm 
		 * */
		
		
		/* 
		 * Time complexity: O(N)
			Auxiliary Space: O(1)
		 */
		int[] arr = {10,20,1,56,45,90,111,99,17,6};
		for(int i =0 ;i < arr.length ;i++)
		{
			if(arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public int binary_search()
	{
		int[] arr = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
		int x = 110;
//		Time Complexity: O (log n)
//		Auxiliary Space: O (1)
		return -1;
		
	}

	public static void main(String[] args) {
		

	}

}
