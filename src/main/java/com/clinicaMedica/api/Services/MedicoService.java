package com.clinicaMedica.api.Services;

import com.clinicaMedica.api.Domain.Dtos.DadosAtualizacaoMeidcos;
import com.clinicaMedica.api.Domain.Dtos.DadosCadastroMedico;
import com.clinicaMedica.api.Domain.Dtos.DadosListagemMedico;
import com.clinicaMedica.api.Domain.Medico;
import com.clinicaMedica.api.Repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository repository;

    @Transactional
    public void criar(DadosCadastroMedico dto) {
        repository.save(new Medico(dto));
    }

    public Page<DadosListagemMedico> listarMedicos(Pageable pagina) {
        return repository.findAllByAtivoTrue(pagina).map(DadosListagemMedico::new);
    }

    @Transactional
    public void atualizar(DadosAtualizacaoMeidcos dados){
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }

    @Transactional
    public void excluir(Long id) {
        var medico = repository.getReferenceById(id);
        medico.setAtivo(false);

    }
}
