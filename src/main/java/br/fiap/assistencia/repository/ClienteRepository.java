package br.fiap.assistencia.repository;

import br.fiap.assistencia.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    public Optional<Cliente> findByEmail(String email);
}
