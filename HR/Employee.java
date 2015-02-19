import java.util.*;

public class Employee extends Person implements Spouse {
	private String ssn;

	private double salary = 0.0;
	
	private Spouse dependant;
    /**
     * 
     */
    public Employee(String f, String l, boolean m, Date d, String ssn, double s) {
    	super(f, l, m, d);
    	this.setSSN(ssn);
    	this.setSalary(s);
    }
    
    public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSSN() {
		return ssn;
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public void getMarried(Spouse d){
		this.dependant = d;
	}
	
	public boolean hasSpouse(){
		return dependant == null;
	}
	
	public void divorce(){
		this.dependant = null;
	}

}