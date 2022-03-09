package main;

public class EmpWageBuilderUC1 {

    public static void main(String[] args) {
        int Present=1;
        int WagePerHr=20;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck==Present) {
            System.out.println("employee is present");
            int workHour =8;

            int totalWage;
            totalWage = (workHour * WagePerHr);
            System.out.println("total wage is :");
            System.out.println(totalWage);}
        else{
            System.out.println("employee is absent");
            System.out.println("total wage is : ");;
            int Wage = 0;
            System.out.println(Wage);}
    }
}
