import java.util.*;
import java.util.Scanner;
public class Animal {
  
	public String name;
	public int age;
	
	
	
	public void set_Value(String name, int age) {
		this.name = name;
		this.age = age;
		
		
	}
	
	
}

class Zebra extends Animal{
	public void zinfo() {
		System.out.println("Animal is Zebra");
		
	}
	public String get_Name() {
		return this.name;
	}
	public int get_Age() {
		return this.age;
	}
}

class Dolphin extends Animal {
	
	public void dinfo() {
		System.out.println("Animal is Dolphin");
		
	}
	
	public String get_Name() {
		return this.name;
	}
	public int get_Age() {
		return this.age;
	}
}