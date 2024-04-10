package Thigk;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        Experience employee1 = new Experience(1, "Diem", 2005, 123456789, "Diemhht.23ite@vku.udn.vn", "Experience", 0, 6, "Java");
        Fresher employee2 = new Fresher(2, "Nhung", 2005, 987654321, "Nhungnth.23ite@vku.udn.vn", "Fresher", 0, 20200630, 3, "VKU");
        Intern employee3 = new Intern(3, "Trang", 2005, 456789123, "Trangntt.23ite@vku.udn.vn", "Intern", 0, "Computer Science", "Spring 2024", "XYZ University");

        manager.addEmployee(employee1);
        manager.addEmployee(employee2);
        manager.addEmployee(employee3);

        System.out.println("All Employees:");
        manager.showAllEmployees();
        System.out.println();

        Experience newEmployee1 = new Experience(1, "Diem", 19900101, 123456789, "Diemhht.23ite@vku.udn.vn", "Experience", 0, 6, "Java, SQL");
        manager.updateEmployee(0, newEmployee1);

        System.out.println("Updated Employees:");
        manager.showAllEmployees();
        System.out.println();

        manager.deleteEmployee(1);

        System.out.println("Remaining Employees:");
        manager.showAllEmployees();
        System.out.println();
    }
}
