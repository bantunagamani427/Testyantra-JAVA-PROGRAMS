package Arrays;

public class Employee_Method_Argument {
	String name;
	long salary;
	String designation;
	String role;
//	public Employee() {
//		
//	}
	public Employee_Method_Argument(String name, long salary, String designation, String role) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.role = role;
	}

	public static  void display(Employee_Method_Argument[] str) {
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i].name+" "+str[i].salary+" "+str[i].designation+" "+str[i].role);

		}
	}
	public static void main(String[] args) {
		Employee_Method_Argument [] str=new Employee_Method_Argument[3];
		str[0]=new Employee_Method_Argument("naga",500l,"CEO","managing");
		str[1]=new Employee_Method_Argument("bannu",200l,"director","floor");
		str[2]=new Employee_Method_Argument("bittu",100l,"chiarman","assistant");
		//Employee e=new Employee();
		display(str);
		
	}

}
