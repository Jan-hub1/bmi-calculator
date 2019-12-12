package pl.janmikolajczak.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.janmikolajczak.model.Person;

@Service
public class CalculatorService {

    @Autowired
    HibernateSessionFactoryService hsfs;

    public void savePerson(Person person) {
        Session session = this.hsfs.getSession();
        Transaction tx = session.beginTransaction();
        session.save(person);
        tx.commit();
        session.close();
    }
}
