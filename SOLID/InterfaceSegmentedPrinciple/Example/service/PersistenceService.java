package SOLID.InterfaceSegmentedPrinciple.Example.service;


import SOLID.InterfaceSegmentedPrinciple.Example.entity.Entity;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	
	
}
