package package1;

public class Variable {
	
	int b=50;  //inside the class and outside the method
	//it is called as a instance variable that meance global variable
	static int a=10; // the variable which is declered with static keyword
	//same as global variable but inishilised with static keyword

	public static void main(String[] args) {
		
		Variable a1 =new Variable();
		  // TODO Auto-generated method stub
		int a=10; //outside the class and inside the method are called as local variable
		//also called as temprory variable
		System.out.println(a);

	}
	
	void Add() //Method
	{
int b=10;
}
}
