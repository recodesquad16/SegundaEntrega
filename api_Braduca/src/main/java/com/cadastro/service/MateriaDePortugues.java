package com.cadastro.service;

import antlr.collections.List;


	

public interface MateriaDePortugues {
	MateriaDePortugues saveMateriaDePortugues(MateriaDePortugues MateriaDePortugues);
	List getAllMateriaDePortugues();
	MateriaDePortugues getMateriaDePortuguesById(long id);
	MateriaDePortugues updateMateriaDePortugues(MateriaDePortugues MateriaDePortugues, long id);
	void deleteMateriaDePortugues(long id);
	

}
