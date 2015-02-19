import java.util.Date;

public abstract class Person {

    /**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String lastName;

    /**
     * 
     */
    private Boolean isMale;

    /**
     * 
     */
    private Date dob;
    /**
     * 
     */
    public Person() {
    }

    public Person(String f, String l, boolean m, Date d){
    	this.firstName = f;
    	this.lastName = l;
    	this.isMale = m;
    	this.dob = d;
    }

    public String name(){
    	return firstName + "," + lastName;
    }
    
    public void changeName(String f, String l){
    	this.firstName = f;
    	this.lastName = l;
    }
    public boolean isMale(){
    	return this.isMale;
    }

    public Date birthDay(){
    	return this.dob;
    }
}