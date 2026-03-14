public class EmployeeTest {
    static class Employee {
        private String firstName;
        private String lastName;
        private double monthlySalary;

        public Employee(String firstName, String lastName, double monthlySalary) {
            this.firstName = firstName;
            this.lastName = lastName;
            if (monthlySalary > 0)
                this.monthlySalary = monthlySalary;
            else
                this.monthlySalary = 0.0;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setMonthlySalary(double monthlySalary) {
            if (monthlySalary > 0)
                this.monthlySalary = monthlySalary;
            else
                this.monthlySalary = 0.0;
        }

        public double getMonthlySalary() {
            return monthlySalary;
        }

        public double getYearlySalary() {
            return monthlySalary * 12;
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Om", "Patil", 20000);
        Employee e2 = new Employee("Sanil", "Patil", 25000);

        System.out.println(e1.getFirstName() + " yearly salary: " + e1.getYearlySalary());
        System.out.println(e2.getFirstName() + " yearly salary: " + e2.getYearlySalary());

        e1.setMonthlySalary(e1.getMonthlySalary() * 1.10);
        e2.setMonthlySalary(e2.getMonthlySalary() * 1.10);

        System.out.println("After 10% raise:");

        System.out.println(e1.getFirstName() + " yearly salary: " + e1.getYearlySalary());
        System.out.println(e2.getFirstName() + " yearly salary: " + e2.getYearlySalary());
    }
}