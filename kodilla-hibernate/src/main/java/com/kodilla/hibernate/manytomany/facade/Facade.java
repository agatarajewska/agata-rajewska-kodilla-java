package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Facade {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public Company findCompanyByName(String name) {
        return companyDao.retrieveCompanyNameLike("%"+name+"%").get(0);
    }

    public Employee findEmployee(String namePiece) {
        return employeeDao.retrieveEmployeeNameLike("%"+namePiece+"%").get(0);
    }
}

