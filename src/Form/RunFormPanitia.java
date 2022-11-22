package Form;

import javax.swing.*;

public class RunFormPanitia {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Form Panitia");
        jFrame.setContentPane(new FormPanitia().getFormIrfan());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500,400);
        jFrame.setVisible(true);
    }
}
