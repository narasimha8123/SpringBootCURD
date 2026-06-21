package com.asn.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asn.demo.entity.Employee;

@Repository
public interface EmployeeCURDRepo extends JpaRepository<Employee, Long>{

}
