package dao;


import pojo.EmployeeSalary;

/**
 * @author shipengfei
 * @data 20-1-7
 */
public interface EmployeeSalaryDao {
    EmployeeSalary salaryFind(String staffID, String time);
    void deleteEmployeeSalary(String staffID,String time);
}
