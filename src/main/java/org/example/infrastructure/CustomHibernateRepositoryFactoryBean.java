package org.example.infrastructure;

import org.codehaus.grepo.query.hibernate.repository.HibernateRepositoryFactoryBean;

public class CustomHibernateRepositoryFactoryBean<T> extends HibernateRepositoryFactoryBean<T> {
    @Override
    protected Class<?> getDefaultTargetClass() {
        return CustomReadWriteHibernateRepositoryImpl.class;
    }
}
