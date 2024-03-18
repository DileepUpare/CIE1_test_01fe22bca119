class Emp{
    String name;
    int EmpId;
    float Salary;
    
    public Emp(String Ename, int EmployeeId, float Esalary){
        name = Ename;
        EmpId = EmployeeId;
        Salary = Esalary;
    }

    public void DisplayDetails(){
        System.out.println("Employee Name:" + name);
        System.out.println("Employee ID:" + EmpId);
        System.out.println("Employee Salary:" + Salary);
    }
}

public class Employee{
    public static void main(String[] args){
        Emp E1 = new Emp("Ramesh", 111, 50000);
        E1.DisplayDetails();
    }
}

