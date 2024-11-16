class Bank {
	public static void main(String[] args) {
		
		/*Bank Name;              //we use this class_name as a dataType, so here, we declared a name variable for initializing object...  
		Bank Branch;
		Bank IfscCode;
		Bank AccDept;
		Bank Casier;

		Name=new Bank();        //in this we initiallized our object (after declration) using "new" keyword...
		Branch=new Bank();
		IfscCode=new Bank();
		AccDept= new Bank();
		Casier= new Bank();*/

		Bank Name= new Bank();           //in this, we can initialize and declaration with together
		Bank Branch= new Bank();
		Bank IfscCode= new Bank();
		Bank AccDept= new Bank();
		Bank Casier= new Bank();

		System.out.println(Name);       //it returns Address of .class file....
                System.out.println(Branch);
                System.out.println(IfscCode);
                System.out.println(AccDept);
                System.out.println(Casier);
	}
}