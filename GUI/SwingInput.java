import javax.swing.*;

public class SwingInput {

    public static void main(String [] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String age_str = JOptionPane.showInputDialog("What is your age?");
        int age = Integer.parseInt( age_str);

        System.out.println("Hello! "+name+" Did you say you are "+age+" years old");

    }
}
