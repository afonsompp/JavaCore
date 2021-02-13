package JavaCore.classLoaders;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		printClassLoader();
	}

	public static void printClassLoader() {
		System.out.println("ClassLoader of this class: " + App.class.getClassLoader());
		System.out.println("ClassLoader of ArrayList: " + ArrayList.class.getClassLoader());
	}

}
