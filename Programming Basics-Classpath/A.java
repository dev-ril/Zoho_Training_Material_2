
import java.lang.reflect.*;
import java.net.*;

class A
{
	public static void main(String[] args) throws Exception
	{
		A.getName();

		URL[] classLoaderUrl = new URL[]{new URL("file:///D:/Zoho Internship/Project Trainee/Tasks 2/Programming Basics-Classpath/D2/")};

		URLClassLoader urlClassLoader = new URLClassLoader(classLoaderUrl);

		Class<?> loadclass = urlClassLoader.loadClass("B");

		Constructor<?> constructor = loadclass.getConstructor();
        Object obj = constructor.newInstance();
         
        Method method = loadclass.getMethod("func");
        method.invoke(obj);
	}

	public static void getName()
	{
		System.out.println("Hello, this is A");
	}
}