package com.netcracker.edu.name2.backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "comlexity", schema = "mydb")
public class ComlexityEntity {
    private int idComlexity;
    private String name;

    @Id
    @Column(name = "idComlexity")
    public int getIdComlexity() {
        return idComlexity;
    }

    public void setIdComlexity(int idComlexity) {
        this.idComlexity = idComlexity;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComlexityEntity that = (ComlexityEntity) o;

        if (idComlexity != that.idComlexity) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idComlexity;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

