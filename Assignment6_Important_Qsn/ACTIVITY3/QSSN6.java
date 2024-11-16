/*find the total mark and overall percentage of ashish, where 
	mark in science is 78
	mark in social science is 89
	mark in math is 99
	mark in english is 88
	mark in hindi is 67
	full mark of every individual subject is 100.. */


class QSSN6 {
	public static void main(String[] args) {
		int science= 78;
		int socialScience=89;
		int math=99;
		int english=88;
		int hindi=67;

		int totalMarksOfAshish=science+socialScience+math+english+hindi;
		int totalMark=100*5;

		double PercentageOfAshish=((double) totalMarksOfAshish/totalMark)*100;

		System.out.println("Total mark is: "+totalMark);
		System.out.println("Ashish Overall percentage out of 500 is: "+PercentageOfAshish);
	}
}
