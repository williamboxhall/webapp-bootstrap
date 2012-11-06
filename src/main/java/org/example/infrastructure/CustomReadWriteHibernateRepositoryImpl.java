package org.example.infrastructure;

import java.io.Serializable;

import org.codehaus.grepo.query.hibernate.repository.ReadWriteHibernateRepositoryImpl;

public class CustomReadWriteHibernateRepositoryImpl<T, PK extends Serializable> extends ReadWriteHibernateRepositoryImpl<T, PK> {
    @Override
    public PK save(T entity) {
        System.out.println("grepo fully customizable");
        return super.save(entity);
    }
}
