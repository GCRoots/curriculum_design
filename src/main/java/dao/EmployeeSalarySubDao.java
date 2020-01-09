package dao;

import org.apache.ibatis.annotations.Param;
import pojo.EmployeeSalarySub;

/**
 * @author shipengfei
 * @data 20-1-7
 */
public interface EmployeeSalarySubDao {
    EmployeeSalarySub subFind(@Param("staffId") String staffID, @Param("time") String time);
    void insertEmployeeSalarySub(EmployeeSalarySub employeeSalarySub);
    void updateEmployeeSalarySub(EmployeeSalarySub employeeSalarySub);
    void deleteEmployeeSalarySub(String staffID);
}
