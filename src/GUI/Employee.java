package GUI;

public class Employee {
    private String ID;
    private String Name;
    private String Position;
    private double Salary;

    public Employee(String ID, String Name, String Position, double Salary) {
        this.ID = ID;
        this.Name = Name;
        this.Position = Position;
        this.Salary = Salary;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getPosition() {
        return Position;
    }

    public double getSalary() {
        return Salary;
    }   
}