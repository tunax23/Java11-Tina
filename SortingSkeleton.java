/* Sorting algorithms formative assessment
 * 
 * Student Name: 
 * 
 * April/2021
 * 
 * Please read sorting_algos_SL.pdf and convert the pseudocode algorithms
 * into Java methods
 * 
 * Also check https://visualgo.net/en/sorting 
 */
public class SortingSkeleton
{
	public static void printArray(int[] array)
	{
		for( int e: array )
		{	System.out.print( e + " " );
		}
		System.out.println();
	}
	
	public static int[] clone(int[] array) // returns a copy of array
	{
		if(array.length == 0) return null;
		int[] copy = new int[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		return copy;
	}

	static void bubble(int[] a)
	{
		// your code goes here - sort the array a using bubble sort
		int n = a.length;
		int temp = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 1; j < (n-i); j++);
			{
				if (a[j-1] > a[j])
				{
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void selection(int[] a)
	{
		// your code goes here - sort the array a using selection sort
		for (int i = 0; i < a.length; i++)
		{
			int index = i;
			
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[j] < a[index])
				{
					index = j; //searches for lowest index
				}
			}
		}
	}

	// a couple of ways to visualise the insertion sort:
	// https://youtu.be/OGzPmgsI-pQ
	// https://youtu.be/JU767SDMDvA
	public static void insertion(int[] a)
	{
		// your code goes here - for the alternative insertion sort
		int n = a.length;
		for (int j = 1; j < n; j++)
		{
			int key = a[j];
			int i = j - 1;
			while ((i > -1) && (a[i] > key))
			{
				a [i=1] = a[i];
				i--;
			}
			a[i + 1] = key;
		}
	}

	// No need to modify the main method.
	public static void main(String[] args)
	{
		int[] original = { 7,9,6,8,1,3,5,2,4 };
		int[] array = clone(original);
		System.out.println("Original array");
		printArray(original);

		System.out.println("\nBubble sort");
		bubble( array );
		printArray(array);
		System.out.println();

		System.out.println("\nSelection sort");
		array = clone(original);
		selection( array );
		printArray(array);

		System.out.println("\nInsertion sort");
		array = clone(original);
		insertion( array );
		printArray(array);

	}
}
