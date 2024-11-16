//WAJP to print the 1st digit of 266...

class QSNNN7 {
	public static void main(String[] args) {
		int num=266;
		int FirstDigit=num;

		FirstDigit=(FirstDigit>=10)?(FirstDigit/10>=10?FirstDigit/100:FirstDigit/10):FirstDigit;

		System.out.print("the firstDigit of this value is: "+FirstDigit);
	}
}