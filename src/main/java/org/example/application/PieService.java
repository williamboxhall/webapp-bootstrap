package org.example.application;

import java.util.List;

import org.example.domain.Pie;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PieService {
    Pie get(int id);

    List<Pie> getAll();

    Pie create(Pie pie);
}
