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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorge
 */
@Entity
@Table(name = "Capacitacion_Capacitador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CapacitacionCapacitador.findAll", query = "SELECT c FROM CapacitacionCapacitador c"),
    @NamedQuery(name = "CapacitacionCapacitador.findById", query = "SELECT c FROM CapacitacionCapacitador c WHERE c.id = :id"),
    @NamedQuery(name = "CapacitacionCapacitador.findByCapacitadorid", query = "SELECT c FROM CapacitacionCapacitador c WHERE c.capacitadorid = :capacitadorid"),
    @NamedQuery(name = "CapacitacionCapacitador.findByCapacitacionid", query = "SELECT c FROM CapacitacionCapacitador c WHERE c.capacitacionid = :capacitacionid")})
public class CapacitacionCapacitador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Capacitador_id")
    private Integer capacitadorid;
    @Column(name = "Capacitacion_id")
    private Integer capacitacionid;

    public CapacitacionCapacitador() {
    }

    public CapacitacionCapacitador(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacitadorid() {
        return capacitadorid;
    }

    public void setCapacitadorid(Integer capacitadorid) {
        this.capacitadorid = capacitadorid;
    }

    public Integer getCapacitacionid() {
        return capacitacionid;
    }

    public void setCapacitacionid(Integer capacitacionid) {
        this.capacitacionid = capacitacionid;
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
        if (!(object instanceof CapacitacionCapacitador)) {
            return false;
        }
        CapacitacionCapacitador other = (CapacitacionCapacitador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tesis.jpa.CapacitacionCapacitador[ id=" + id + " ]";
    }
    
}
