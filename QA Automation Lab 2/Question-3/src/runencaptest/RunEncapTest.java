package runencaptest;

public class RunEncapTest {
	private String Name;
	private int Age;
	private int id;
	
	
	public String setName() {
		return Name;
	  }
	public int setAge() {
		return Age;
	  }
	public int setID() {
		return id;
	  }

	  public void getDetails(String newName, int newAge, int newId) {
	    this.Name = newName;
	    this.Age= newAge;
	    this.id = newId;
	  }
	  RunEncapTest()
	  {
		  System.out.println("It is default constructor");
	  }
	  RunEncapTest(String newName, int newAge, int newId)
	  {
		  System.out.println("Name: " + newName + " Age: " + newAge + " ID: " +newId);
	  }
	
	public static void main(String[] args) {
		RunEncapTest obj = new RunEncapTest("ayesha " ,  24,  13456);
	}
}
