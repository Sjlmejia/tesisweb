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
@Table(name = "Capacitado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Capacitado.findAll", query = "SELECT c FROM Capacitado c"),
    @NamedQuery(name = "Capacitado.findById", query = "SELECT c FROM Capacitado c WHERE c.id = :id"),
    @NamedQuery(name = "Capacitado.findByNombre", query = "SELECT c FROM Capacitado c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Capacitado.findByApellido", query = "SELECT c FROM Capacitado c WHERE c.apellido = :apellido"),
    @NamedQuery(name = "Capacitado.findByCargo", query = "SELECT c FROM Capacitado c WHERE c.cargo = :cargo"),
    @NamedQuery(name = "Capacitado.findByCedula", query = "SELECT c FROM Capacitado c WHERE c.cedula = :cedula"),
    @NamedQuery(name = "Capacitado.findByCorreo", query = "SELECT c FROM Capacitado c WHERE c.correo = :correo"),
    @NamedQuery(name = "Capacitado.findByDireccion", query = "SELECT c FROM Capacitado c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Capacitado.findByTelefonoOficina", query = "SELECT c FROM Capacitado c WHERE c.telefonoOficina = :telefonoOficina"),
    @NamedQuery(name = "Capacitado.findByTelefonoDomicilio", query = "SELECT c FROM Capacitado c WHERE c.telefonoDomicilio = :telefonoDomicilio"),
    @NamedQuery(name = "Capacitado.findByExtTelefonoOficina", query = "SELECT c FROM Capacitado c WHERE c.extTelefonoOficina = :extTelefonoOficina"),
    @NamedQuery(name = "Capacitado.findByContrasenia", query = "SELECT c FROM Capacitado c WHERE c.contrasenia = :contrasenia"),
    @NamedQuery(name = "Capacitado.findByCelular", query = "SELECT c FROM Capacitado c WHERE c.celular = :celular"),
    @NamedQuery(name = "Capacitado.findByNumHistoriaClinica", query = "SELECT c FROM Capacitado c WHERE c.numHistoriaClinica = :numHistoriaClinica"),
    @NamedQuery(name = "Capacitado.findByTipo", query = "SELECT c FROM Capacitado c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Capacitado.findByCapacitadorid", query = "SELECT c FROM Capacitado c WHERE c.capacitadorid = :capacitadorid"),
    @NamedQuery(name = "Capacitado.findByCarreraId", query = "SELECT c FROM Capacitado c WHERE c.carreraId = :carreraId"),
    @NamedQuery(name = "Capacitado.findBySectorid", query = "SELECT c FROM Capacitado c WHERE c.sectorid = :sectorid")})
public class Capacitado implements Serializable {
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
    @Size(max = 45)
    @Column(name = "num_historia_clinica")
    private String numHistoriaClinica;
    @Column(name = "tipo")
    private Integer tipo;
    @Column(name = "Capacitador_id")
    private Integer capacitadorid;
    @Column(name = "carrera_id")
    private Integer carreraId;
    @Column(name = "Sector_id")
    private Integer sectorid;

    public Capacitado() {
    }

    public Capacitado(Integer id) {
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

    public String getNumHistoriaClinica() {
        return numHistoriaClinica;
    }

    public void setNumHistoriaClinica(String numHistoriaClinica) {
        this.numHistoriaClinica = numHistoriaClinica;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getCapacitadorid() {
        return capacitadorid;
    }

    public void setCapacitadorid(Integer capacitadorid) {
        this.capacitadorid = capacitadorid;
    }

    public Integer getCarreraId() {
        return carreraId;
    }

    public void setCarreraId(Integer carreraId) {
        this.carreraId = carreraId;
    }

    public Integer getSectorid() {
        return sectorid;
    }

    public void setSectorid(Integer sectorid) {
        this.sectorid = sectorid;
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
        if (!(object instanceof Capacitado)) {
            return false;
        }
        Capacitado other = (Capacitado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tesis.jpa.Capacitado[ id=" + id + " ]";
    }
    
}
