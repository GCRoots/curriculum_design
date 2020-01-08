package pojo;

/**
 * @author shipengfei
 * @data 19-12-29
 */
public class Employee {
    private String birthday;
    private String sex;
    private String staffId;
    private String staffName;
    private String depName;
    private String partiTime;
    private String title;
    private String position;
    private String politicalStatus;
    private String maritalStatus;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String dep_name) {
        this.depName = dep_name;
    }

    public String getPartiTime() {
        return partiTime;
    }

    public void setPartiTime(String partiTime) {
        this.partiTime = partiTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", staffId='" + staffId + '\'' +
                ", staffName='" + staffName + '\'' +
                ", depName='" + depName + '\'' +
                ", partiTime='" + partiTime + '\'' +
                ", title='" + title + '\'' +
                ", position='" + position + '\'' +
                ", politicalStatus='" + politicalStatus + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}';
    }
}
