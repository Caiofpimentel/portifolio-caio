package com.dev.caiofpimentel.portifoliocaio.service;

import com.dev.caiofpimentel.portifoliocaio.model.VisitorModel;
import com.dev.caiofpimentel.portifoliocaio.repository.VisitanteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitanteService {

    private final VisitanteRepository visitorRepository;

    public VisitanteService(VisitanteRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }


    public VisitorModel createVisitor(VisitorModel visitor){
        return visitorRepository.save(visitor);
    }

    public List<VisitorModel> listAll(){
        return visitorRepository.findAll();
    }

    public ResponseEntity<String> delete(Long id){
        visitorRepository.deleteById(id);
        return ResponseEntity.ok("Id "+id+" Deletado com sucesso!!");
    }




}
