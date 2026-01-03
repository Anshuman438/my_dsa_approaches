class selection_sort{
	public static void main(String args[]){
		int[] arr = {23,54,34,75,10,22};
		System.out.println("unsorted array ");
		printarr(arr);

		sort(arr);
		System.out.println("sorted array ");
		printarr(arr);
	}

//election sort function to sort 
//select the minimum from the array then swap with the next elements till the size of thd array 

	static void sort(int arr[]){
	//size of the array
	int size = arr.length;
	for(int i =0 ; i< size-1 ; i++){
		
		int min_size = i;
	//cheaking for the minimum element
		for(int j=i+1 ; j< size ; j++){
			if(arr[j] < arr[min_size]){
				min_size = j;
			}
		}

		//swapping of elements 
		int temp = arr[min_size];
		arr[min_size] = arr[i];
		arr[i] = temp ;
	}
}
	
	// method to print the array 

	static void printarr(int arr[]){
		for(int value : arr){
		System.out.println(value + " ");
		}
	}
}
