package pojo;

/**
 * @author shipengfei
 * @data 20-1-6
 */
public class employeeSalary {
    private String staff_id;
    private String time;
    private String reward_puni;
    private String salary_add;
    private String salary_sub;
    private String real_wages;

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

    public String getReward_puni() {
        return reward_puni;
    }

    public void setReward_puni(String reward_puni) {
        this.reward_puni = reward_puni;
    }

    public String getSalary_add() {
        return salary_add;
    }

    public void setSalary_add(String salary_add) {
        this.salary_add = salary_add;
    }

    public String getSalary_sub() {
        return salary_sub;
    }

    public void setSalary_sub(String salary_sub) {
        this.salary_sub = salary_sub;
    }

    public String getReal_wages() {
        return real_wages;
    }

    public void setReal_wages(String real_wages) {
        this.real_wages = real_wages;
    }

    @Override
    public String toString() {
        return "employeeSalary{" +
                "staff_id='" + staff_id + '\'' +
                ", time='" + time + '\'' +
                ", reward_puni='" + reward_puni + '\'' +
                ", salary_add='" + salary_add + '\'' +
                ", salary_sub='" + salary_sub + '\'' +
                ", real_wages='" + real_wages + '\'' +
                '}';
    }
}
