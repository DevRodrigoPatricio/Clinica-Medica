package com.clinicaMedica.api.Domain.Medico;

import com.clinicaMedica.api.Domain.Endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm,Especialidade especialidade, DadosEndereco endereco) {
}
