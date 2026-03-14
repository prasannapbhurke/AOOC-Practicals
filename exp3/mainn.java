class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.05;
    }

    public void generatePerformanceReport() {
        System.out.println("Performance report for " + name + " (" + jobTitle + ")");
    }

    public void manageProjects() {
        System.out.println(name + " is managing general tasks.");
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println("Manager " + name + " performance: Excellent leadership.");
    }

    @Override
    public void manageProjects() {
        System.out.println("Manager " + name + " is overseeing multiple projects.");
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println("Developer " + name + " performance: Strong coding skills.");
    }

    @Override
    public void manageProjects() {
        System.out.println("Developer " + name + " is working on development tasks.");
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.08;
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println("Programmer " + name + " performance: Efficient programming.");
    }

    @Override
    public void manageProjects() {
        System.out.println("Programmer " + name + " is handling coding assignments.");
    }
}

public class Mainn {
    public static void main(String[] args) {
        Manager m = new Manager("Amit", "Pune", 80000);
        Developer d = new Developer("Neha", "Mumbai", 60000);
        Programmer p = new Programmer("Ravi", "Nagpur", 50000);

        System.out.println("Manager Bonus: " + m.calculateBonus());
        m.generatePerformanceReport();
        m.manageProjects();

        System.out.println();

        System.out.println("Developer Bonus: " + d.calculateBonus());
        d.generatePerformanceReport();
        d.manageProjects();

        System.out.println();

        System.out.println("Programmer Bonus: " + p.calculateBonus());
        p.generatePerformanceReport();
        p.manageProjects();
    }
}