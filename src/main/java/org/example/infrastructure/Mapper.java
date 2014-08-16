package org.example.infrastructure;

import com.googlecode.simpleobjectassembler.SimpleObjectAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    private final SimpleObjectAssembler simpleObjectAssembler;

    @Autowired
    public Mapper(SimpleObjectAssembler simpleObjectAssembler) {
        this.simpleObjectAssembler = simpleObjectAssembler;
    }
    
    public <T,S> S map(T input, Class<S> output) {
        return simpleObjectAssembler.assemble(input, output);
    }
}
