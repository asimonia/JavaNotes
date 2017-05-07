import javax.swing.*;

public class HelloWorldGUI1 {

   private static String input;
   
   public static void main(String[] args) {
      JOptionPane.showMessageDialog( null, "Hello World!" );
      JOptionPane.showConfirmDialog( null, "Do you read me?");
      input = JOptionPane.showInputDialog( null, "Is this the real life?");
      System.out.println(input);
   }

}

