package Ex8;

public class Cat extends Pet{
    private int livesLeft;
    
    //parameterized constructor
    public Cat(String name, String owner, int age,int livesleft) {
       super(name, owner, age);
       this.livesLeft = livesleft;
     }
    
    //overloaded constructor
    public Cat(String name, String owner){//ex9
    	super(name,owner);//ex9
    }
    
    public void showDetails() {
    	super.showDetails();
    	System.out.println("My age is"+this.livesLeft);
    }
}//end of the pet class
