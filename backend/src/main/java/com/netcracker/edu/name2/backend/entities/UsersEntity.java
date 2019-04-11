package com.netcracker.edu.name2.backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "users", schema = "mydb", catalog = "")
public class UsersEntity {
    private int idUsers;
    private String eMail;
    private String password;
    private String personalData;
    private int idRole;
    private RolesEntity rolesByIdRole;

    @Id
    @Column(name = "idUsers" )
    public int getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    @Basic
    @Column(name = "eMail")
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "personalData")
    public String getPersonalData() {
        return personalData;
    }

    public void setPersonalData(String personalData) {
        this.personalData = personalData;
    }

    @Basic
    @Column(name = "idRole", insertable = false, updatable = false)
    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (idUsers != that.idUsers) return false;
        if (idRole != that.idRole) return false;
        if (eMail != null ? !eMail.equals(that.eMail) : that.eMail != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (personalData != null ? !personalData.equals(that.personalData) : that.personalData != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsers;
        result = 31 * result + (eMail != null ? eMail.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (personalData != null ? personalData.hashCode() : 0);
        result = 31 * result + idRole;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idRole", referencedColumnName = "idRole", nullable = false)
    public RolesEntity getRolesByIdRole() {
        return rolesByIdRole;
    }

    public void setRolesByIdRole(RolesEntity rolesByIdRole) {
        this.rolesByIdRole = rolesByIdRole;
    }
}
