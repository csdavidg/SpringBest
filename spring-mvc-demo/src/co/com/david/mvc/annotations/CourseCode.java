package co.com.david.mvc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import co.com.david.mvc.validators.CourseCodeConstraintValidator;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	public String[] value() default {"LUV", "DAV"};

	public String message() default "Must start with LUV";

	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};

}
