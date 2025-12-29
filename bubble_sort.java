import java.util.*;
class bubble_sort{
	public static void main(String args[]){
		int intArray[]={45,4,64,78,24,673,17};
		for(int lastunsortedindex = intArray.length - 1; lastunsortedindex > 0; lastunsortedindex--){
			for(int i=0 ; i < lastunsortedindex ; i++){
				if(intArray[i] > intArray[i+1]){
					swap(intArray , i , i+1);
				}
			}
		} 
		for(int i=0 ; i< intArray.length ; i++){
			System.out.println(intArray[i]);
		}
	}
	
	public static void swap(int array[] ,int i ,int j){
		if(i == j){
			return;
		}
		else{
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
}
