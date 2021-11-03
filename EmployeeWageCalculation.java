public class EmployeeWageCalculation{

	public static void main (String[] args) {
		
		int Is_Fulltime =1;
		int Is_Parttime =2;
		int empRatePerHour=20;
		int empHours=0;
		int empWage=0;
	double empCheck = Math.floor(Math.random() *10) %3;

	if( empCheck == Is_Fulltime ) {
		empHours=4;
		System.out.println("IS PARTTIME" + empWage);}
	else if (empCheck == Is_Parttime ) {
		empHours=8;
		System.out.println("IS FULLTIME" + empWage);}
		else  {
		empHours=0;
		empWage= empHours*empRatePerHour;
		System.out.println("IS ABSENT" + empWage);
}
	}
	}
