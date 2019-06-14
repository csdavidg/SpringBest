package co.com.david.springrestdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import co.com.david.springrestdemo.rest.StudentErrorResponse;

@ControllerAdvice
public class ExceptionHandlerApplication {

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException snfex) {

		StudentErrorResponse studentErrorResponse = new StudentErrorResponse();
		studentErrorResponse.setStatus(404);
		studentErrorResponse.setMessage(snfex.getMessage());
		studentErrorResponse.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(studentErrorResponse, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(Exception e) {

		StudentErrorResponse studentErrorResponse = new StudentErrorResponse();
		studentErrorResponse.setStatus(500);
		studentErrorResponse.setMessage(e.getMessage());
		studentErrorResponse.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(studentErrorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
