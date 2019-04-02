package com.netcracker.edu.name2.backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "attachments", schema = "mydb", catalog = "")
public class AttachmentsEntity {
    private int idAttachment;
    private int idTask;
    private String path;

    @Id
    @Column(name = "idAttachment")
    public int getIdAttachment() {
        return idAttachment;
    }

    public void setIdAttachment(int idAttachment) {
        this.idAttachment = idAttachment;
    }

    @Basic
    @Column(name = "idTask")
    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    @Basic
    @Column(name = "path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttachmentsEntity that = (AttachmentsEntity) o;

        if (idAttachment != that.idAttachment) return false;
        if (idTask != that.idTask) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAttachment;
        result = 31 * result + idTask;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        return result;
    }
}
