package project.vpd.restapp13822.exception;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import project.vpd.restapp13822.action.ActionResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	ObjectMapper mapper = new ObjectMapper();
	@Value(value="${data.exception.emptyProductList}")
	private String emptyProductList;
	
	@Value( value = "${data.exception.invalidBusinessData}")
	private String invalidBusinessData;
	
	@Value( value = "${data.exception.invalidData}")
	private String invalidData;
	
	@ExceptionHandler(value = EmptyProductListException.class)
	public ResponseEntity emptyProductList(EmptyProductListException e){
		return new ResponseEntity(e.getDesc(),HttpStatus.BAD_REQUEST);
	}
	
		
	@ExceptionHandler (value = InvalidDataException.class)
	public ResponseEntity invalidData(InvalidDataException e){
		return new ResponseEntity(invalidData, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = InvalidBusinessDataException.class)
	public ResponseEntity<String> invalidBusinessData(InvalidBusinessDataException e){
		List<String> list=new LinkedList<String>();
		list.add("vaibhav");
		list.add("exception");
		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST,"ApiError",list);
		try {
			System.out.println(mapper.writeValueAsString(apiError));
			return new ResponseEntity<String>(mapper.writeValueAsString(apiError),HttpStatus.BAD_REQUEST);
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
		
	}
}
