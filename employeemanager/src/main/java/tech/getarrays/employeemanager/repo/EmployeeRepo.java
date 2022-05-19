/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tech.getarrays.employeemanager.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee;

/**
 *
 * @author LENOVO
 */
public interface EmployeeRepo extends JpaRepository<Employee, Integer>  {

    public void deleteEmployeeById(Integer id);

    public Optional<Employee> findEmployeeById(Integer id);
    
    
}
