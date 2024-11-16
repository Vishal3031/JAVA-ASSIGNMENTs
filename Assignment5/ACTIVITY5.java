//WAJP to store char type data ('A') inside the short and int type variable and print it...
	
class ACTIVITY5 {
	public static void main(String[] args) {
		char charValue='A';                           //declare with initialize value
		short shortValue=(short) charValue;           //store charValue into a short we use explicit casting bcz when char is converted, that value become integer value...

		int intValue=charValue;                       //here, we are not using explicit type casting only using implicit bcz, when charvalue change into numeric than the value is integer by default...
		
		System.out.println(charValue);
		System.out.println(shortValue);
		System.out.println(intValue);
	}
}