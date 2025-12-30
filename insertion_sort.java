class insertion_sort{
	public static void main(String args[]){
		int arr[] = {23,45,56,42, 21,98,76};
		System.out.println("unsorted array ");
		print_arr(arr);
		
		sort(arr);
		
		System.out.println("sorted array ");
		print_arr(arr);
			
	}
	
	//method for insertion sorting
	//select the number and sort it first one at a time 
	
	static void sort(int arr[]){
		int size = arr.length;
		
		for (int i = 0 ; i<size ; i++){
			int key = arr[i];
			
			//loop to sort
			int j= i-1;
			while ( j>=0 && arr[j]>=key){
				arr[j+1]= arr[j];
				j--;
			}	
			arr[j+1] = key ;
		}
	}
	
	//method for print function 
	static void print_arr(int arr[]){
		for(int value : arr){
			System.out.println(value + " ");
		}
	} 
}

