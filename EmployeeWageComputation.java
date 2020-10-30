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
