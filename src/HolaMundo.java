import javax.swing.*;
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        String name = JOptionPane.showInputDialog(null, "Type your name please");
        System.out.println("Eres el ganador: " + name);
    }
}
