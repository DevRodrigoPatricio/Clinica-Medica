package com.clinicaMedica.api.Controller;

import com.clinicaMedica.api.Domain.Dtos.DadosCadastroMedico;
import com.clinicaMedica.api.Domain.Dtos.DadosListagemMedico;
import com.clinicaMedica.api.Domain.Medico;
import com.clinicaMedica.api.Services.MedicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
    private MedicoService service;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        service.criar(dados);

    }

    @GetMapping
    public Page<DadosListagemMedico> listar( @PageableDefault(size =10, sort = {"nome"}) Pageable paginacao){
       return  service.listarMedicos(paginacao);
    }

}
