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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorge
 */
@Entity
@Table(name = "Capacitacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Capacitacion.findAll", query = "SELECT c FROM Capacitacion c"),
    @NamedQuery(name = "Capacitacion.findById", query = "SELECT c FROM Capacitacion c WHERE c.id = :id"),
    @NamedQuery(name = "Capacitacion.findByCodigo", query = "SELECT c FROM Capacitacion c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Capacitacion.findByFechaInicio", query = "SELECT c FROM Capacitacion c WHERE c.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Capacitacion.findByFechaFin", query = "SELECT c FROM Capacitacion c WHERE c.fechaFin = :fechaFin"),
    @NamedQuery(name = "Capacitacion.findByHorario", query = "SELECT c FROM Capacitacion c WHERE c.horario = :horario"),
    @NamedQuery(name = "Capacitacion.findByLocal", query = "SELECT c FROM Capacitacion c WHERE c.local = :local"),
    @NamedQuery(name = "Capacitacion.findByObservaciones", query = "SELECT c FROM Capacitacion c WHERE c.observaciones = :observaciones"),
    @NamedQuery(name = "Capacitacion.findByTema", query = "SELECT c FROM Capacitacion c WHERE c.tema = :tema"),
    @NamedQuery(name = "Capacitacion.findByTipoUsuario", query = "SELECT c FROM Capacitacion c WHERE c.tipoUsuario = :tipoUsuario"),
    @NamedQuery(name = "Capacitacion.findByEvaluacionId", query = "SELECT c FROM Capacitacion c WHERE c.evaluacionId = :evaluacionId"),
    @NamedQuery(name = "Capacitacion.findBySectorId", query = "SELECT c FROM Capacitacion c WHERE c.sectorId = :sectorId"),
    @NamedQuery(name = "Capacitacion.findByNumMaxCapacitados", query = "SELECT c FROM Capacitacion c WHERE c.numMaxCapacitados = :numMaxCapacitados")})
public class Capacitacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Column(name = "horario")
    @Temporal(TemporalType.TIME)
    private Date horario;
    @Size(max = 45)
    @Column(name = "local")
    private String local;
    @Size(max = 250)
    @Column(name = "observaciones")
    private String observaciones;
    @Size(max = 45)
    @Column(name = "tema")
    private String tema;
    @Size(max = 45)
    @Column(name = "tipo_usuario")
    private String tipoUsuario;
    @Column(name = "evaluacion_id")
    private Integer evaluacionId;
    @Column(name = "sector_id")
    private Integer sectorId;
    @Column(name = "num_max_capacitados")
    private Integer numMaxCapacitados;

    public Capacitacion() {
    }

    public Capacitacion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getEvaluacionId() {
        return evaluacionId;
    }

    public void setEvaluacionId(Integer evaluacionId) {
        this.evaluacionId = evaluacionId;
    }

    public Integer getSectorId() {
        return sectorId;
    }

    public void setSectorId(Integer sectorId) {
        this.sectorId = sectorId;
    }

    public Integer getNumMaxCapacitados() {
        return numMaxCapacitados;
    }

    public void setNumMaxCapacitados(Integer numMaxCapacitados) {
        this.numMaxCapacitados = numMaxCapacitados;
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
        if (!(object instanceof Capacitacion)) {
            return false;
        }
        Capacitacion other = (Capacitacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tesis.jpa.Capacitacion[ id=" + id + " ]";
    }
    
}
