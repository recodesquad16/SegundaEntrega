package com.cadastro.service;

import com.cadastro.model.entity.AtividadeExtra;

import antlr.collections.List;

public interface AtividadeExtraService {
	
	AtividadeExtra saveAtividadeExtra(AtividadeExtra AtividadeExtra);
	List getAllAtividadeExtra();
	AtividadeExtra getAtividadeExtraById(long id);
	AtividadeExtra updateAtividadeExtra(AtividadeExtra AtividadeExtra, long id);
	void deleteAtividadeExtra(long id);
	

}
