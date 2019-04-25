package com.netcracker.edu.main.models;

public class User {
    private int idUsers;
    private String login;
    private String password;
    private String personalData;
    private int idRole;
    private Role rolesByIdRole;


    public int getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonalData() {
        return personalData;
    }

    public void setPersonalData(String personalData) {
        this.personalData = personalData;
    }

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

        User that = (User) o;

        if (idUsers != that.idUsers) return false;
        if (idRole != that.idRole) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (personalData != null ? !personalData.equals(that.personalData) : that.personalData != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsers;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (personalData != null ? personalData.hashCode() : 0);
        result = 31 * result + idRole;
        return result;
    }

       public Role getRolesByIdRole() {
        return rolesByIdRole;
    }

    public void setRolesByIdRole(Role rolesByIdRole) {
        this.rolesByIdRole = rolesByIdRole;
    }
}
