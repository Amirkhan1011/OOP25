package task_4;
import java.util.Date;

public class Employee extends Person implements Comparable<Object>, Cloneable{
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	
	
	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	public double getSalary() {
		return salary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	
	public String toString() {
		return "Employee's name: " + getName() + ", Salary: " + salary +"\nHire date: " + hireDate + ", Insurance number: " + insuranceNumber;
	}
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return super.equals(other) &&
               salary == other.salary &&
               hireDate.equals(other.hireDate) &&
               insuranceNumber.equals(other.insuranceNumber);
    }
    
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int compareTo(Object o) {
		Employee other = (Employee) o;
        if (this.salary > other.salary)
            return 1;
        else if (this.salary < other.salary)
            return -1;
		return 0;
	}

}
