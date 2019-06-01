package com.netcracker.edu.name2.backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "comments", schema = "mydb")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "getCommentById",
                procedureName = "getRoleById",
                resultClasses = { RolesEntity.class },
                parameters = {
                        @StoredProcedureParameter(
                                name = "log",
                                type = String.class,
                                mode = ParameterMode.IN)})
})
public class CommentsEntity {
    private int idComment;
    private int idTask;
    private String comment;
    private int idUser;

    @Id
    @Column(name = "idComment")
    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
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
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "idUser")
    public int getIdUsers() {
        return idUser;
    }

    public void setIdUsers(int idUsers) {
        this.idUser = idUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentsEntity that = (CommentsEntity) o;

        if (idComment != that.idComment) return false;
        if (idTask != that.idTask) return false;
        if (idUser != that.idUser) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idComment;
        result = 31 * result + idTask;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + idUser;
        return result;
    }
}
