package org.lessons.spring_la_mia_pizzeria_crud.repos;

import org.lessons.spring_la_mia_pizzeria_crud.models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepo extends JpaRepository<Pizza, Integer> {

}
