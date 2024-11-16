class Driver {
	public static void main(String[] args) {
		
		/*Driver Vishal;              //we use this class_name as a dataType, so here, we declared a name variable for initializing object...  
		Driver Vihaan;
		Driver Bishu;
		Driver Rahul;
		Driver Nisha;

		Vishal=new Driver();        //in this we initiallized our object (after declration) using "new" keyword...
		Vihaan=new Driver();
		Bishu=new Driver();
		Rahul= new Driver();
		Nisha= new Driver();*/

		Driver Vishal= new Driver();           //in this, we can initialize and declaration with together
		Driver Vihaan= new Driver();
		Driver Bishu= new Driver();
		Driver Rahul= new Driver();
		Driver Nisha= new Driver();

		System.out.println(Vishal);       //it returns Address of .class file....
                System.out.println(Vihaan);
                System.out.println(Bishu);
                System.out.println(Rahul);
                System.out.println(Nisha);
	}
}