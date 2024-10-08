import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHW1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanHW == beanHW1);
        System.out.println(beanCat == beanCat1);
    }
}