package JavaCore.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Essa anotação é utilizada para definir se essa annotation estará disponível
// no código fonte ou no binário.
@Retention(RetentionPolicy.RUNTIME)

// Essa anotação define que tipo de métodos anotados serão incluídos no javadoc
@Documented

// Essa anotação é utilizada para indicar que tipo de elementos poderão ser
// anotados com a anotação que está sendo definida.
@Target(ElementType.FIELD)

// Essa anotação indica que que subclasses que herdarem a classe que contém essa
// anotação, também herdará a anotação
@Inherited
public @interface annotation {
	String nome() default "Afonso mateus";

	int idade();
}
