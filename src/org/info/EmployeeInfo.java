package org.info;

public class EmployeeInfo {
	private void employeeDetails(String name) {
		System.out.println("Employee name is :"+name);
	}
    private void employeeDetails(long mobile) {
		System.out.println("Employee mobile is :"+mobile);
	}
    private void employeeDetails(int id) {
		System.out.println("Employee Id is :"+ id);
	}
    private void employeeDetails(char gender) {
		System.out.println("Employee Gender is :"+ gender);
	}
    private void EmployeeDetails(String address) {
		System.out.println("Employee Adress is :"+ address);
	}
    private void employeeDetails(float salary) {
		System.out.println("Employee Salary is :"+ salary);
	}
    private void employeeDetails(double dob) {
		System.out.println("Employee Dob is :"+ dob);
	}
    private void employeeDetails(int id,String email) {
		System.out.println("Employee email is :"+ email);
	}
    private void employeeDetails(String email,double prevSalary) {
		System.out.println("Employee prevsalary is :"+ prevSalary);
	}
    private void employeeDetails(float Salary,String empfather) {
		System.out.println("Employee father is :"+ empfather);
	}
    private void employeeDetails(double prevSalary,String empPrevCompany) {
		System.out.println("Employee PrevCompany is :"+ empPrevCompany);
	}
    private void employeeDetails(String empPrevCompany,long UAI) {
		System.out.println("Employee Uai is :"+ UAI);
	}
    private void employeeDetails(long UAI, boolean empRelationship) {
		System.out.println("Employee Relationship is :"+ empRelationship);
	}
    private void employeeDetails(boolean empRelation, String bloodgroup) {
		System.out.println("Employee Bloodgroup is :"+ bloodgroup);
	}
    private void employeeDetails(long empBankAccount,String name) {
		System.out.println("Employee BankAccount is :"+ empBankAccount);
	}
    private void employeeDetails(long mobile, float DateofJoning) {
		System.out.println("Employee Date of Joning :"+ DateofJoning);
	}
    private void employeeDetails(float DateofJoining,int age) {
		System.out.println("Employee Age is :"+ age);
	}
    private void employeeDetails(char genders,String hobby) {
		System.out.println("Employee Hobby is :"+ hobby);
	}
    private void employeeDetails(String hobby,int experience) {
		System.out.println("Employee Experience is :"+ experience);
	}
    private void employeeDetails(String companyAddress, char gender) {
		System.out.println("Employee company address is :"+ companyAddress);

	}
    
    public static void main(String[] args) {
    	EmployeeInfo e = new EmployeeInfo();
    	e.employeeDetails("prince");
    	e.employeeDetails(7299576029l);
    	e.employeeDetails(4757);
    	e.employeeDetails('m');
    	e.EmployeeDetails("wimco nagar");
    	e.employeeDetails(35.025f);
    	e.employeeDetails(13.95);
    	e.employeeDetails(4757,"princeabraham.v@gmail.com");
    	e.employeeDetails("abd@mail", 25.021);
    	e.employeeDetails(20.25f, "vincent");
    	e.employeeDetails(25.045, "abc&co");
    	e.employeeDetails("abc&co", 1012434647l);
    	e.employeeDetails(4557936l, false);
    	e.employeeDetails(false, "o+ve");
    	e.employeeDetails(2453464782517l, "prin");
    	e.employeeDetails(72995760l, 10.2022f);
    	e.employeeDetails(10.2022f, 26);
    	e.employeeDetails('m', "Pubg");
    	e.employeeDetails("cri", 10);
    	e.employeeDetails("Omr", 'm');
	}

}

