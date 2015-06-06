/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tesis.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorge
 */
@Entity
@Table(name = "Responsable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Responsable.findAll", query = "SELECT r FROM Responsable r"),
    @NamedQuery(name = "Responsable.findById", query = "SELECT r FROM Responsable r WHERE r.id = :id"),
    @NamedQuery(name = "Responsable.findByNombre", query = "SELECT r FROM Responsable r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Responsable.findByApellido", query = "SELECT r FROM Responsable r WHERE r.apellido = :apellido"),
    @NamedQuery(name = "Responsable.findByCargo", query = "SELECT r FROM Responsable r WHERE r.cargo = :cargo"),
    @NamedQuery(name = "Responsable.findByCedula", query = "SELECT r FROM Responsable r WHERE r.cedula = :cedula"),
    @NamedQuery(name = "Responsable.findByCorreo", query = "SELECT r FROM Responsable r WHERE r.correo = :correo"),
    @NamedQuery(name = "Responsable.findByDireccion", query = "SELECT r FROM Responsable r WHERE r.direccion = :direccion"),
    @NamedQuery(name = "Responsable.findByTelefonoOficina", query = "SELECT r FROM Responsable r WHERE r.telefonoOficina = :telefonoOficina"),
    @NamedQuery(name = "Responsable.findByTelefonoDomicilio", query = "SELECT r FROM Responsable r WHERE r.telefonoDomicilio = :telefonoDomicilio"),
    @NamedQuery(name = "Responsable.findByExtTelefonoOficina", query = "SELECT r FROM Responsable r WHERE r.extTelefonoOficina = :extTelefonoOficina"),
    @NamedQuery(name = "Responsable.findByCelular", query = "SELECT r FROM Responsable r WHERE r.celular = :celular"),
    @NamedQuery(name = "Responsable.findBySectorId", query = "SELECT r FROM Responsable r WHERE r.sectorId = :sectorId")})
public class Responsable implements Serializable {
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
    @Size(max = 45)
    @Column(name = "celular")
    private String celular;
    @Column(name = "sector_id")
    private Integer sectorId;

    public Responsable() {
    }

    public Responsable(Integer id) {
        this.id = id;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Integer getSectorId() {
        return sectorId;
    }

    public void setSectorId(Integer sectorId) {
        this.sectorId = sectorId;
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
        if (!(object instanceof Responsable)) {
            return false;
        }
        Responsable other = (Responsable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tesis.jpa.Responsable[ id=" + id + " ]";
    }
    
}
