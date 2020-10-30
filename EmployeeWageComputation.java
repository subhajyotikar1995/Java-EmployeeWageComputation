import java.util.Random;

public class EmpWageComp {
    public static void main(String[] args){
       
        EmpWageComp ewc = new EmpWageComp();

     
        Random ran= new Random();
        int ran1 = ran.nextInt(3);

     
        switch (ran1){
            case 0 :
                System.out.println("Employee is Present and Working FullTime");
                ewc.fullTime();
                break;
            case 1:
                System.out.println("Employee is Present and Working PartTime");
                ewc.partTime();
                break;
            case 2:
                System.out.println("Employee is Absent");
                break;
        }

    }
  
    public void fullTime(){
        int wagePerHr = 20;
        int dailyWorkHrs = 8;
        int workingDays = 20;

        int totalMonthWage = wagePerHr * dailyWorkHrs * workingDays;
        System.out.println("Monthly Wage : " + totalMonthWage);
    }
    
    public void partTime(){
        int wagePerHr = 20;
        int dailyWorkHrs = 4;
        int workingDays = 20;

        int totalMonthWage = wagePerHr * dailyWorkHrs * workingDays;
        System.out.println("Monthly Wage : " + totalMonthWage);
    }
}


