class merge_sort{
	public static void main(String args[]){
		System.out.println("unsorted array ");
		int arr[] = {34,45,73,23,43,12,54,78};
		print_arr(arr);
		
		mergeSort(arr , 0 , arr.length);
		
		System.out.println("sorted array ");
		print_arr(arr);
	}
	
	//merse sort function method 
	
	static void mergeSort(int arr[] , int start , int end){
		if(end - start < 2){
			return;
		}
		int mid = (start + end )/2;
		
		// using recursive method to do the partitions 
		
		mergeSort(arr, start  , mid);
		mergeSort(arr , mid  , end);
		merge(arr ,start  ,mid ,end );
		}	
	 //method to merge the arrays after partition 
	 static void merge(int arr[] , int start , int mid , int end){
	 	//optimising the  code 
	 	if(arr[mid -1 ] <= arr[mid]){
	 		return;
	 	}
	 	
	 	int leftsize = mid - start ;
	 	int rightsize = end -mid ;
	 	
	 	// creating two new temp arrays
	 	int arrleft[] = new int[leftsize];
	 	int arrright[] = new int[rightsize];
	 	
	 	
	 	for(int i = 0 ; i < leftsize ; i++){
	 		arrleft[i] = arr[start +i ];
	 	}
	 	
	 	for(int j = 0 ;j < rightsize ; j++){
	 	    arrright[j] = arr[mid + j ];
	 	}
	 	
	 	int i=0 , j =0 ;
	 	int k =start ;
	 	
	 	//merging the both temp array
	 	
	 	while(i<leftsize && j< rightsize){
	 		if(arrleft[i] <= arrright[j]){
	 			arr[k]  = arrleft[i];
	 			i++;
	 		}
	 		else {
	 			arr[k] = arrright[j];
	 			j++;
	 		}
	 		k++;
		 }
		 
		 // copy all elements of left array 
		 
		 while(i<leftsize){
		 	arr[k]= arrleft[i];
		 	i++;
		 	k++;
		 }
		  // copy all elements of right array 
		 
		 while(j<rightsize){
		 	arr[k]= arrright[j];
		 	j++;
		 	k++;
		 }
	}

	//print  method 
	static void print_arr(int arr[]){
		for(int value : arr){
			System.out.println(value + " ");
		}
	}
}
