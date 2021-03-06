/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Caio
 */
@Entity
@Table(name = "registro2", catalog = "escoladominical", schema = "")
@NamedQueries({
    @NamedQuery(name = "Registro2.findAll", query = "SELECT r FROM Registro2 r"),
    @NamedQuery(name = "Registro2.findByIdRegistro", query = "SELECT r FROM Registro2 r WHERE r.idRegistro = :idRegistro"),
    @NamedQuery(name = "Registro2.findByDataRegistro", query = "SELECT r FROM Registro2 r WHERE r.dataRegistro = :dataRegistro"),
    @NamedQuery(name = "Registro2.findByTipoPresenca", query = "SELECT r FROM Registro2 r WHERE r.tipoPresenca = :tipoPresenca")})
public class Registro2 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_REGISTRO")
    private Integer idRegistro;
    @Column(name = "DATA_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date dataRegistro;
    @Column(name = "TIPO_PRESENCA")
    private String tipoPresenca;
    @JoinColumn(name = "ID_ALUNO", referencedColumnName = "ID_ALUNO")
    @ManyToOne
    private Aluno2 idAluno;

    public Registro2() {
    }

    public Registro2(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        Integer oldIdRegistro = this.idRegistro;
        this.idRegistro = idRegistro;
        changeSupport.firePropertyChange("idRegistro", oldIdRegistro, idRegistro);
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        Date oldDataRegistro = this.dataRegistro;
        this.dataRegistro = dataRegistro;
        changeSupport.firePropertyChange("dataRegistro", oldDataRegistro, dataRegistro);
    }

    public String getTipoPresenca() {
        return tipoPresenca;
    }

    public void setTipoPresenca(String tipoPresenca) {
        String oldTipoPresenca = this.tipoPresenca;
        this.tipoPresenca = tipoPresenca;
        changeSupport.firePropertyChange("tipoPresenca", oldTipoPresenca, tipoPresenca);
    }

    public Aluno2 getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Aluno2 idAluno) {
        Aluno2 oldIdAluno = this.idAluno;
        this.idAluno = idAluno;
        changeSupport.firePropertyChange("idAluno", oldIdAluno, idAluno);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistro != null ? idRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro2)) {
            return false;
        }
        Registro2 other = (Registro2) object;
        if ((this.idRegistro == null && other.idRegistro != null) || (this.idRegistro != null && !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Registro2[ idRegistro=" + idRegistro + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
