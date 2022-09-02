package Ex1partb;
//converting sort class to genric to input any kind of data
public class Sort<T extends Number> {
	T t[];
	
	public void add(T val[]) {
		this.t=val;
	}
	
	public T[] get() {
		return t;
	}
	//this changes are normal methods not generic method
	public void bubbleSort() {
		for(int i=0; i<t.length-1;i++)
			for(int j=0;j<t.length-i-1;j++)
				if(t[j].doubleValue()>t[j+1].doubleValue()) {
					T temp = t[j];
					t[j] = t[j+1];
					t[j+1] = temp;
				}
	}
	
	public void printArray() {
		for(int i=0; i<t.length;i++) {
			System.out.println(t[i]+"");
		}
		System.out.println();
	}

}
