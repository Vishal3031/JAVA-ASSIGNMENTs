class Student {
	public static void main(String[] args) {
		
		/*Student FirstName;              //we use this class_name as a dataType, so here, we declared a name variable for initializing object...  
		Student LastName;
		Student Age;
		Student RegNo;
		Student Course;
		Student Branch;

		FirstName=new Student();        //in this we initiallized our object (after declration) using "new" keyword...
		LastName=new Student();
		Age=new Student();
		RegNo= new Student();
		Course= new Student();
		Branch= new Student();*/

		Student FirstName= new Student();           //in this, we can initialize and declaration with together
		Student LastName= new Student();
		Student Age= new Student();
		Student RegNo= new Student();
		Student Course= new Student();
		Student Branch= new Student();

		System.out.println(FirstName);       //it returns Address of .class file....
                System.out.println(LastName);
                System.out.println(Age);
                System.out.println(RegNo);
                System.out.println(Course);
		System.out.println(Branch);
	}
}