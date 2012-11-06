package org.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import net.sf.oval.constraint.MinLength;

@Entity
@NamedQuery(name = "org.example.domain.Pie.All", query = "FROM Pie")
public class Pie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @MinLength(3)
    private String topping;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}
