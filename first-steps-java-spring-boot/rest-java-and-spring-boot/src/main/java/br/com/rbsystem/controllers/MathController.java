package br.com.rbsystem.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.rbsystem.operations.Operations;

@RestController
public class MathController {
	
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping(value = "/sum/{numberOne}/{numberTwo}")
	public Double sum(
				@PathVariable(value = "numberOne") String numberOne,
				@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		return new Operations().calc("+", numberOne, numberTwo);
	}
	
	@GetMapping(value = "/subtract/{numberOne}/{numberTwo}")
	public Double subtract(
				@PathVariable(value = "numberOne") String numberOne,
				@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		return new Operations().calc("-", numberOne, numberTwo);
	}
	
	@GetMapping(value = "/multiplication/{numberOne}/{numberTwo}")
	public Double multiplication(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		return new Operations().calc("*", numberOne, numberTwo);
	}
	
	@GetMapping(value = "/division/{numberOne}/{numberTwo}")
	public Double division(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		return new Operations().calc("/", numberOne, numberTwo);
	}

	@GetMapping(value = "/mean/{numberOne}/{numberTwo}")
	public Double mean(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		return new Operations().calc("mean", numberOne, numberTwo);
	}
	
	@GetMapping(value = "/squareRoot/{number}")
	public Double squareRoot(
			@PathVariable(value = "number") String number
			) throws Exception {
		
		return  new Operations().calc("squareRoot", number, null);
	}



	

}
