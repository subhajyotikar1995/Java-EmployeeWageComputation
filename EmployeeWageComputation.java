import java.util.Random;

public class EmpWageComp {
    public static void main(String[] args){
       
        EmpWageComp ewc = new EmpWageComp();
        Random ran= new Random();
        int ran1 = ran.nextInt(2);

       
        if( ran1 == 0 ) {
            System.out.println("Employee is Present");
            ewc.wage();
        }else {
            System.out.println("Employee is Absent");
        }
    }
    public void wage(){
        int wagePerHr = 20;
        int dailyWorkHrs = 8;

        int totalDayWage = wagePerHr * dailyWorkHrs;
        System.out.println("Wage : " + totalDayWage);
    }
}

