package atividade2webjsf.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
@Table(name = "UNIVERSIDADE")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class Universidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotNull(message = "O campo Nome não pode estar vazio!")
    @NotBlank(message = "O campo Nome não pode estar vazio!")
    @NotEmpty(message = "O campo Nome não pode estar vazio!")
    private String nome;

    @Column(unique = true)
    @NotNull(message = "O campo Nome não pode estar vazio!")
    @NotBlank(message = "O campo Nome não pode estar vazio!")
    @NotEmpty(message = "O campo Nome não pode estar vazio!")
    private String endereco;

    @Column(unique = true)
    @NotNull(message = "O campo Nome não pode estar vazio!")
    @NotBlank(message = "O campo Nome não pode estar vazio!")
    @NotEmpty(message = "O campo Nome não pode estar vazio!")
    private String telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
