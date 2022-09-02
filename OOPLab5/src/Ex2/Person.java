package Ex2;

public class Person implements ICompute {
	 private String name;
	 private int basicSal;
	 private int otRate;
	 private int otHrs;
	 private int netSal;
	 
	 //parametrized constructor
	public Person(String name, int basicSal, int otRate, int otHrs, int netSal) {
		super();
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
		this.netSal = netSal;
	}
	
	public Person(String name, int basicSal, int otRate, int otHrs) {
		super();
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(int basicSal) {
		this.basicSal = basicSal;
	}

	public int getOtRate() {
		return otRate;
	}

	public void setOtRate(int otRate) {
		this.otRate = otRate;
	}

	public int getOtHrs() {
		return otHrs;
	}

	public void setOtHrs(int otHrs) {
		this.otHrs = otHrs;
	}

	public int getNetSal() {
		return netSal;
	}

	public void setNetSal(int netSal) {
		this.netSal = netSal;
	}
	
	public int calculate() {
		netSal=basicSal+(otRate*otHrs);
		return netSal;
	}
	
	public void display() {
		System.out.println("Name:"+getName());
		System.out.println("NetSalary:"+getNetSal());
		
	}
	  
	 

}
