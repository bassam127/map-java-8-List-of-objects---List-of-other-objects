import java.math.BigDecimal;

public class SeniorJava {

    private String name;
    private BigDecimal salary;
    private int yearsOfExperience;

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
      
        return name + " Salary:" +salary + yearsOfExperience;
    }
}
