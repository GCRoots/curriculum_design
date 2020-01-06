package pojo;

/**
 * @author shipengfei
 * @data 20-1-6
 */
public class employeeSalarySub {
    private String staff_id;
    private String time;
    private String union_dues;
    private String water_elec_fee;
    private String housing_fund;
    private String pension;
    private String salary_sub;

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

    public String getUnion_dues() {
        return union_dues;
    }

    public void setUnion_dues(String union_dues) {
        this.union_dues = union_dues;
    }

    public String getWater_elec_fee() {
        return water_elec_fee;
    }

    public void setWater_elec_fee(String water_elec_fee) {
        this.water_elec_fee = water_elec_fee;
    }

    public String getHousing_fund() {
        return housing_fund;
    }

    public void setHousing_fund(String housing_fund) {
        this.housing_fund = housing_fund;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public String getSalary_sub() {
        return salary_sub;
    }

    public void setSalary_sub(String salary_sub) {
        this.salary_sub = salary_sub;
    }

    @Override
    public String toString() {
        return "employeeSalarySub{" +
                "staff_id='" + staff_id + '\'' +
                ", time='" + time + '\'' +
                ", union_dues='" + union_dues + '\'' +
                ", water_elec_fee='" + water_elec_fee + '\'' +
                ", housing_fund='" + housing_fund + '\'' +
                ", pension='" + pension + '\'' +
                ", salary_sub='" + salary_sub + '\'' +
                '}';
    }
}
