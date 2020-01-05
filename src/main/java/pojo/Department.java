package pojo;

/**
 * @author shipengfei
 * @data 19-12-29
 */
public class Department {
    private String dep_id;
    private String dep_name;
    private String header;
    private String number;

    public String getDep_id() {
        return dep_id;
    }

    public void setDep_id(String dep_id) {
        this.dep_id = dep_id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dep_id='" + dep_id + '\'' +
                ", dep_name='" + dep_name + '\'' +
                ", header='" + header + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
