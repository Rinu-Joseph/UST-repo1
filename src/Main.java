//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, 80000.0, 5);
        Employee developer = new Developer("Bob", 102, 60000.0, "Java");

// Displaying information about each employee
        manager.display();
        developer.display();
        }
    }
