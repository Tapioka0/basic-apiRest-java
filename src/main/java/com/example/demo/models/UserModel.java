package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuarios")
public class UserModel {

    // generate automatic ID  for news users
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long Cliente_ID;
    @Column(unique = true,nullable = false)
    private String Nombre_Usuario;
    private String Password;
    private String Nombre;
    private String Apellidos;
    @Column(unique = true,nullable = false)
    private String Correo_Electronico;
    private Integer Edad;
    private float Estatura;
    private float Peso;
    private float IMC;
    private float GEB;
    private float ETA;
    private Date Fecha_Creacion;

    public void setCliente_ID(Long cliente_ID) {
        Cliente_ID = cliente_ID;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        Nombre_Usuario = nombre_Usuario;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public void setCorreo_Electronico(String correo_Electronico) {
        Correo_Electronico = correo_Electronico;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public void setEstatura(float estatura) {
        Estatura = estatura;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public void setGEB(float GEB) {
        this.GEB = GEB;
    }

    public void setETA(float ETA) {
        this.ETA = ETA;
    }

    public void setFecha_Creacion(Date fecha_Creacion) {
        Fecha_Creacion = fecha_Creacion;
    }

    public Long getCliente_ID() {
        return Cliente_ID;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public Integer getEdad() {
        return Edad;
    }

    public float getEstatura() {
        return Estatura;
    }

    public float getPeso() {
        return Peso;
    }

    public float getIMC() {
        return IMC;
    }

    public float getGEB() {
        return GEB;
    }

    public float getETA() {
        return ETA;
    }

    public Date getFecha_Creacion() {
        return Fecha_Creacion;
    }
}
