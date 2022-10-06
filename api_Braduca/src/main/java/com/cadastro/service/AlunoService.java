package com.cadastro.service;

import com.cadastro.model.entity.Aluno;

import antlr.collections.List;


public interface AlunoService {
	
	Aluno saveAluno(Aluno Aluno);
	List getAllAluno();
	Aluno getAlunoById(long id);
	Aluno updateAluno(Aluno Aluno, long id);
	void deleteAluno(long id);
	java.util.List<Aluno> gelAllAluno();
	

}
