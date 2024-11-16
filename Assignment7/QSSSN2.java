//WAJP to check whether the number is even or odd using conditional operator only and trace it...

class QSSSN2 {
	public static void main(String[] args) {
		int num=12;

		String check=(num%2==0)?"number is even":"number is ODD";

		//String check=(num%2==0)?"number is even":(num%2!=0 || num%2==1)?"number is ODD":"I don't know about this";

		System.out.print(check);
	}
}