package com.cadastro.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Aluno {
	
@Entity
@Table (nome = " aluno")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Id
@Column
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column
private String Nome_aluno;
@Column
private String Endereco;
@Column
private String Data_de_nascimento;
@Column
private String Rg;
@Column
private String Cpf;
@Column
private String Email;
public Object getNome() {
	// TODO Auto-generated method stub
	return null;
}
public void setNome(Object nome) {
	// TODO Auto-generated method stub
	
}
}
