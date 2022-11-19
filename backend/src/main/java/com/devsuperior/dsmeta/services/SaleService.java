package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

//responsável pelas operações de negócio em vendas
@Service
public class SaleService {
	
	//autowired faz importação do repository
	@Autowired
	private SaleRepository repository; //todo comando aqui é repassado pra interfacer SaleController
	
	public Page<Sale> findSales(String minDate,String maxDate,Pageable pageable) {
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		//converter texto para LocalDate)
		//se não for passado data, pesquisar tudo de um ano atrás
		LocalDate min = maxDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		
		return repository.findSales(min, max, pageable);
	}
}
