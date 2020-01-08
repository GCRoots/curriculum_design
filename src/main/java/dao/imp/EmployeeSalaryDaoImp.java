package dao.imp;

import dao.EmployeeSalaryDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.EmployeeSalary;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author shipengfei
 * @data 20-1-7
 */
public class EmployeeSalaryDaoImp implements EmployeeSalaryDao {
    private SqlSession session;


    @Override
    public EmployeeSalary salaryFind(String staffID, String time) {
        EmployeeSalary employeeSalary=new EmployeeSalary();

        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            session=sqlSessionFactory.openSession();

            EmployeeSalaryDao employeeDao=session.getMapper(EmployeeSalaryDao.class);
            employeeSalary=employeeDao.salaryFind(staffID,time);

            session.commit();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return employeeSalary;
    }

    @Override
    public void deleteEmployeeSalary(String staffID, String time) {
        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            session=sqlSessionFactory.openSession();

            EmployeeSalaryDao employeeDao=session.getMapper(EmployeeSalaryDao.class);
            employeeDao.deleteEmployeeSalary(staffID,time);

            session.commit();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
}
