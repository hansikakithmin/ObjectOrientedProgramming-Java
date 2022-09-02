package Ex1;

public class Demo {

	public static void main(String[] args) {
		//create an int array with 10 elements
		int arr[] = {45,3,66,23,100,12,1,49,26,22};
		
		//call the bubble method in main function
		Sort sort = new Sort();
		sort.bubbleSort(arr);
		
		System.out.println("Sorted Array:");
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]+"");
		}

	}

}

//part a. numbers are sorted. but never used generic yet
