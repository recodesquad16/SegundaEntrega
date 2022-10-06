package com.cadastro.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.model.entity.Aluno;
import com.cadastro.service.AlunoService;

@Service
public abstract class AlunoServiceImpl  implements AlunoService{

	private static final Iterable<Long> id = null;
	@Autowired
private com.cadastro.repositories.AlunoRepository  AlunoRepository;
	
	@Override
	public Aluno saveAluno(Aluno Aluno) {
	return AlunoRepository.save(Aluno);
	}
	
	@Override
	public List<Aluno> gelAllAluno(){
		return   AlunoRepository.findAllById(id)).orElseThrow();
	}
	@Override
	
	public  Aluno  updateAluno ( Aluno  Aluno, long id) { 
		
		Aluno  AlunoExistente = AlunoRepository.findById(id).orElseThrow();
		
		AlunoExistente.setNome( Aluno.getNome());
		AlunoExistente.setNome( Aluno.getNome());
		
		AlunoRepository.save( AlunoExistente);
			return  AlunoExistente;
		}
	@Override
	public void deleteAluno(long id) {
		AlunoRepository.findById(id).orElseThrow();

         AlunoRepository.deleteById(id);
}
}
