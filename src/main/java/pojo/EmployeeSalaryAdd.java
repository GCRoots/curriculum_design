package pojo;

/**
 * @author shipengfei
 * @data 20-1-6
 */
public class EmployeeSalaryAdd {
    private String staffId;
    private String time;
    private String basicWage;
    private String postSalary;
    private String housingSubsidy;
    private String allowance;
    private String salaryAdd;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBasicWage() {
        return basicWage;
    }

    public void setBasicWage(String basicWage) {
        this.basicWage = basicWage;
    }

    public String getPostSalary() {
        return postSalary;
    }

    public void setPostSalary(String post_salary) {
        this.postSalary = post_salary;
    }

    public String getHousingSubsidy() {
        return housingSubsidy;
    }

    public void setHousingSubsidy(String housingSubsidy) {
        this.housingSubsidy = housingSubsidy;
    }

    public String getAllowance() {
        return allowance;
    }

    public void setAllowance(String allowance) {
        this.allowance = allowance;
    }

    public String getSalaryAdd() {
        return salaryAdd;
    }

    public void setSalaryAdd(String salaryAdd) {
        this.salaryAdd = salaryAdd;
    }

    @Override
    public String toString() {
        return "EmployeeSalaryAdd{" +
                "staffId='" + staffId + '\'' +
                ", time='" + time + '\'' +
                ", basicWage='" + basicWage + '\'' +
                ", postSalary='" + postSalary + '\'' +
                ", housingSubsidy='" + housingSubsidy + '\'' +
                ", allowance='" + allowance + '\'' +
                ", salaryAdd='" + salaryAdd + '\'' +
                '}';
    }
}
