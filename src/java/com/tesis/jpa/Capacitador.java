/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tesis.jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorge
 */
@Entity
@Table(name = "Capacitador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Capacitador.findAll", query = "SELECT c FROM Capacitador c"),
    @NamedQuery(name = "Capacitador.findById", query = "SELECT c FROM Capacitador c WHERE c.id = :id"),
    @NamedQuery(name = "Capacitador.findByNombre", query = "SELECT c FROM Capacitador c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Capacitador.findByApellido", query = "SELECT c FROM Capacitador c WHERE c.apellido = :apellido"),
    @NamedQuery(name = "Capacitador.findByCargo", query = "SELECT c FROM Capacitador c WHERE c.cargo = :cargo"),
    @NamedQuery(name = "Capacitador.findByCedula", query = "SELECT c FROM Capacitador c WHERE c.cedula = :cedula"),
    @NamedQuery(name = "Capacitador.findByCorreo", query = "SELECT c FROM Capacitador c WHERE c.correo = :correo"),
    @NamedQuery(name = "Capacitador.findByDireccion", query = "SELECT c FROM Capacitador c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Capacitador.findByTelefonoOficina", query = "SELECT c FROM Capacitador c WHERE c.telefonoOficina = :telefonoOficina"),
    @NamedQuery(name = "Capacitador.findByTelefonoDomicilio", query = "SELECT c FROM Capacitador c WHERE c.telefonoDomicilio = :telefonoDomicilio"),
    @NamedQuery(name = "Capacitador.findByExtTelefonoOficina", query = "SELECT c FROM Capacitador c WHERE c.extTelefonoOficina = :extTelefonoOficina"),
    @NamedQuery(name = "Capacitador.findByContrasenia", query = "SELECT c FROM Capacitador c WHERE c.contrasenia = :contrasenia"),
    @NamedQuery(name = "Capacitador.findByCelular", query = "SELECT c FROM Capacitador c WHERE c.celular = :celular"),
    @NamedQuery(name = "Capacitador.findByFechaIngreso", query = "SELECT c FROM Capacitador c WHERE c.fechaIngreso = :fechaIngreso"),
    @NamedQuery(name = "Capacitador.findByFechaNacimiento", query = "SELECT c FROM Capacitador c WHERE c.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Capacitador.findByAdministradorid", query = "SELECT c FROM Capacitador c WHERE c.administradorid = :administradorid")})
public class Capacitador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 45)
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "cedula")
    private Integer cedula;
    @Size(max = 45)
    @Column(name = "correo")
    private String correo;
    @Size(max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono_oficina")
    private Integer telefonoOficina;
    @Column(name = "telefono_domicilio")
    private Integer telefonoDomicilio;
    @Column(name = "ext_telefono_oficina")
    private Integer extTelefonoOficina;
    @Size(max = 256)
    @Column(name = "contrasenia")
    private String contrasenia;
    @Size(max = 45)
    @Column(name = "celular")
    private String celular;
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Administrador_id")
    private int administradorid;

    public Capacitador() {
    }

    public Capacitador(Integer id) {
        this.id = id;
    }

    public Capacitador(Integer id, int administradorid) {
        this.id = id;
        this.administradorid = administradorid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefonoOficina() {
        return telefonoOficina;
    }

    public void setTelefonoOficina(Integer telefonoOficina) {
        this.telefonoOficina = telefonoOficina;
    }

    public Integer getTelefonoDomicilio() {
        return telefonoDomicilio;
    }

    public void setTelefonoDomicilio(Integer telefonoDomicilio) {
        this.telefonoDomicilio = telefonoDomicilio;
    }

    public Integer getExtTelefonoOficina() {
        return extTelefonoOficina;
    }

    public void setExtTelefonoOficina(Integer extTelefonoOficina) {
        this.extTelefonoOficina = extTelefonoOficina;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getAdministradorid() {
        return administradorid;
    }

    public void setAdministradorid(int administradorid) {
        this.administradorid = administradorid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Capacitador)) {
            return false;
        }
        Capacitador other = (Capacitador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tesis.jpa.Capacitador[ id=" + id + " ]";
    }
    
}
