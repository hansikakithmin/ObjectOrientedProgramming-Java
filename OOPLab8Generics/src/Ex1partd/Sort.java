package Ex1partd;

public class Sort {
	public <E extends Number> void bubbleSort(E[] arr) {
		for(int i=0; i<arr.length-1;i++)
			for(int j=0;j<arr.length-i-1;j++)
				if(arr[j].doubleValue()>arr[j+1].doubleValue()) {
					E temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}
	
	public <E extends Number> void printArray(E arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
		System.out.println();
	}

}
