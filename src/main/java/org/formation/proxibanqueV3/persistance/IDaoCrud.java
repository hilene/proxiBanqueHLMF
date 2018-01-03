package org.formation.proxibanqueV3.persistance;

import java.util.List;

import javax.persistence.EntityManager;




/**
 * @author HLMF
 * @param <T>
 * interface generique CRUD avec en plus entity manager en parametre 
 * afin de travailler avec la base de donnees
 * cette interface permettra a effectuer le CRUD avec les clients qu'avec les comptes bancaires
 * 
 */
public interface IDaoCrud<T> {

	
	T create(T paramT, EntityManager em);
	
	T read(long id, EntityManager em);
	
	T update(T paramT, EntityManager em);
	
	void delete (T paramT, EntityManager em);
		
	public List<T> showAll(EntityManager em);
	

}
