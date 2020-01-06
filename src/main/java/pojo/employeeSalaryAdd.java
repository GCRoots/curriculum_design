package pojo;

/**
 * @author shipengfei
 * @data 20-1-6
 */
public class employeeSalaryAdd {
    private String staff_id;
    private String time;
    private String basic_wage;
    private String post_salary;
    private String housing_subsidy;
    private String allowance;
    private String salary_add;

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBasic_wage() {
        return basic_wage;
    }

    public void setBasic_wage(String basic_wage) {
        this.basic_wage = basic_wage;
    }

    public String getPost_salary() {
        return post_salary;
    }

    public void setPost_salary(String post_salary) {
        this.post_salary = post_salary;
    }

    public String getHousing_subsidy() {
        return housing_subsidy;
    }

    public void setHousing_subsidy(String housing_subsidy) {
        this.housing_subsidy = housing_subsidy;
    }

    public String getAllowance() {
        return allowance;
    }

    public void setAllowance(String allowance) {
        this.allowance = allowance;
    }

    public String getSalary_add() {
        return salary_add;
    }

    public void setSalary_add(String salary_add) {
        this.salary_add = salary_add;
    }

    @Override
    public String toString() {
        return "employeeSalaryAdd{" +
                "staff_id='" + staff_id + '\'' +
                ", time='" + time + '\'' +
                ", basic_wage='" + basic_wage + '\'' +
                ", post_salary='" + post_salary + '\'' +
                ", housing_subsidy='" + housing_subsidy + '\'' +
                ", allowance='" + allowance + '\'' +
                ", salary_add='" + salary_add + '\'' +
                '}';
    }
}
