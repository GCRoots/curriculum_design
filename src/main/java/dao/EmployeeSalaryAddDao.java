package dao;

import org.apache.ibatis.annotations.Param;
import pojo.EmployeeSalaryAdd;

/**
 * @author shipengfei
 * @data 20-1-7
 */
public interface EmployeeSalaryAddDao {
    EmployeeSalaryAdd addFind(@Param("staffId") String staffID,@Param("time") String time);
    void insertEmployeeSalaryAdd(EmployeeSalaryAdd employeeSalaryAdd);
    void updateEmployeeSalaryAdd(EmployeeSalaryAdd employeeSalaryAdd);
    void deleteEmployeeSalaryAdd(String staffID);
}
