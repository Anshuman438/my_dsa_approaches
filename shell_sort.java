class shell_sort{
	public  static void main(String args[]){
		int arr[]= {23,45,65,35,98,76,21};
		System.out.println("unsorted array");
		print_arr(arr);
		
		sort(arr);
		System.out.println("sorted array");
		print_arr(arr);
	}
	//method for shell sorting
	
	static void sort(int arr[]){
		int size = arr.length;
		for(int gap = size/2 ; gap >0 ; gap /=2){
			for(int i= gap ; i<size ; i++){
				int temp = arr[i];
				int j =i ;
			 while( j >= gap && arr[j - gap] >temp){
			 	arr[j] = arr[j - gap];
			 	j -= gap;
			 } 
				arr[j] = temp;
			}
		}
	}
	
	//method of printing 
	static void print_arr(int arr[]){
		for(int value : arr){
			System.out.println(value + " ");
		}
	}
}

