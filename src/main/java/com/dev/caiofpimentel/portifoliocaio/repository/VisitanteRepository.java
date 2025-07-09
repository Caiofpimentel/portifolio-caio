package com.dev.caiofpimentel.portifoliocaio.repository;

import com.dev.caiofpimentel.portifoliocaio.model.VisitorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitanteRepository extends JpaRepository<VisitorModel, Long> {
}
