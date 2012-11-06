package org.example.infrastructure;

import java.io.Serializable;

import net.sf.oval.Validator;
import org.codehaus.grepo.query.hibernate.repository.ReadWriteHibernateRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidatingReadWriteHibernateRepositoryImpl<T, PK extends Serializable> extends ReadWriteHibernateRepositoryImpl<T, PK> {
    @Autowired
    private Validator ovalValidator;

    @Override
    public PK save(T entity) {
        return super.save(validated(entity));
    }

    private T validated(T entity) {
        ovalValidator.assertValid(entity);
        return entity;
    }
}
