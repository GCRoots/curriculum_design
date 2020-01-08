package pojo;

/**
 * @author shipengfei
 * @data 20-1-6
 */
public class EmployeeSalarySub {
    private String staffId;
    private String time;
    private String unionDues;
    private String waterElecFee;
    private String housingFund;
    private String pension;
    private String salarySub;

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

    public String getUnionDues() {
        return unionDues;
    }

    public void setUnionDues(String unionDues) {
        this.unionDues = unionDues;
    }

    public String getWaterElecFee() {
        return waterElecFee;
    }

    public void setWaterElecFee(String waterElecFee) {
        this.waterElecFee = waterElecFee;
    }

    public String getHousingFund() {
        return housingFund;
    }

    public void setHousingFund(String housingFund) {
        this.housingFund = housingFund;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public String getSalarySub() {
        return salarySub;
    }

    public void setSalarySub(String salarySub) {
        this.salarySub = salarySub;
    }

    @Override
    public String toString() {
        return "EmployeeSalarySub{" +
                "staffId='" + staffId + '\'' +
                ", time='" + time + '\'' +
                ", unionDues='" + unionDues + '\'' +
                ", waterElecFee='" + waterElecFee + '\'' +
                ", housingFund='" + housingFund + '\'' +
                ", pension='" + pension + '\'' +
                ", salarySub='" + salarySub + '\'' +
                '}';
    }
}
