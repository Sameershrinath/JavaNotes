/*
Data Type
1.char
2.Int
3.Boolean
4.float
5.Double


variable 
1.Local
2.Global





*/


public class FirstProgram 
{
	static String productName="puma";
	public static void main(String args[])
{
		System.out.println("This is my first Program");
		String collageName = "suresh gyan vihar university";
		String address = "143, Jaipur 302017";
		int age = 32;
		float perc= 98.75F;
		float f1=10;
		double value=1.50;

		


		String productName= "motorola G85";
		double productPrice=16999;
		float productRating=4.5F;
		double productMRP=20999;
		System.out.println("Product name : "+productName);
		testVariableTypes();
		testConditionalStatement();
		

}

public static void testVariableTypes()
{
	System.out.println("we are in test function");
	System.out.println("Product name : "+productName);

	
}
public static void testConditionalStatement(){
	int a=2;
	if (a>5){
		System.out.println("geater than 5");
	}
	else{
		System.out.println("smaller than 5");
	}
}

}
 