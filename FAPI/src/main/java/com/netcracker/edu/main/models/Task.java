package com.netcracker.edu.main.models;

import java.sql.Date;

public class Task {
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
    private Prioritet prioritiesByIdPriority;
    private Status statusByIdStatus;

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEstimation() {
        return estimation;
    }

    public void setEstimation(String estimation) {
        this.estimation = estimation;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(Date resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public int getIdPriority() {
        return idPriority;
    }

    public void setIdPriority(int idPriority) {
        this.idPriority = idPriority;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public int getAssignee() {
        return assignee;
    }

    public void setAssignee(int assignee) {
        this.assignee = assignee;
    }

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

        Task that = (Task) o;

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

    public Prioritet getPrioritiesByIdPriority() {
        return prioritiesByIdPriority;
    }

    public void setPrioritiesByIdPriority(Prioritet prioritiesByIdPriority) {
        this.prioritiesByIdPriority = prioritiesByIdPriority;
    }

    public Status getStatusByIdStatus() {
        return statusByIdStatus;
    }

    public void setStatusByIdStatus(Status statusByIdStatus) {
        this.statusByIdStatus = statusByIdStatus;
    }
}
