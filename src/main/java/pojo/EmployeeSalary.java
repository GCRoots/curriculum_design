package pojo;

/**
 * @author shipengfei
 * @data 20-1-6
 */
public class EmployeeSalary {
    private String staffId;
    private String time;
    private String rewardPuni;
    private String salaryAdd;
    private String salarySub;
    private String realWages;

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

    public String getRewardPuni() {
        return rewardPuni;
    }

    public void setRewardPuni(String rewardPuni) {
        this.rewardPuni = rewardPuni;
    }

    public String getSalaryAdd() {
        return salaryAdd;
    }

    public void setSalaryAdd(String salaryAdd) {
        this.salaryAdd = salaryAdd;
    }

    public String getSalarySub() {
        return salarySub;
    }

    public void setSalarySub(String salarySub) {
        this.salarySub = salarySub;
    }

    public String getRealWages() {
        return realWages;
    }

    public void setRealWages(String realWages) {
        this.realWages = realWages;
    }

    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "staffId='" + staffId + '\'' +
                ", time='" + time + '\'' +
                ", rewardPuni='" + rewardPuni + '\'' +
                ", salaryAdd='" + salaryAdd + '\'' +
                ", salarySub='" + salarySub + '\'' +
                ", realWages='" + realWages + '\'' +
                '}';
    }
}
