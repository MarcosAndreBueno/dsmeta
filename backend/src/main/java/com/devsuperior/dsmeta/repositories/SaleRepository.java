package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

//classe responsável pelo CRUD no nosso BD
//JpaRepository<tipo da entidade,tipo do ID>
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
