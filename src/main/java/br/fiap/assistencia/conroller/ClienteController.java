package br.fiap.assistencia.conroller;

import br.fiap.assistencia.dto.ClienteRequest;
import br.fiap.assistencia.dto.ClienteResponse;
import br.fiap.assistencia.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
@AllArgsConstructor
public class ClienteController {
    private final ClienteService service;

    @PostMapping("/salvar")
    public ClienteResponse salvar(@RequestBody ClienteRequest dto) {
        return service.salvar(dto);
    }

    @GetMapping("/pesquisar/{id}")
    public ClienteResponse pesquisar(@PathVariable Long id) {
        return service.pesquisar(id);
    }

}
