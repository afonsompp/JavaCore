package JavaCore.classLoaders;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class CustomClassLoader extends ClassLoader {

	@Override
	public Class<?> findClass(String name) throws ClassNotFoundException {
		byte[] b = loadClassFromFile(name);
		return defineClass(name, b, 0, b.length);
	}

	private byte[] loadClassFromFile(String fileName) {
		InputStream inputStream = getClass().getClassLoader()
				.getResourceAsStream(fileName.replace('.', File.separatorChar) + ".class");
		byte[] buffer;
		ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
		int nextValue = 0;
		try {
			while ((nextValue = inputStream.read()) != -1) {
				byteArray.write(nextValue);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		buffer = byteArray.toByteArray();

		return buffer;
	}
}
