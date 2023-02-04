public class Staff extends Campus {
	String designation;
	String nic;
	int experience;
	double basicSalary;
	final double allowance=10000.00;

	public Staff (String name,String district,String designation,String nic,int experience,double basicSalary){
		super(name,district);
		this.designation=designation;
		this.nic=nic;
		this.experience=experience;
		this.basicSalary=basicSalary;
		
	}
	public double getSalary(){
		double totalSalary=(basicSalary+basicSalary*0.1)+allowance;
		return totalSalary;
	}
	void print(){
		0  QW56802-09 8BH7V6C
		System.out.println("name is "+name);
		System.out.println("district is "+district);
		}
}
