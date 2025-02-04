package com.clinicaMedica.api.Domain.Dtos;

import com.clinicaMedica.api.Domain.Enuns.Especialidade;
import com.clinicaMedica.api.Domain.Medico;

public record DadosListagemMedico (String nome, String email, String crm, Especialidade especialidade){
public DadosListagemMedico(Medico medico){
    this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
}
}
