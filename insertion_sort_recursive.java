class insertion_sort_recursive{
	public static void main(String args[]){
		int arr[] = {23,45,56,42, 21,98,76};
		System.out.println("unsorted array ");
		print_arr(arr);
		
		sort(arr , arr.length);
		
		System.out.println("sorted array ");
		print_arr(arr);
			
	}
	
	//method for insertion sorting
	//select the number and sort it first one at a time 
	
	static void sort(int arr[] ,int n ){
	
		if( n <= 1){
		 	return;
		}
			
			sort( arr , n-1);
			int key = arr[ n-1 ];   //78
			
			//loop to sort
			
			int j= n-2;               //5
			while ( j>=0 && arr[j]>=key){      //98>78 true
				arr[j+1]= arr[j];              // arr[6] = 98
				j--;                           //j=4
			}	
			arr[j+1] = key ;                  //  arr[5] = 78
		}                              
	
	
	//method for print function 
	static void print_arr(int arr[]){
		for(int value : arr){
			System.out.println(value + " ");
		}
	} 
}

