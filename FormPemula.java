import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Kelas FormPemula mewarisi JFrame (Konsep Inheritansi PBO)
public class FormPemula extends JFrame {

    // Attribute / Komponen Atomic GUI
    private JLabel labelNama;
    private JTextField textNama;
    private JLabel labelProdi;
    private JComboBox<String> comboProdi;
    private JCheckBox checkSetuju;
    private JButton buttonSimpan;

    // Konstruktor untuk inisialisasi tampilan GUI
    public FormPemula() {
        // Top-Level Container: Memanggil judul frame lewat super()
        super("Form Input Pemula (PBO)");

        // Pengaturan perilaku close dan ukuran frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360, 240);
        setLocationRelativeTo(null); // Memosisikan jendela di tengah layar

        // Intermediate Container: JPanel dengan FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // Inisialisasi Atomic Components
        labelNama = new JLabel("Nama:");
        textNama = new JTextField(15);

        labelProdi = new JLabel("Program Studi:");
        String[] opsiProdi = {"Informatika", "Sipil", "Elektro", "Mesin"};
        comboProdi = new JComboBox<>(opsiProdi);

        checkSetuju = new JCheckBox("Saya mengisi data dengan benar");
        buttonSimpan = new JButton("Simpan");

        // Memasukkan komponen ke dalam panel
        panel.add(labelNama);
        panel.add(textNama);
        panel.add(labelProdi);
        panel.add(comboProdi);
        panel.add(checkSetuju);
        panel.add(buttonSimpan);

        // Event Handling pada tombol simpan
        buttonSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText().trim();
                String prodi = (String) comboProdi.getSelectedItem();

                if (!checkSetuju.isSelected()) {
                    JOptionPane.showMessageDialog(FormPemula.this,
                            "Harap centang persetujuan terlebih dahulu!",
                            "Peringatan",
                            JOptionPane.WARNING_MESSAGE);
                } else if (nama.isEmpty()) {
                    JOptionPane.showMessageDialog(FormPemula.this,
                            "Nama tidak boleh kosong!",
                            "Peringatan",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(FormPemula.this,
                            "Data Disimpan!\nNama: " + nama + "\nProdi: " + prodi,
                            "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Menambahkan panel ke frame
        add(panel);
    }

    public static void main(String[] args) {
        // Menjalankan GUI di Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            FormPemula frame = new FormPemula();
            frame.setVisible(true);
        });
    }
}