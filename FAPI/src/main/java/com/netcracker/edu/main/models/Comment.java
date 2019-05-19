package com.netcracker.edu.main.models;

public class Comment {
    private int idComment;
    private int idTask;
    private String comment;
    private int idUser;

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

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

        Comment that = (Comment) o;

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
