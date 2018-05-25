package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    Facade facade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void test() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");

        //When
        employeeDao.save(johnSmith);
        Employee foundEmp = facade.findEmployee("hn");

        //Then
        Assert.assertEquals("Smith", foundEmp.getLastname());

        //CleanUp
        employeeDao.delete(johnSmith.getId());

    }

    @Test
    public void test2() {
        //Given
        Company softwareMachine = new Company("Software Machine");

        //When
        companyDao.save(softwareMachine);
        Company foundCompany = facade.findCompanyByName("Software Machine");

        //then
        Assert.assertEquals("Software Machine", foundCompany.getName());

        //CleanUp
        companyDao.delete(softwareMachine.getId());
    }

}
