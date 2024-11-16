class User {
	public static void main(String[] args) {
		
		/*User FirstName;              //we use this class_name as a dataType, so here, we declared a name variable for initializing object...  
		User LastName;
		User DOB;
		User Location;
		User Handset;

		FirstName=new User();        //in this we initiallized our object (after declration) using "new" keyword...
		LastName=new User();
		Dob=new User();
		Location= new User();
		Handset= new User();*/

		User FirstName= new User();           //in this, we can initialize and declaration with together
		User LastName= new User();
		User DOB= new User();
		User Location= new User();
		User HandSet= new User();

		System.out.println(FirstName);       //it returns Address of .class file....
                System.out.println(LastName);
                System.out.println(DOB);
                System.out.println(Location);
                System.out.println(HandSet);
	}

}