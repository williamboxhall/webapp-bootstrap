package org.example.infrastructure;

import com.googlecode.simpleobjectassembler.converter.AbstractObjectConverter;
import com.googlecode.simpleobjectassembler.converter.mapping.Exclusions;

import java.lang.reflect.Field;

public abstract class AbstractConverter<Source, Destination> extends AbstractObjectConverter<Source, Destination> {
    @Override
    public abstract Destination createDestinationObject(Source source);

    @Override
    protected Exclusions alwaysExcludeProperties() {
        final Exclusions exclusions = new Exclusions();
        for (Field field : getSourceClass().getDeclaredFields()) {
            exclusions.add(field.getName());
        }
        return exclusions;
    }
}
