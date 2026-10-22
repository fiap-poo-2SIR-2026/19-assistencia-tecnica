package br.fiap.assistencia.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "JAVA_CLIENTE") // pois o nome da classe não está escrito igual está no banco
@Getter
@Setter
//@NoArgsConstructor // para dizer que não tem construtor com argumentos (mas dominio não pode ter construtor)
public class Cliente {
    // todos os atributos tem que estar ligados com o que está ligado com o banco de dados

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long id;

    @Column(name = "NOME", nullable = false, length = 120)
    private String nome;

    @Column(name = "EMAIL", length = 120, unique = true)
    private String email;

    @Column(name = "TELEFONE", length = 20)
    private String telefone;

    @Column(name = "SENHA", length = 512)
    private String senha;
}