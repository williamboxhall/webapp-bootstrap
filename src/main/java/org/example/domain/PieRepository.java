package org.example.domain;

import java.util.List;

import org.codehaus.grepo.query.commons.annotation.GenericQuery;
import org.codehaus.grepo.query.hibernate.repository.ReadWriteHibernateRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PieRepository extends ReadWriteHibernateRepository<Pie, Integer> {
    @GenericQuery
    public List<Pie> findAll();
}
