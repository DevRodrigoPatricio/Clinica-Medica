package com.clinicaMedica.api.Domain;


import com.clinicaMedica.api.Domain.Dtos.DadosAtualizacaoMeidcos;
import com.clinicaMedica.api.Domain.Dtos.DadosCadastroMedico;
import com.clinicaMedica.api.Domain.Enuns.Especialidade;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="medicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;
    private Boolean ativo;

    public Medico(DadosCadastroMedico medico) {
        this.ativo = true;
        this.nome = medico.nome();
        this.email = medico.email();
        this.telefone = medico.telefone();
        this.crm = medico.crm();
        this.especialidade = medico.especialidade();
        this.endereco = new Endereco(medico.endereco());
    }

    public void atualizarInformacoes(DadosAtualizacaoMeidcos dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if(dados.endereco() != null){
            this.endereco.atualizarInformacoes(dados.endereco());
        }

    }
}
