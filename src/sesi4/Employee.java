package sesi4;

public class Employee {
    public String name;
    public double salary;
    public String role;
    public String type;
    public boolean isActive;

    public Employee(String name, double salary, String role, String type, boolean isActive) {
        this.name = name;
        this.salary = salary;
        this.role = role;
        this.type = type;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
