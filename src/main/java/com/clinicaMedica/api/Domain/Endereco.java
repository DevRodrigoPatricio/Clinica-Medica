package com.clinicaMedica.api.Domain;

import com.clinicaMedica.api.Domain.Dtos.DadosAtualizacaoMeidcos;
import com.clinicaMedica.api.Domain.Dtos.DadosEndereco;
import jakarta.persistence.Embeddable;
import lombok.*;


@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;


    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if(dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }
        if(dados.bairro() != null){
            this.bairro = dados.bairro();
        }
        if(dados.cep() != null){
            this.cep = dados.cep();
        }
        if(dados.cidade() != null){
            this.cidade = dados.cidade();
        }
        if(dados.numero() != null){
            this.numero = dados.numero();
        }

        if(dados.complemento() != null){
            this.complemento = dados.complemento();
        }
        if(dados.uf() != null){
            this.uf = dados.uf();
        }
    }
}
