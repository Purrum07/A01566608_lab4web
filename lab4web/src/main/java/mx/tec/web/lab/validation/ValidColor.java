package mx.tec.web.lab.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Valid Color Interface to manage actions when validating colors
 * @author Mario Márquez
 * @version 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Constraint(validatedBy = ColorValidator.class)
public @interface ValidColor {
	
	/**
	 * Default message when invalid color is given
	 * @return message Invalid color
	 */
	String message() default "Invalid color";

	/**
	 * Default group when invalid color is given
	 * @return List of groups
	 */
	Class<?>[] groups() default {};
	
	/**
	 * Default Payload associated with the constraint declaration when invalid color is given
	 * @return List of Payload 
	 */
	Class<? extends Payload>[] payload() default {};
}
