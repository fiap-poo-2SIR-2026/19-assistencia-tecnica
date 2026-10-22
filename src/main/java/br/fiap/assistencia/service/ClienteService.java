package br.fiap.assistencia.service;

import br.fiap.assistencia.domain.Cliente;
import br.fiap.assistencia.dto.ClienteRequest;
import br.fiap.assistencia.dto.ClienteResponse;
import br.fiap.assistencia.mapper.Mapper;
import br.fiap.assistencia.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteService {
    private final ClienteRepository repo;
    private final Mapper mapper;

    @Transactional
    public ClienteResponse salvar(ClienteRequest dto) {
        Cliente cliente = mapper.paraEntidade(dto);
        Cliente clienteSalvo = repo.save(cliente);
        return mapper.paraResposta(cliente);
    }

    public ClienteResponse pesquisar(Long id) {
        Cliente cliente = repo.findById(id).orElseThrow();
        return mapper.paraResposta(cliente);
    }

    public List<ClienteResponse> listar() {
        return repo.findAll()
                .stream()
                .map(mapper::paraResposta)
                .toList();
    }

}
