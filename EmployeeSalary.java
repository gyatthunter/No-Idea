import java.util.Scanner;
public class EmployeeSalary {

    public static double Basic_salary(String[] args) {
        Scanner dhon = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        return dhon.nextDouble();
    }
    public static double Calcualte_hra(double basic) { //hra calculation//
        return basic * 0.20;
    }
    public static double calcualte_da(double basic) { //da calculation//
        return basic * .10;
    }
}