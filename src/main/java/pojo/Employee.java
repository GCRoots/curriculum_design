package pojo;

/**
 * @author shipengfei
 * @data 19-12-29
 */
public class Employee {
    private String birthday;
    private String sex;
    private String staff_id;
    private String staff_name;
    private String dep_name;
    private String parti_time;
    private String title;
    private String position;
    private String political_status;
    private String marital_status;

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

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getParti_time() {
        return parti_time;
    }

    public void setParti_time(String parti_time) {
        this.parti_time = parti_time;
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

    public String getPolitical_status() {
        return political_status;
    }

    public void setPolitical_status(String political_status) {
        this.political_status = political_status;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", staff_id='" + staff_id + '\'' +
                ", staff_name='" + staff_name + '\'' +
                ", dep_name='" + dep_name + '\'' +
                ", parti_time='" + parti_time + '\'' +
                ", title='" + title + '\'' +
                ", position='" + position + '\'' +
                ", political_status='" + political_status + '\'' +
                ", marital_status='" + marital_status + '\'' +
                '}';
    }
}
