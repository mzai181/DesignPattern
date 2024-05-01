import DesignPatterns.EmployeeFactory;
import DesignPatterns.Models.*;
import DesignPatterns.EmployeeManagerSingleton;

public class Main {
    public static void main(String[] args) {
        EmployeeManagerSingleton manager = EmployeeManagerSingleton.getInstance();

        manager.addEmployee(EmployeeFactory.makeEmployee(1, "a", 100, 10, EmployeeType.QA));
        manager.addEmployee(EmployeeFactory.makeEmployee(1, "a", 100, 10, EmployeeType.DEVELOPER));
        manager.addEmployee(EmployeeFactory.makeEmployee(1, "a", 100, 10, EmployeeType.HR));

        EmployeeManagerSingleton manager1 = EmployeeManagerSingleton.getInstance();

        assert manager == manager1;
    }
}