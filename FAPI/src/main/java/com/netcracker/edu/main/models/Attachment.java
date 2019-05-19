package com.netcracker.edu.main.models;

public class Attachment {
    private int idAttachment;
    private int idTask;
    private String path;

    public int getIdAttachment() {
        return idAttachment;
    }

    public void setIdAttachment(int idAttachment) {
        this.idAttachment = idAttachment;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

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

        Attachment that = (Attachment) o;

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
