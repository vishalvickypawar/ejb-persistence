package com.loonycorn;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class EJBPersistenceBean implements EJBPersistenceRemote{
    public EJBPersistenceBean() {
    }

    @PersistenceContext(unitName="companyPU")
    private EntityManager entityManager;

    public void addEmployee(Employee employee) {

        entityManager.persist(employee);

    }

    @SuppressWarnings("unchecked")
    public List<Employee> getEmployees() {
        return entityManager.createQuery("From Employee").getResultList();
    }
}
