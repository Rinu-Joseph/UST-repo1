
class Manager extends Employee {
    int teamSize;

    public Manager(String name, int employeeID, double salary, int teamSize) {
        super(name, employeeID, salary);
        this.teamSize = teamSize;
    }
    public void display(){
        System.out.println("Name "+ name+" employeeID "+employeeID+" salary "+salary+" teamSize "+teamSize);
    }
}
