package br.com.empresa.appRateio.dtos;

import br.com.empresa.appRateio.entities.Despesa;

public class DespesaDto {

  private Long id;
  private String referencia;  //aamm
  
  public DespesaDto() {
  }

  public DespesaDto(Despesa entity) {
    this.id = entity.getId();
    this.referencia = entity.getReferencia();
  }

  public Long getId() {
    return id;
  }

  public String getReferencia() {
    return referencia;
  }
  
}
