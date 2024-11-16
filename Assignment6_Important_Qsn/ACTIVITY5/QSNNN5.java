//WAJP to print the 1st digit of 23...

class QSNNN5 {
	public static void main(String[] args) {
	int num=23;
	int FirstDigit= num;

	FirstDigit=(FirstDigit>=10)?(FirstDigit/10>=10?FirstDigit/100:FirstDigit/10):FirstDigit;

	System.out.print("the FirstDigit of this number: "+FirstDigit);
	}
}