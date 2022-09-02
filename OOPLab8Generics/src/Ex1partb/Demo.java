package Ex1partb;

public class Demo {

	public static void main(String[] args) {
		//part c
		Float arr1[] = {45f,4f,56f,12f,31f,20f};
		Double arr2[] = {33.0,10.0,6.0,65.0,71.0,21.0};
		
		Sort<Float> s1 = new Sort<>();
		s1.add(arr1);
		s1.bubbleSort();
		s1.printArray();
		
		Sort<Double> s2 = new Sort<>();
		s2.add(arr2);
		s2.bubbleSort();
		s2.printArray();

	}

}
