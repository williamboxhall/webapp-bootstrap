package org.example;

import java.util.List;
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HelloService {
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<Hello> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM  Hello");
        List list = query.list();
        System.out.println("number of hellos: " + list.size());
        return list;
    }

    public void add(Hello hello) {
        Session session = sessionFactory.getCurrentSession();
        session.save(hello);
    }

    public void delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Hello hello = (Hello) session.get(Hello.class, id);
        session.delete(hello);
    }
}
