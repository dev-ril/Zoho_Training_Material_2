// 3. Write a class and override "toString" method in the class object. (When you write a class "A" does it have any parent?, investigate!).

/*
*Object class is present in java.lang package.
*Every class in Java is directly or indirectly derived from the Object class, henceforth it is a child of the Object class.
*If a class does not extend any other class then it is a direct child class of Object and if extends another class then it is indirectly derived. 
*Therefore the Object class methods are available to all Java classes.
*/

class Student
{
	 int roll_no;
	 String name;
	 int age;

	 Student(int roll_no,String name,int age)
	 {
	 	this.roll_no = roll_no;
	 	this.name = name;
	 	this.age = age;
	 }	

	 //Default definition of toString() method in the Object class

	/*public String toString() 
	{
      	return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}*/


	 //Overriding the toString() method of the Object class

	 public String toString()
	 {
	 	return roll_no + " " + name + " " + age;
	 }

}

class ToString
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(01,"Rilwan",20);
		Student s2 = new Student(04,"Hussain",21);			


		System.out.println(s1);
		System.out.println(s2);
	}
}