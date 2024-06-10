package com.loonycorn;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface EJBPersistenceRemote {

    void addEmployee(Employee employee);

    List<Employee> getEmployees();
}
