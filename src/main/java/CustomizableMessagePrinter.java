public class CustomizableMessagePrinter implements MessagePrinter {
    // Attribute
    private String message;

    // Constructor
    public CustomizableMessagePrinter(){
        this.message = "Customizable message";
    }

    public CustomizableMessagePrinter(String message){
        this.message = message;
    }

    public void printMessage() {
        System.out.println(this.message);
    }

    
}
