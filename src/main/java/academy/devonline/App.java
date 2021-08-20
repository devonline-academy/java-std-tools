package academy.devonline;

//import org.apache.commons.lang3.SystemUtils;

import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println(SystemUtils.getJavaHome());

        Class<?> systemUtilsClass = Class.forName("org.apache.commons.lang3.SystemUtils");
        Method getJavaHomeMethod = systemUtilsClass.getDeclaredMethod("getJavaHome");
        System.out.println(getJavaHomeMethod.invoke(null));
    }
}
