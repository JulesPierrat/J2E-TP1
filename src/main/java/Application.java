import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        SimpleMessagePrinter printer =(SimpleMessagePrinter) context.getBean("SimpleMessagePrinter");
        printer.printMessage();

        FrenchMessagePrinter printer2 = (FrenchMessagePrinter) context.getBean("FrenchMessagePrinter");
        printer2.printMessage();

        CustomizableMessagePrinter printer3 = (CustomizableMessagePrinter) context.getBean("CustomizableMessagePrinter");
        printer3.printMessage();
    }
}

