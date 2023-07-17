package br.com.empresa.appRateio.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Despesa {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String referencia;  //aamm
  private Integer copelLeituraAnterior;
  private Integer copelLeituraAtual;
  
  public Despesa() {
  }

  public Despesa(Long id, String referencia,
                 Integer copelLeituraAnterior,
                 Integer copelLeituraAtual
                ) {
    this.id = id;
    this.referencia = referencia;
    this.copelLeituraAnterior = copelLeituraAnterior;
    this.copelLeituraAtual = copelLeituraAtual;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getReferencia() {
    return referencia;
  }

  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }

  public Integer getCopelLeituraAnterior() {
    return copelLeituraAnterior;
  }

  public void setCopelLeituraAnterior(Integer copelLeituraAnterior) {
    this.copelLeituraAnterior = copelLeituraAnterior;
  }

  public Integer getCopelLeituraAtual() {
    return copelLeituraAtual;
  }

  public void setCopelLeituraAtual(Integer copelLeituraAtual) {
    this.copelLeituraAtual = copelLeituraAtual;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Despesa other = (Despesa) obj;
    return Objects.equals(id, other.id);
  }
  
}
