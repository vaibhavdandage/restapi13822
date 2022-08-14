package project.vpd.restapp13822.exception;

import java.util.LinkedList;
import java.util.List;

public class EmptyProductListException extends RuntimeException{
	
	private int errorCode = 1005;
	private List<String> desc = new LinkedList<String>();
	
	public EmptyProductListException(String s){	
		super(s);
	    desc.add(s);
	}
	
	public EmptyProductListException(){}
	
	
	public int getErrorCode() {
		return errorCode;
	}
	public List<String> getDesc() {
		return desc;
	}
	
}
