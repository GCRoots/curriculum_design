package dao;

import pojo.EmployeeSalarySub;

/**
 * @author shipengfei
 * @data 20-1-7
 */
public interface EmployeeSalarySubDao {
    EmployeeSalarySub subFind(String staffID, String time);
    void insertEmployeeSalarySub(EmployeeSalarySub employeeSalarySub);
    void updateEmployeeSalarySub(EmployeeSalarySub employeeSalarySub);
    void deleteEmployeeSalarySub(String staffID,String time);
}
