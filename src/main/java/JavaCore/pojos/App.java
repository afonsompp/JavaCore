package JavaCore.pojos;

import java.beans.PropertyDescriptor;

import org.apache.commons.beanutils.PropertyUtils;

public class App {
	public static void main(String[] args) {

		// Propriedades detectadas em uma classe pojo
		PropertyDescriptor[] propertyNamesPojo = PropertyUtils.getPropertyDescriptors(PersonPOJO.class);

		for (PropertyDescriptor propertyDescriptor : propertyNamesPojo) {
			System.out.println(propertyDescriptor.getDisplayName());
		}

		System.out.println("-------------------");

		// Após realizar a conversão para java bean
		PropertyDescriptor[] propertyNamesBean = PropertyUtils.getPropertyDescriptors(PersonBean.class);

		for (PropertyDescriptor propertyDescriptor : propertyNamesBean) {
			System.out.println(propertyDescriptor.getDisplayName());
		}

		// pojos podem serem utilizados para casos one não há a utilização de
		// frameworks. Já o java bean é uma especificação de um pojo que segue algumas
		// regras, como por exemplo a necessidade dos construtores sem argumtos e dos
		// getters e setters, mas utilizar os beans tem alguns pontos negativos, como
		// por exemplo: a mutabilidade dos objetivos, a criação de construtores vazios e
		// a obrigatoriedade de criar getters e ou muitos setters desnecessários.
	}
}
