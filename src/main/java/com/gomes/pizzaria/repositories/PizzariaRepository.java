package com.gomes.pizzaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomes.pizzaria.entities.Pizzarias;

public interface PizzariaRepository extends JpaRepository<Pizzarias, Long>{

}
