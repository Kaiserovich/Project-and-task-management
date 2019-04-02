package com.netcracker.edu.name2.backend.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "projects", schema = "mydb", catalog = "")
public class ProjectsEntity {
    private int idProject;
    private String summary;
    private int reporter;
    private Collection<TasksEntity> tasksByIdProject;

    @Id
    @Column(name = "idProject")
    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    @Basic
    @Column(name = "summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "reporter")
    public int getReporter() {
        return reporter;
    }

    public void setReporter(int reporter) {
        this.reporter = reporter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectsEntity that = (ProjectsEntity) o;

        if (idProject != that.idProject) return false;
        if (reporter != that.reporter) return false;
        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProject;
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + reporter;
        return result;
    }

    @OneToMany(mappedBy = "projectsByIdProject")
    public Collection<TasksEntity> getTasksByIdProject() {
        return tasksByIdProject;
    }

    public void setTasksByIdProject(Collection<TasksEntity> tasksByIdProject) {
        this.tasksByIdProject = tasksByIdProject;
    }
}
