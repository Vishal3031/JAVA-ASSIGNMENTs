//WAJP to print the 1st digit of 3832...

class QSNNN8 {
	public static void main(String[] args) {
		int num=382;
		int FirstDigit=num;

		FirstDigit=(FirstDigit>=10)?(FirstDigit/10>=10?FirstDigit/100:FirstDigit/10):FirstDigit;

		System.out.print("the firstDigit of this number is: "+FirstDigit);   
	}
}  