package pojo;

/**
 * @author shipengfei
 * @data 19-12-29
 */
public class Department {
    private String depId;
    private String depName;
    private String header;
    private String number;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
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
                "depId='" + depId + '\'' +
                ", depName='" + depName + '\'' +
                ", header='" + header + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
