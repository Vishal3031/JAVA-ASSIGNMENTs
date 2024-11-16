//WAPJ to print the 1st digit of 98...

class QSNNN6 {
	public static void main(String[] args) {
		int num=98;
		int firstDigit=num;
		
		firstDigit=(firstDigit>=10)?(firstDigit/10>=10?firstDigit/100:firstDigit/10):firstDigit;

		System.out.print("the first digit of this is: "+firstDigit);
	}
}