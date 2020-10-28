package Employee;

import javax.print.Doc;

public class Doctor extends Employee {
    private int mCategory;

    public Doctor(String fullName, long date, long salary, int category) {
        super(fullName, date, salary);
        mCategory = category;
    }
}
