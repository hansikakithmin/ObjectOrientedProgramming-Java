package Ex1partd;

public class Demo {

	public static void main(String[] args) {
		Float arr1[] = {45f,4f,56f,12f,31f,20f};
		Double arr2[] = {33.0,10.0,6.0,65.0,71.0,21.0};
		
		Sort s1 = new Sort();
		s1.bubbleSort(arr1);
		s1.printArray(arr1);
		s1.bubbleSort(arr2);
		s1.printArray(arr2);

	}

}

/* output
4.0
12.0
20.0
31.0
45.0
56.0

6.0
10.0
21.0
33.0
65.0
71.0
*/