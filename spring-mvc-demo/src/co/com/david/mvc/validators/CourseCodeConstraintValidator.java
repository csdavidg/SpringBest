package co.com.david.mvc.validators;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.com.david.mvc.annotations.CourseCode;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private List<String> prefix;

	@Override
	public void initialize(CourseCode courseCode) {
		this.prefix = Arrays.asList(courseCode.value());
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
		if (code == null) {
			return true;
		}
		return (prefix.stream().filter(p -> code.startsWith(p)).findAny().orElse(null) != null);
	}

}
