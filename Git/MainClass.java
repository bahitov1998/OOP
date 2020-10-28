import Employee.Doctor;
import Employee.Lawer;

public class MainClass {
    public static void main(String[] args) {

        Doctor d1 = new Doctor("Viktor", 2004, 17000, 3);
        Lawer l1 = new Lawer("Gennadiy", 1993, 34000, "Criminal");

        double totalSalary = d1.getSalaryUah() + l1.getSalaryUah();

        System.out.println("total salary = " + totalSalary);
    }
}
