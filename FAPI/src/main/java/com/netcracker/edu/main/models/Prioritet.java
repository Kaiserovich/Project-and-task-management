package com.netcracker.edu.main.models;

public class Prioritet {
    private int idPriority;
    private String name;

    public int getIdPriority() {
        return idPriority;
    }

    public void setIdPriority(int idPriority) {
        this.idPriority = idPriority;
    }

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

        Prioritet that = (Prioritet) o;

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
