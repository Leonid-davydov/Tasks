package Task_2.main;

import by.incubator.Main;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class Start {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        URL[] urls = new URL[]{new URL("file:///D:/Programming/Incubator/Java Core/Tasks/src/Task_2/jar/example.jar")};
        URLClassLoader classLoader = new URLClassLoader(urls);

        Class<?> aClass = classLoader.loadClass("by.incubator.Main");

        try {
            Main instance = (Main) aClass.newInstance();
            instance.main(new String[]{});
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}


