import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        var printer = new SimpleMessagePrinter();
        printer.printMessage();
    }

    ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
}

