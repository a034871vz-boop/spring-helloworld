import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean2.getMessage());

        Cat bean3 = applicationContext.getBean("c", Cat.class);
        System.out.println(bean3.getMessage());

        Cat bean4 = (Cat) applicationContext.getBean("c");
        System.out.println(bean4.getMessage());

        System.out.println(bean1 == bean2);

        System.out.println(bean3 == bean4);

    }
}