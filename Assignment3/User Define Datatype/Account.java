class Account {
	public static void main(String[] args) {
		
		/*Account Name;              //we use this class_name as a dataType, so here, we declared a name variable for initializing object...  
		Account BankName;
		Account IfscCode;
		Account Branch;
		Account Nominee;

		Name=new Account();        //in this we initiallized our object (after declration) using "new" keyword...
		BankName=new Account();
		IfscCode=new Account();
		Branch= new Account();
		Nominee= new Account();*/

		Account Name= new Account();           //in this, we can initialize and declaration with together
		Account BankName= new Account();
		Account IfscCode= new Account();
		Account Branch= new Account();
		Account Nominee= new Account();

		System.out.println(Name);       //it returns Address of .class file....
                System.out.println(BankName);
                System.out.println(IfscCode);
                System.out.println(Branch);
                System.out.println(Nominee);
	}
}