import java.util.ArrayList;
import java.util.List;



public  class Employee  {
	int id;
	String name;
	double salary;
	
	public Employee() {	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

class Collections{
    
    public  List<Employee> employeeList;

    public Collections() {
        employeeList = new ArrayList<>();
    }

    
    public void addEmployee(Employee emp){
        employeeList.add(emp);
        System.out.println("Employee added: " + emp);
        
    }
    public void removeEmployee(Employee id){
    
    }
    public void FindEmployee(Employee id) {
        
    }
    public void getEmployeeList() {

    }
        
}

public class ps005{
    public static void main(String[] args) {
        Collections empCollection = new Collections();


        empCollection.addEmployee(new Employee(1, "Mani", 50000));
        empCollection.addEmployee(new Employee(2, "Srujan", 60000));
    

    }
}