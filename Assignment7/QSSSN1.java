class QSSSN1 {
	public static void main(String[] args) {
		int a=10;
		int b=20;

		System.out.println(a++); //10
		System.out.println(b--); //20
		System.out.println(++a); //12
		System.out.println(--b); //18
		System.out.println(++a + ++a); //27
		System.out.println(--b - --b); //1
		System.out.println(--a + --b + a++ + b++ + a + b +"java");  //13+15+13+15+14+16=86
	}
}