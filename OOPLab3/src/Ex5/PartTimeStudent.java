package Ex5;
//ex7 part
public class PartTimeStudent extends Student {
	String noOfWH;
	public PartTimeStudent(String newName,String newAddress,String newstdid, String newnoOfWH) {
		super(newName, newAddress,newstdid);
		noOfWH=newnoOfWH;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("My working hours are"+noOfWH);
	}

}
