package org.example.infrastructure;

import java.io.Serializable;

import net.sf.oval.Validator;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidationInterceptor extends EmptyInterceptor {
    @Autowired
    private Validator ovalValidator;

    @Override
    public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState, String[] propertyNames, Type[] types) {
        return validate(entity);
    }

    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        return validate(entity);
    }

    private boolean validate(Object entity) {
        ovalValidator.assertValid(entity);
        return false;
    }
}
