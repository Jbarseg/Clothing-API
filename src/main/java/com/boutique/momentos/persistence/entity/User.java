package com.boutique.momentos.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @Column(name = "id_usuario")
    private int idUser;
    @Column(name = "nombre")
    private String userName;
    @Column(name = "usuario")
    private String userRolName;
    @Column(name = "contrasena")
    private Long userPassword;
    @Column(name = "id_rol")
    private int idRol;

    public int getIdUser() {
        return idUser;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserRolName() {
        return userRolName;
    }
    public void setUserRolName(String userRolName) {
        this.userRolName = userRolName;
    }
    public Long getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(Long userPassword) {
        this.userPassword = userPassword;
    }
    public int getIdRol() {
        return idRol;
    }
    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
}
