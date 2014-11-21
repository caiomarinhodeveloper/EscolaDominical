/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Caio
 */
@Entity
@Table(name = "aluno3", catalog = "escoladominical", schema = "")
@NamedQueries({
    @NamedQuery(name = "Aluno3.findAll", query = "SELECT a FROM Aluno3 a"),
    @NamedQuery(name = "Aluno3.findByIdAluno", query = "SELECT a FROM Aluno3 a WHERE a.idAluno = :idAluno"),
    @NamedQuery(name = "Aluno3.findByNomeAluno", query = "SELECT a FROM Aluno3 a WHERE a.nomeAluno = :nomeAluno"),
    @NamedQuery(name = "Aluno3.findByIdadeAluno", query = "SELECT a FROM Aluno3 a WHERE a.idadeAluno = :idadeAluno"),
    @NamedQuery(name = "Aluno3.findByTelefoneAluno", query = "SELECT a FROM Aluno3 a WHERE a.telefoneAluno = :telefoneAluno")})
public class Aluno3 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ALUNO")
    private Integer idAluno;
    @Column(name = "NOME_ALUNO")
    private String nomeAluno;
    @Column(name = "IDADE_ALUNO")
    private String idadeAluno;
    @Column(name = "TELEFONE_ALUNO")
    private String telefoneAluno;
    @OneToMany(mappedBy = "idAluno")
    private List<Registro3> registro3List;

    public Aluno3() {
    }

    public Aluno3(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        Integer oldIdAluno = this.idAluno;
        this.idAluno = idAluno;
        changeSupport.firePropertyChange("idAluno", oldIdAluno, idAluno);
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        String oldNomeAluno = this.nomeAluno;
        this.nomeAluno = nomeAluno;
        changeSupport.firePropertyChange("nomeAluno", oldNomeAluno, nomeAluno);
    }

    public String getIdadeAluno() {
        return idadeAluno;
    }

    public void setIdadeAluno(String idadeAluno) {
        String oldIdadeAluno = this.idadeAluno;
        this.idadeAluno = idadeAluno;
        changeSupport.firePropertyChange("idadeAluno", oldIdadeAluno, idadeAluno);
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

    public void setTelefoneAluno(String telefoneAluno) {
        String oldTelefoneAluno = this.telefoneAluno;
        this.telefoneAluno = telefoneAluno;
        changeSupport.firePropertyChange("telefoneAluno", oldTelefoneAluno, telefoneAluno);
    }

    public List<Registro3> getRegistro3List() {
        return registro3List;
    }

    public void setRegistro3List(List<Registro3> registro3List) {
        this.registro3List = registro3List;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAluno != null ? idAluno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno3)) {
            return false;
        }
        Aluno3 other = (Aluno3) object;
        if ((this.idAluno == null && other.idAluno != null) || (this.idAluno != null && !this.idAluno.equals(other.idAluno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Aluno3[ idAluno=" + idAluno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
