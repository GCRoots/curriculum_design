package dao;

import pojo.EmployeeSalaryAdd;

/**
 * @author shipengfei
 * @data 20-1-7
 */
public interface EmployeeSalaryAddDao {
    EmployeeSalaryAdd addFind(String staffID,String time);
    void insertEmployeeSalaryAdd(EmployeeSalaryAdd employeeSalaryAdd);
    void updateEmployeeSalaryAdd(EmployeeSalaryAdd employeeSalaryAdd);
    void deleteEmployeeSalaryAdd(String staffID,String time);
}
