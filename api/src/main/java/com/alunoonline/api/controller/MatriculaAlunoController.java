package com.alunoonline.api.controller;

import com.alunoonline.api.model.MatriculaAluno;
import com.alunoonline.api.service.AlunoService;
import com.alunoonline.api.service.MatriculaAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/{matricula-aluno}")
public class MatriculaAlunoController {

    @Autowired
    MatriculaAlunoService service;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody MatriculaAluno matriculaAluno){
        service.create(matriculaAluno);
    }
}
