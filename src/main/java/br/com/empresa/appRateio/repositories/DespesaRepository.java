package br.com.empresa.appRateio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.empresa.appRateio.entities.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Long>{
}
