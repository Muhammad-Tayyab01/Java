// class to perform encapsulation 
public class RunEncapTest {
	private String Name;
	 private int Age;
	 private int id;

	
	 // Default constructor
	 public RunEncapTest(){
		 
	 }
	 
	 // Parameterized Constructor
    public RunEncapTest(String name, int age, int id){
		this.Name = name;
		this.Age = age;
		this.id = id;
		
		
	 }
	 
 
 // Setter

    // initialize name
    public void setName(String name) {
      this.Name = name;
    }
   // initialize age
    public void setAge(int age) {
      this.Age = age;
    }
     // initialize id
    public void setId(int id) {
      this.id = id;
    }
    

   // Getters 
    
    // access name
    public String getName() {
      return this.Name;
    }
    
 // access age
    public int getAge() {
      return this.Age;
    }
    
 // access age
    public int getId() {
      return this.id;
    }

}
