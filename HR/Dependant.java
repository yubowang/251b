import java.util.Date;

/**
 * 
 */
public class Dependant extends Person implements Spouse {

    /**
     * 
     */
	private Employee sponsor;
	
	public Dependant(String f, String l, boolean m, Date d, Employee s){
		super(f, l, m, d);
		this.sponsor = s;
	}
	
	public Employee getSponsor() {
		return sponsor;
	}
	
	public void setSponsor(Employee sponsor) {
		this.sponsor = sponsor;
	}


}