package m00;

public class Search {
	
	/**
	 * Find the first occurrence of x in sorted array a.
	 * @param x value to find
	 * @param a array sorted in increasing order (a[0] <= a[1] <= ... <= a[n-1])
	 * @return lowest i such that a[i]==x, or -1 if x not found in a.
	 */
	public static int find(int x, int[] a) {
		//call binarySearch
		 return binarySearch(a, 0, a.length-1, x);
	} 
	

	public static int binarySearch(int[] a, int start, int end, int x) {
	    int middle = (start + end) / 2;
	    if(end < start) {
	        return -1;
	    } 
	    if(x==a[middle]) {
	        return middle;
	    } else if(x<a[middle]) {
	        return binarySearch(a, start, middle - 1, x);
	    } else {
	        return binarySearch(a, middle + 1, end, x);
	    }
	}
}
