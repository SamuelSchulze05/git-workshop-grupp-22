import javax.swing.*;

public class alper {
    public static void main (String[] args) {
        String name = JOptionPane.showInputDialog("Vad heter du?");
        JOptionPane.showMessageDialog(null, "Hej " + name + "!");
    }
}
