
 class Employee {
//    Base Class - Employee:
//
//    Create a base class called Employee.
//    Include attributes name (String), employeeID (int), and salary (double).
//    Include a method called displayDetails that prints the name, employee ID, and salary of the employee.
    String name;
    int employeeID;
    double salary;

    public Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee Details: \n Name :"+ name+"\n employeeID :"+employeeID+" \n salary :"+salary);
    }
}
