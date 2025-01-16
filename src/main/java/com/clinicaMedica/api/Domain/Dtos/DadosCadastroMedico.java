package com.clinicaMedica.api.Domain.Dtos;

import com.clinicaMedica.api.Domain.Enuns.Especialidade;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
