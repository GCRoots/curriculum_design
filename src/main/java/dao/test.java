package dao;

import dao.imp.DepartmentDaoImp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Department;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author shipengfei
 * @data 20-1-8
 */
public class test {
    private DepartmentDao departmentDao=new DepartmentDaoImp();

    public static void main(String[] args) throws IOException {
        new test().a();


    }

    public void a(){
        Department department=departmentDao.findByDepID("1");
        System.out.println(department.toString());
        departmentDao.deleteDepartment("1");
    }
}
