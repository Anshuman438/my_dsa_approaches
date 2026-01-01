class quick_sort{
	public static void main(String args[]){
	
		int arr[] = {65 ,34, 64 ,12, 67,78,33 ,-2};
		System.out.println("unsorted array");
		print_arr(arr);
		
		quickSort(arr , 0 , arr.length);
		System.out.println("sorted array");
		print_arr(arr);
	}
	// quick sort method 
	static void quickSort(int arr[] ,int start ,int end){
	 // if only one element is present in the array 
		if(end - start <2){
			return;
		}
		
		int pivotIndex= partition(arr , start , end );
		quickSort(arr , start , pivotIndex);
		quickSort(arr , pivotIndex + 1 , end);
	}
	
	// method to perform the partition
	static int partition(int arr[] , int start , int end ){
		// taking first element as pivot
		 int pivot = arr[start];
		 int i = start , j= end ;
		 
		 while(i<j){
		 	while(i<j && arr[--j] >= pivot);
		 		if(i<j){
		 			arr[i] = arr[j];
		 		}
		 	
		 	while( i<j && arr[++i] <= pivot);
		 		if(i<j){
		 			arr[j] = arr[i];
		 		}
		 }
		 arr[j] = pivot;
		 return j; 
	}
	
	// print method
	static void print_arr(int arr[]){
		for( int value : arr){
			System.out.println( value + " ");
		}
	}
}
