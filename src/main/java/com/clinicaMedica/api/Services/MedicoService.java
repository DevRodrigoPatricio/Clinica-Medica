package com.clinicaMedica.api.Services;

import com.clinicaMedica.api.Domain.Dtos.DadosCadastroMedico;
import com.clinicaMedica.api.Domain.Medico;
import com.clinicaMedica.api.Repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository repository;

    @Transactional
    public void criar(DadosCadastroMedico dto){
        repository.save(new Medico(dto));
    }
}
