public class EmployeeWageCalculation{

   public static void main (String[] args) {

      int Is_Present =1;
      int Emp_Rate_Per_Hour=20;
      int Emp_Daily_Hours=8;
      int DailyWage=0;
   double empCheck = Math.floor(Math.random() *10) %2;
   if ( empCheck == Is_Present ){
         Emp_Daily_Hours=8;
   
      DailyWage=Emp_Daily_Hours*Emp_Rate_Per_Hour;
         System.out.println("IS PRESENT" +DailyWage);}
         else{
         Emp_Daily_Hours=0;
      System.out.println("IS ABSENT");
   }
}
   }
