class Bike {
	public static void main(String[] args) {
		
		/*Bike KTM;              //we use this class_name as a dataType, so here, we declared a name variable for initializing object...  
		Bike Hero;
		Bike Pulsure;
		Bike paltina;
		Bike Duke;

		KTM=new Bike();        //in this we initiallized our object (after declration) using "new" keyword...
		Hero=new Bike();
		Pulsure=new Bike();
		Paltina= new Bike();
		Duke= new Bike();*/

		Bike KTM= new Bike();           //in this, we can initialize and declaration with together
		Bike Hero= new Bike();
		Bike Pulsure= new Bike();
		Bike Paltina= new Bike();
		Bike Duke= new Bike();

		System.out.println(KTM);       //it returns Address of .class file....
                System.out.println(Hero);
                System.out.println(Pulsure);
                System.out.println(Paltina);
                System.out.println(Duke);
	}
}