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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorge
 */
@Entity
@Table(name = "Registra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registra.findAll", query = "SELECT r FROM Registra r"),
    @NamedQuery(name = "Registra.findById", query = "SELECT r FROM Registra r WHERE r.id = :id"),
    @NamedQuery(name = "Registra.findByCapacitacionid", query = "SELECT r FROM Registra r WHERE r.capacitacionid = :capacitacionid"),
    @NamedQuery(name = "Registra.findByCapacitadoid", query = "SELECT r FROM Registra r WHERE r.capacitadoid = :capacitadoid"),
    @NamedQuery(name = "Registra.findByFecha", query = "SELECT r FROM Registra r WHERE r.fecha = :fecha"),
    @NamedQuery(name = "Registra.findByHora", query = "SELECT r FROM Registra r WHERE r.hora = :hora")})
public class Registra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Capacitacion_id")
    private Integer capacitacionid;
    @Column(name = "Capacitado_id")
    private Integer capacitadoid;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;

    public Registra() {
    }

    public Registra(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacitacionid() {
        return capacitacionid;
    }

    public void setCapacitacionid(Integer capacitacionid) {
        this.capacitacionid = capacitacionid;
    }

    public Integer getCapacitadoid() {
        return capacitadoid;
    }

    public void setCapacitadoid(Integer capacitadoid) {
        this.capacitadoid = capacitadoid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
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
        if (!(object instanceof Registra)) {
            return false;
        }
        Registra other = (Registra) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tesis.jpa.Registra[ id=" + id + " ]";
    }
    
}
