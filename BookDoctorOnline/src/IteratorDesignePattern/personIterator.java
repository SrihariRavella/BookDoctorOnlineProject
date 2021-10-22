package IteratorDesignePattern;

public interface personIterator {
	
	public boolean hasNextDoctor();
	
	public Object nextDoctor();
	
	public boolean hasNextPatient();
	
	public Object nextPatient();
}
