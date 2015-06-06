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
@Table(name = "Evaluacion_Capacitado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EvaluacionCapacitado.findAll", query = "SELECT e FROM EvaluacionCapacitado e"),
    @NamedQuery(name = "EvaluacionCapacitado.findByIdEvaluacionCapacitado", query = "SELECT e FROM EvaluacionCapacitado e WHERE e.idEvaluacionCapacitado = :idEvaluacionCapacitado"),
    @NamedQuery(name = "EvaluacionCapacitado.findByCalificaci\u00f3nEstudiante", query = "SELECT e FROM EvaluacionCapacitado e WHERE e.calificaci\u00f3nEstudiante = :calificaci\u00f3nEstudiante"),
    @NamedQuery(name = "EvaluacionCapacitado.findByCapacitadoid", query = "SELECT e FROM EvaluacionCapacitado e WHERE e.capacitadoid = :capacitadoid"),
    @NamedQuery(name = "EvaluacionCapacitado.findByPreguntaid", query = "SELECT e FROM EvaluacionCapacitado e WHERE e.preguntaid = :preguntaid"),
    @NamedQuery(name = "EvaluacionCapacitado.findByRespuestaid", query = "SELECT e FROM EvaluacionCapacitado e WHERE e.respuestaid = :respuestaid"),
    @NamedQuery(name = "EvaluacionCapacitado.findByFecha", query = "SELECT e FROM EvaluacionCapacitado e WHERE e.fecha = :fecha"),
    @NamedQuery(name = "EvaluacionCapacitado.findByHora", query = "SELECT e FROM EvaluacionCapacitado e WHERE e.hora = :hora")})
public class EvaluacionCapacitado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEvaluacionCapacitado")
    private Integer idEvaluacionCapacitado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "calificaci\u00f3n_estudiante")
    private Double calificaciónEstudiante;
    @Column(name = "Capacitado_id")
    private Integer capacitadoid;
    @Column(name = "Pregunta_id")
    private Integer preguntaid;
    @Column(name = "Respuesta_id")
    private Integer respuestaid;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;

    public EvaluacionCapacitado() {
    }

    public EvaluacionCapacitado(Integer idEvaluacionCapacitado) {
        this.idEvaluacionCapacitado = idEvaluacionCapacitado;
    }

    public Integer getIdEvaluacionCapacitado() {
        return idEvaluacionCapacitado;
    }

    public void setIdEvaluacionCapacitado(Integer idEvaluacionCapacitado) {
        this.idEvaluacionCapacitado = idEvaluacionCapacitado;
    }

    public Double getCalificaciónEstudiante() {
        return calificaciónEstudiante;
    }

    public void setCalificaciónEstudiante(Double calificaciónEstudiante) {
        this.calificaciónEstudiante = calificaciónEstudiante;
    }

    public Integer getCapacitadoid() {
        return capacitadoid;
    }

    public void setCapacitadoid(Integer capacitadoid) {
        this.capacitadoid = capacitadoid;
    }

    public Integer getPreguntaid() {
        return preguntaid;
    }

    public void setPreguntaid(Integer preguntaid) {
        this.preguntaid = preguntaid;
    }

    public Integer getRespuestaid() {
        return respuestaid;
    }

    public void setRespuestaid(Integer respuestaid) {
        this.respuestaid = respuestaid;
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
        hash += (idEvaluacionCapacitado != null ? idEvaluacionCapacitado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaluacionCapacitado)) {
            return false;
        }
        EvaluacionCapacitado other = (EvaluacionCapacitado) object;
        if ((this.idEvaluacionCapacitado == null && other.idEvaluacionCapacitado != null) || (this.idEvaluacionCapacitado != null && !this.idEvaluacionCapacitado.equals(other.idEvaluacionCapacitado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tesis.jpa.EvaluacionCapacitado[ idEvaluacionCapacitado=" + idEvaluacionCapacitado + " ]";
    }
    
}
