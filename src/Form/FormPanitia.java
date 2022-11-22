package Form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanitia {
    private JTextField textNama;
    private JTextField textNim;
    private JTextField textDevisi;
    private JButton kirimSimpan;
    private JPanel formIrfan;
    private JLabel labelHasil;

    public FormPanitia() {
        kirimSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengambil data dari textNama
                String nama = textNama.getText();
                //mengambil data dari textNim
                String nim = textNim.getText();
                //mengambil data dari textDevisi
                String devisi = textDevisi.getText();
                //diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                mhs.setDevisi(devisi);
                //tampilkan output ke form
                labelHasil.setText(mhs.toString());
            }
        });
    }
    public JPanel getFormIrfan(){
        return formIrfan;

    }
}
