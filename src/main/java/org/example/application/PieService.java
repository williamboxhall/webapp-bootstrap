package org.example.application;

import java.util.List;

import org.example.domain.Pie;
import org.example.domain.PieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PieService {
    @Autowired
    private PieRepository pieRepository;

    public Pie get(int id) {
        return pieRepository.get(id);
    }

    public List<Pie> getAll() {
        return pieRepository.findAll();
    }

    public Pie save(Pie pie) {
        pieRepository.save(pie);
        return pie;
    }
}
