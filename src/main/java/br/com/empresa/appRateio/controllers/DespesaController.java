package br.com.empresa.appRateio.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.empresa.appRateio.dtos.DespesaDto;
import br.com.empresa.appRateio.entities.Despesa;
import br.com.empresa.appRateio.services.DespesaService;

@RestController
@RequestMapping(value="/despesa")
public class DespesaController {

  @Autowired
  private DespesaService service;
  
  @GetMapping
  public List<DespesaDto> encontrarTodos(){
    return service.encontrarTodos();
  }
  
  @GetMapping("/{id}")
  public Optional<DespesaDto> encontrarPeloId( @PathVariable(value="id") Long id ){
    return service.encontrarPeloId(id);
  }

}
