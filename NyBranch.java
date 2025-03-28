import javax.swing.*;

public class NyBranch {
    public static void main(String[] args) {
        String fråga = JOptionPane.showInputDialog("Undrar du någons favoritmat eller dricka?");

        if (fråga.equals("dricka")) {
            String vems = JOptionPane.showInputDialog("Vems?");
            if (vems.equals("Alper")){
                Alper.drink();
            }
        }
    }
}