public class Animal { 
public String Name;
public int Age;
 

	 public void setName(String newName) {
	   this.Name = newName;
	 }
		 public void setAge(int newAge) {
			   this.Age = newAge;
			 }
		 
		 public void info() {
			 
			 
		 }


}

class Zebra extends Animal{
	 public String getName() {
		
		   return Name;
		 }

		 public int getAge() {
			   return Age;
			 }
		 
		 public void info() {
			 System.out.println("Animal is "+Name+ "."+"Its Age is "+Age);
		 }
		 
	


	
}

class Dolphin extends Animal{
	 public String getName() {
		 return Name;
		   
		 }

		 public int getAge() {
			   return Age;
			 }
		 public void info1() {
			 System.out.println("Animal is "+Name+ "."+"Its Age is "+Age);
		 }

	
}