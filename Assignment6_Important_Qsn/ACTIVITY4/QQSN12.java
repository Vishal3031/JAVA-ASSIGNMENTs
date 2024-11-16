//5%0...

class QQSN12 {
	public static void main(String[] args) {
		double num=(double)5%0;
		System.out.print(num);      //Arithmetic exception ,  because you cannot perform a modulo operation with zero as the divisor.
	}
}