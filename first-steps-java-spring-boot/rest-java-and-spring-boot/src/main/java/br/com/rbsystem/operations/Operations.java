package br.com.rbsystem.operations;

import br.com.rbsystem.exceptions.UnsupportedMathOperationException;
import br.com.rbsystem.utils.UtilsMethods;

public class Operations {

	public Double calc(String op, String numberOne, String numberTwo) {
		
		switch (op) {
		case "+": {
			if (!UtilsMethods.isNumeric(numberOne) || !UtilsMethods.isNumeric(numberTwo)) {
				throw new UnsupportedMathOperationException("Please set a number value!");
			}
			
			return UtilsMethods.convertToDouble(numberOne) + UtilsMethods.convertToDouble(numberTwo);
		}
		case "-": {
			if (!UtilsMethods.isNumeric(numberOne) || !UtilsMethods.isNumeric(numberTwo)) {
				throw new UnsupportedMathOperationException("Please set a number value!");
			}
			
			return UtilsMethods.convertToDouble(numberOne) - UtilsMethods.convertToDouble(numberTwo);
		}
		case "*": {
			if (!UtilsMethods.isNumeric(numberOne) || !UtilsMethods.isNumeric(numberTwo)) {
				throw new UnsupportedMathOperationException("Please set a number value!");
			}
			
			return UtilsMethods.convertToDouble(numberOne) * UtilsMethods.convertToDouble(numberTwo);
		}
		case "/": {
			if (!UtilsMethods.isNumeric(numberOne) || !UtilsMethods.isNumeric(numberTwo)) {
				throw new UnsupportedMathOperationException("Please set a number value!");
			}
			
			return UtilsMethods.convertToDouble(numberOne) / UtilsMethods.convertToDouble(numberTwo);
		}
		case "mean": {
			if (!UtilsMethods.isNumeric(numberOne) || !UtilsMethods.isNumeric(numberTwo)) {
				throw new UnsupportedMathOperationException("Please set a number value!");
			}
			
			return ((UtilsMethods.convertToDouble(numberOne) + UtilsMethods.convertToDouble(numberTwo)) / 2);
		}
		case "squareRoot": {
			if (!UtilsMethods.isNumeric(numberOne)) {
				throw new UnsupportedMathOperationException("Please set a number value!");
			}
			
			return Math.sqrt(UtilsMethods.convertToDouble(numberOne));
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
		
		
	}
	
}
