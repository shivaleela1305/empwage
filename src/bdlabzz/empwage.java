package bdlabzz;

public class empwage {

	public static void main(String[] args) {
		System.out.println("welcome to employee wage program");
		
		
		int IS_FULL_TIME = 1;
        double check = Math.floor(Math.random()*10) % 2;
        if(IS_FULL_TIME == check){
            System.out.println("Employee is present");
        }else{
            System.out.println("employee is absent");
        }
        
        
        final int FULL_TIME = 1;
        final int WAGE_PER_HR = 20;
        int empType = (int) (Math.random() * 100) % 2;
        int workingHours = 0;
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present");
            workingHours = 8;
        } else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
        
        final int PART_TIME = 1;
        final int FULL_TIME1 = 2;
        final int WAGE_PER_HR1 = 20;
        int empType1 = (int) (Math.random() * 100) % 3;
        int workingHours1 = 0;
        if (empType1 == FULL_TIME1)
        {
            System.out.println("Employee is Present");
            workingHours1 = 8;
        }else if(empType1 == PART_TIME){
            System.out.println("employee is present part time");
            workingHours1 = 4;
        } 
        else
        {
            System.out.println("Employee is Absent");
        }
        int wage1 = workingHours1 * WAGE_PER_HR1;
        System.out.println("Employee Daily Wage is " + wage1);
        
        final int PART_TIME1 = 1;
        final int FULL_TIME11 = 2;
        final int WAGE_PER_HR11 = 20;
        int empType11 = (int) (Math.random() * 100) % 3;
        int workingHours11 = 0;
        switch (empType11) {
            case FULL_TIME11:
                System.out.println("Employee is Present");
                workingHours11 = 8;
                break;
            case PART_TIME1:
                System.out.println("employee is present part time");
                workingHours11 = 4;
                break;
        
            default:
                System.out.println("Employee is Absent");
                break;
        }
        
        int wage11 = workingHours11 * WAGE_PER_HR11;
        System.out.println("Employee Daily Wage is " + wage11);
        
        final int PART_TIME11 = 1;
        final int FULL_TIME111 = 2;
        final int WAGE_PER_HR111 = 20;
        final int Working_Days = 20;

        int totalWage = 0;
        for(int i = 1;i<Working_Days;i++){
            int empType111 = (int) (Math.random() * 100) % 3;
            int workingHours111 = 0;
            switch (empType111) {
                case FULL_TIME111: workingHours111 = 8;
                case PART_TIME11: workingHours111 = 4;
            
                default: workingHours111 = 0;
            }
            int wage111 = workingHours111 * WAGE_PER_HR111;
            totalWage = totalWage + wage111;
        }
        System.out.println("total wage of the month is " + totalWage);
        
        final int PART_TIME111 = 1;
        final int FULL_TIME1111 = 2;
        final int WAGE_PER_HR1111 = 20;
        final int Working_Days1111 = 20;

        int totalWage1111 = 0;
        for(int i = 1;i<Working_Days1111;i++){
            int empType1111 = (int) (Math.random() * 100) % 3;
            int workingHours1111 = 0;
            switch (empType1111) {
                case FULL_TIME1111: workingHours1111 = 8;
                case PART_TIME111: workingHours1111 = 4;
            
                default: workingHours1111 = 0;
            }
            int wage1111 = workingHours1111 * WAGE_PER_HR1111;
            totalWage1111 = totalWage1111 + wage1111;
        }
        System.out.println("total wage of the month is " + totalWage1111);
                
	}

}
