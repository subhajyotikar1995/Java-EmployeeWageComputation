import java.util.Random;

public class EmpWageComp {
    public static void main(String[] args){
        
        EmpWageComp ewc = new EmpWageComp();

        Random ran= new Random();
        int ran1 = ran.nextInt(3);

        if( ran1 == 0 ) {
            System.out.println("Employee is Present and Working FullTime");
            ewc.fullTime();
        }else if (ran1 == 1){
            System.out.println("Employee is Present and Working PartTime");
            ewc.partTime();
        }else {
            System.out.println("Employee is Absent");
        }

    }
    public void fullTime(){
        int wagePerHr = 20;
        int dailyWorkHrs = 8;

        int totalDayWage = wagePerHr * dailyWorkHrs;
        System.out.println("Wage : " + totalDayWage);
    }
    public void partTime(){
        int wagePerHr = 20;
        int dailyWorkHrs = 4;

        int totalDayWage = wagePerHr * dailyWorkHrs;
        System.out.println("Wage : " + totalDayWage);
    }
}

