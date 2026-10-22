package br.fiap.assistencia.dto;

public record ClienteResponse(Long id,
                              String nome,
                              String email,
                              String telefone
) {
}
