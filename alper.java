import javax.swing.*;

public class alper {
    public static void main (String[] args) {
        String name = JOptionPane.showInputDialog("Vad heter du?");
        JOptionPane.showMessageDialog(null, "Hej " + name + "!");
    }

    public String food(){
        System.out.println("Dolma");
        return "";
    }

    public String drink(){
        System.out.println("Vatten");
        return "";
    }
}
