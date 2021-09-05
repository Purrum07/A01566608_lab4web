package mx.tec.web.lab.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Size Validator to check if Sku size is valid
 * @author Mario Márquez
 * @version 1.0
 */

public class SizeValidator implements ConstraintValidator<ValidSize, String> {
	
	/**
	 * List of valid sizes to validate incoming values
	 */
	private final List<String> validSizes = Arrays.asList("XS", "S" , "M", "L", "XL");

	/**
	 * This method validates if a given size is within the valid ones
	 * @param value    The size value of the Sku which is going to be validated
	 * @param context  Provides contextual data when applying a given constraint
	 * @return True or False depending if the value given is in the list of valid sizes or not.
	 */
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return validSizes.contains(value);
	}
}
