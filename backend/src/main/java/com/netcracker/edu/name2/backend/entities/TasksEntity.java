package com.netcracker.edu.name2.backend.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tasks", schema = "mydb")
public class TasksEntity {
    private int idTask;
    private String description;
    private String estimation;
    private Date createDate;
    private Date dueDate;
    private Date updatedDate;
    private Date resolvedDate;
    private Date closedDate;
    private int idProject;
    private int idPriority;
    private int idStatus;
    private int assignee;
    private int reporter;
    private PrioritiesEntity prioritiesByIdPriority;
    private StatusEntity statusByIdStatus;

    @Id
    @Column(name = "idTask")
    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "estimation")
    public String getEstimation() {
        return estimation;
    }

    public void setEstimation(String estimation) {
        this.estimation = estimation;
    }

    @Basic
    @Column(name = "createDate")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "dueDate")
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Basic
    @Column(name = "updatedDate")
    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Basic
    @Column(name = "resolvedDate")
    public Date getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(Date resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    @Basic
    @Column(name = "closedDate")
    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    @Basic
    @Column(name = "idProject")
    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    @Basic
    @Column(name = "idPriority" ,insertable = false, updatable = false)
    public int getIdPriority() {
        return idPriority;
    }

    public void setIdPriority(int idPriority) {
        this.idPriority = idPriority;
    }

    @Basic
    @Column(name = "idStatus", insertable = false, updatable = false)
    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    @Basic
    @Column(name = "assignee")
    public int getAssignee() {
        return assignee;
    }

    public void setAssignee(int assignee) {
        this.assignee = assignee;
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

        TasksEntity that = (TasksEntity) o;

        if (idTask != that.idTask) return false;
        if (idProject != that.idProject) return false;
        if (idPriority != that.idPriority) return false;
        if (idStatus != that.idStatus) return false;
        if (assignee != that.assignee) return false;
        if (reporter != that.reporter) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (estimation != null ? !estimation.equals(that.estimation) : that.estimation != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (dueDate != null ? !dueDate.equals(that.dueDate) : that.dueDate != null) return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null) return false;
        if (resolvedDate != null ? !resolvedDate.equals(that.resolvedDate) : that.resolvedDate != null) return false;
        if (closedDate != null ? !closedDate.equals(that.closedDate) : that.closedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTask;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (estimation != null ? estimation.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (dueDate != null ? dueDate.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        result = 31 * result + (resolvedDate != null ? resolvedDate.hashCode() : 0);
        result = 31 * result + (closedDate != null ? closedDate.hashCode() : 0);
        result = 31 * result + idProject;
        result = 31 * result + idPriority;
        result = 31 * result + idStatus;
        result = 31 * result + assignee;
        result = 31 * result + reporter;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idPriority", referencedColumnName = "idPriority", nullable = false)
    public PrioritiesEntity getPrioritiesByIdPriority() {
        return prioritiesByIdPriority;
    }

    public void setPrioritiesByIdPriority(PrioritiesEntity prioritiesByIdPriority) {
        this.prioritiesByIdPriority = prioritiesByIdPriority;
    }

    @ManyToOne
    @JoinColumn(name = "idStatus", referencedColumnName = "idStatus", nullable = false)
    public StatusEntity getStatusByIdStatus() {
        return statusByIdStatus;
    }

    public void setStatusByIdStatus(StatusEntity statusByIdStatus) {
        this.statusByIdStatus = statusByIdStatus;
    }
}
