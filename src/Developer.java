
 class Developer extends Employee {
//    Derived Classes - Manager and Developer:
//
//    Create two derived classes, Manager and Developer, which inherit from the Employee base class.
//    For the Manager class, include an additional attribute teamSize (int).
//    For the Developer class, include an additional attribute programmingLanguage (String).
//    Implement constructors in each derived class to initialize both the base class attributes and the specific attributes for that class.
//    Override the displayDetails method in each derived class to include information about the specific attributes.
String programmingLanguage;

    public Developer(String name, int employeeID, double salary, String programmingLanguage) {
        super(name, employeeID, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public void display(){
        System.out.println("Name "+ name+" employeeID "+employeeID+" salary "+salary+" programingLanguage "+programmingLanguage);
    }
}
