package org.example.application;

import java.util.List;

import org.example.domain.Pie;
import org.example.domain.PieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PieServiceImpl implements PieService {
    private final PieRepository pieRepository;

    @Autowired
    public PieServiceImpl(PieRepository pieRepository) {
        this.pieRepository = pieRepository;
    }

    public Pie get(int id) {
        return pieRepository.get(id);
    }

    public List<Pie> getAll() {
        return pieRepository.getAll();
    }

    public Pie create(Pie pie) {
        return pieRepository.create(pie);
    }
}
