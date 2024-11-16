//WAJP to store int value into the byte, short, long, float, double, char type variable..

class cnvrtIntIntoAll {
	public static void main(String[] args) {
		
		int IntValue=65;

		byte ByteValue=(byte) IntValue;
		short ShortValue=(short) IntValue;
		float FloatValue=(float) IntValue;
		double DoubleValue= IntValue;
		char CharValue= (char) IntValue;

		System.out.println("the integer value is : "+IntValue);
		System.out.println("After converted int into Byte : "+ByteValue);
		System.out.println("After converted int into short : "+ShortValue);
		System.out.println("After converted int into Float : "+FloatValue);
		System.out.println("After converted int into Double : "+DoubleValue);
		System.out.println("After converted int into Char : "+CharValue);
	}
}