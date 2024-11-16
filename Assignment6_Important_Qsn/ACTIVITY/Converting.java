//WAJP to store char type data('A') inside the short and int type variable and print it....

class Converting {
	public static void main(String[] args) {
		char ch='A';
		short num= (short) ch;
		int num1= ch;

		System.out.println(ch);
		System.out.println(num);
		System.out.println(num1);
	}
}