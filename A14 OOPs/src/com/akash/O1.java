package com.akash;
// class and object code in java
public class O1 {
	public static void main(String[] args) {
		
		//Pen
		pen p1 = new pen(); //create a pen object p1
		p1.setColor("blue");
		System.out.println(p1.color);
		p1.setTip(5);
		System.out.println(p1.tip);
		p1.setColor("Yellow");
		System.out.println(p1.color);
		p1.color = "red";
		System.out.println(p1.color);
		
		System.out.println();
		System.out.println();
		//Student
		student s1 = new student(); //create a student object
		s1.setName("Akash");
		System.out.println(s1.name);
		s1.setAge(23);
		System.out.println(s1.age);
		s1.isCalPercentage(24, 56, 75);
		System.out.println(s1.percentage);
	}
}

class pen{
	int tip;
	String color;
	
	//change color Method
	void setColor(String newColor){
		color = newColor;
	}
	
	//change tip Method
	void setTip(int newTip) {
		tip = newTip;
	}
}

class student{
	String name;
	int age;
	double percentage;
	
	void setName(String newName) {
		name = newName;
	}
	
	void setAge(int newAge) {
		age = newAge;
	}
	
	void isCalPercentage(int phy, int chemi, int math) {
		percentage = (phy + chemi + math) / 3;
	}
}
