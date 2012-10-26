package org.example.domain;

import java.util.List;
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PieRepository {
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<Pie> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM  Pie");
        return query.list();
    }

    public Pie create(Pie pie) {
        Session session = sessionFactory.getCurrentSession();
        session.save(pie);
        return pie;
    }

    public Pie get(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM  Pie where id =" + id);
        return (Pie) query.uniqueResult();
    }
}
