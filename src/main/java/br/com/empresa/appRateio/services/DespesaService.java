package br.com.empresa.appRateio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.empresa.appRateio.dtos.DespesaDto;
import br.com.empresa.appRateio.entities.Despesa;
import br.com.empresa.appRateio.repositories.DespesaRepository;

@Service
public class DespesaService {

  @Autowired
  private DespesaRepository repository;
  
  public List<DespesaDto> encontrarTodos(){
    
    List<Despesa> lista = repository.findAll();
    List<DespesaDto> listaDto = 
     lista.stream().map(item->new DespesaDto(item)).toList();
    return listaDto;
  }
}
