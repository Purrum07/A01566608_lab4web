/**
 * 
 */
package mx.tec.web.lab.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Color Validator to check if Sku color is valid
 * @author Mario Márquez
 * @version 1.0
 */
public class ColorValidator implements ConstraintValidator<ValidColor, String>{
	
	/**
	 * List of valid colors to validate incoming values
	 */
	private final List<String> validColors = Arrays.asList("negro", "azul claro" , "azul marino", "Dark Stonewash", "black");

	/**
	 * This method validates if a given color is within the valid ones
	 * @param value    The color value of the Sku which is going to be validated
	 * @param context  Provides contextual data when applying a given constraint
	 * @return True or False depending if the value given is in the list of valid colors or not.
	 */
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		for (String validColor : validColors) {
			if(validColor.equalsIgnoreCase(value)) {
				return true;
			}
		}
		return false;
	}

}
