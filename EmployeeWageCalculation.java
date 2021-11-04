public class EmployeeWageCalculation{
      public static final int Is_Fulltime =1;
      public static final int Is_Parttime =2;
      public static final int empRatePerHour=20;
	public static final int NumofWorkingDays=2;
	public static final int MaxHoursinaMonth=10;
          public static void main (String[] args) {
      int empHours=0;
      int empWage=0;
	int totalworkingdays=0;
	int totalempHours=0;
	while (totalempHours<=MaxHoursinaMonth&&
			totalworkingdays<NumofWorkingDays) {
		totalworkingdays++;
		int empCheck = (int) Math.floor(Math.random()*10)%3;
		switch (empCheck) {
        case Is_Fulltime:
           empHours=8;
              break;
        case Is_Parttime:
           empHours=4;
           break;
        default:
           empHours=0;
}
    totalempHours +=empHours;
    System.out.println("day#:"+totalworkingdays+"empHr:"+empHours);;
   
}
	int totalempWage=totalempHours * empRatePerHour;
	System.out.println("total emp Wage:"+totalempWage);
}
	}
