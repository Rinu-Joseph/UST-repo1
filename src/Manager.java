
class Manager extends Employee {
    int teamSize;

    public Manager(String name, int employeeID, double salary, int teamSize) {
        super(name, employeeID, salary);
        this.teamSize = teamSize;
    }
    public void displayDetails(){
        System.out.println("Employee Details :\n Name :"+ name+"\n employeeID :"+employeeID+"\n salary "+salary+"\n teamSize "+teamSize);
    }
}
