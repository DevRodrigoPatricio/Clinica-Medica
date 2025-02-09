package com.clinicaMedica.api.Domain.Dtos;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMeidcos (
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco ){
}
