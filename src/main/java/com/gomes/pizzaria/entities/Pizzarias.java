package com.gomes.pizzaria.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pizzarias")
public class Pizzarias implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String nomePizzaria;
    private String endereco;
    private String telefone;
    private String horarioFuncionamento;


    public Pizzarias() {
    }


	public Pizzarias(Long id, String nomePizzaria, String endereco, String telefone, String horarioFuncionamento) {
		super();
		this.id = id;
		this.nomePizzaria = nomePizzaria;
		this.endereco = endereco;
		this.telefone = telefone;
		this.horarioFuncionamento = horarioFuncionamento;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomePizzaria() {
		return nomePizzaria;
	}


	public void setNomePizzaria(String nomePizzaria) {
		this.nomePizzaria = nomePizzaria;
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


	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}


	public void setHorarioFuncionamento(String horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		return Objects.hash(endereco, horarioFuncionamento, id, nomePizzaria, telefone);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizzarias other = (Pizzarias) obj;
		return Objects.equals(endereco, other.endereco)
				&& Objects.equals(horarioFuncionamento, other.horarioFuncionamento) && Objects.equals(id, other.id)
				&& Objects.equals(nomePizzaria, other.nomePizzaria) && Objects.equals(telefone, other.telefone);
	}
    
}