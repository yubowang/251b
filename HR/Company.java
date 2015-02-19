import java.util.HashSet;
import java.util.Set;


/**
 * 
 */
public class Company {
	private Set<Employee> employees = new HashSet<Employee>();
	
	public void enrollEmployee(Employee e){
		employees.add(e);
	}
	
	public void layoffEmployee(Employee e){
		if(employees.contains(e)){
			employees.remove(e);
		}
	}
	
	public void bankrupt(){
		employees.clear();
	}
	
	public int size(){
		return employees.size();
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
}
