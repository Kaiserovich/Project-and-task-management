package com.netcracker.edu.name2.backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "priorities", schema = "mydb")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "getPrioritetById",
                procedureName = "getPrioritetById",
                resultClasses = { PrioritiesEntity.class },
                parameters = {
                        @StoredProcedureParameter(
                                name = "log",
                                type = String.class,
                                mode = ParameterMode.IN)})
})
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "getPrioritetByName",
                procedureName = "getPrioritetByName",
                resultClasses = { PrioritiesEntity.class },
                parameters = {
                        @StoredProcedureParameter(
                                name = "log",
                                type = String.class,
                                mode = ParameterMode.IN)})
})
public class PrioritiesEntity {
    private int idPriority;
    private String name;

    @Id
    @Column(name = "idPriority")
    public int getIdPriority() {
        return idPriority;
    }

    public void setIdPriority(int idPriority) {
        this.idPriority = idPriority;
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

        PrioritiesEntity that = (PrioritiesEntity) o;

        if (idPriority != that.idPriority) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPriority;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
