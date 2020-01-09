package dao;


import org.apache.ibatis.annotations.Param;
import pojo.EmployeeSalary;


/**
 * @author shipengfei
 * @data 20-1-7
 */
public interface EmployeeSalaryDao {
    EmployeeSalary salaryFind(@Param("staffId") String staffID, @Param("time") String time);
    void deleteEmployeeSalary(String staffID);
    void upadtaEmployeeSalary(EmployeeSalary employeeSalary);
}
