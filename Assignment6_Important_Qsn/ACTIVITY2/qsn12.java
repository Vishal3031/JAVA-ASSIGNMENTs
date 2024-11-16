//find the 3rd power of 8...

class qsn12 {
	public static void main(String[] args) {

	   //TRICK 1
		int num=8;
		System.out.println((int)num*(int)num*(int)num+"\n");

	   //TRICK 2
		int num2=8*8*8;
		System.out.println(num2+"\n");




	   //TRICK 3   //Math.pow() is a method in Java's java.lang.Math class that is used to raise a number to the power of another number. It takes two  arguments: the base and the exponent. It returns the result as a double value.

		double num1=Math.pow(8, 3);
		System.out.println((int)num1+"\n");    //the result comes in double with decimal so we declare this as int with the help of explicitly or type casting operator..


	}
}