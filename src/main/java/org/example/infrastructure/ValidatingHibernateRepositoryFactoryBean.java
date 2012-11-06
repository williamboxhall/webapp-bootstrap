package org.example.infrastructure;

import org.codehaus.grepo.query.commons.repository.GenericQueryRepositorySupport;
import org.codehaus.grepo.query.hibernate.repository.HibernateRepositoryFactoryBean;

public class ValidatingHibernateRepositoryFactoryBean<T> extends HibernateRepositoryFactoryBean<T> {
    @Override
    protected Class<?> getDefaultTargetClass() {
        return ValidatingReadWriteHibernateRepositoryImpl.class;
    }

    @Override
    protected void configureTarget(GenericQueryRepositorySupport<T> target) {
        super.configureTarget(target);
        getApplicationContext().getAutowireCapableBeanFactory().autowireBean(target);
    }
}
