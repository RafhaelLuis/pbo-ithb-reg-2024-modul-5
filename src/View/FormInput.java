package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormInput {

    private static JLabel labelNIK;
    private static JTextField inputNIK;
    
    public FormInput(){
        InputData();
    }

    public void InputData(){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        jFrame.setBounds(1920 / 2 - 500, 1080 / 2 - 400, 400, 400);
        jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE); 
        jPanel.setLayout(null);
        jFrame.add(jPanel);
        
        JLabel judulLabel = new JLabel("Input Data KTP");
        judulLabel.setBounds(140,20,1000,25);
        jPanel.add(judulLabel);

        labelNIK = new JLabel("NIK :");
        inputNIK = new JTextField(20);
        labelNIK.setBounds(10, 50, 100, 25);
        inputNIK.setBounds(130, 50, 225, 25);
        jPanel.add(labelNIK);
        jPanel.add(inputNIK);

        JLabel labelNama = new JLabel("Nama :");
        JTextField inputNama = new JTextField(20);
        labelNama.setBounds(10, 75, 100, 25);
        inputNama.setBounds(130, 75, 225, 25);
        jPanel.add(labelNama);
        jPanel.add(inputNama);

        JLabel labelTempatLahir = new JLabel("Tempat Lahir :");
        JTextField inputTempatLahir = new JTextField(20);
        labelTempatLahir.setBounds(10, 100, 100, 25);
        inputTempatLahir.setBounds(130, 100, 225, 25);
        jPanel.add(labelTempatLahir);
        jPanel.add(inputTempatLahir);

        JLabel labelTanggalLahir = new JLabel("Tanggal Lahir :");
        JTextField inputTanggalLahir = new JTextField(20);
        labelTanggalLahir.setBounds(10, 125, 100, 25);
        inputTanggalLahir.setBounds(130, 125, 225, 25);
        jPanel.add(labelTanggalLahir);
        jPanel.add(inputTanggalLahir);

        JLabel labelJenisKelamin = new JLabel("Jenis Kelamin :");
        JTextField inputJenisKelamin = new JTextField(20);
        labelJenisKelamin.setBounds(10, 150, 100, 25);
        inputJenisKelamin.setBounds(130, 150, 225, 25);
        jPanel.add(labelJenisKelamin);
        jPanel.add(inputJenisKelamin);

        JLabel labelGolonganDarah = new JLabel("Golongan Darah :");
        JTextField inputGolonganDarah = new JTextField(20);
        labelGolonganDarah.setBounds(10, 175, 130, 25);
        inputGolonganDarah.setBounds(130, 175, 225, 25);
        jPanel.add(labelGolonganDarah);
        jPanel.add(inputGolonganDarah);

        JLabel labelAlamat = new JLabel("Alamat :");
        JTextField inputAlamat = new JTextField(20);
        labelAlamat.setBounds(10, 200, 130, 25);
        inputAlamat.setBounds(130, 200, 225, 25);
        jPanel.add(labelAlamat);
        jPanel.add(inputAlamat);

        JLabel labelRtRw = new JLabel("RT/RW :");
        JTextField inputRtRw = new JTextField(20);
        labelRtRw.setBounds(10, 225, 130, 25);
        inputRtRw.setBounds(130, 225, 225, 25);
        jPanel.add(labelRtRw);
        jPanel.add(inputRtRw);

        JLabel labelKelDesa = new JLabel("Kel/Desa :");
        JTextField inputKelDesa = new JTextField(20);
        labelKelDesa.setBounds(10, 250, 100, 25);
        inputKelDesa.setBounds(130, 250, 225, 25);
        jPanel.add(labelKelDesa);
        jPanel.add(inputKelDesa);

        JLabel labelKecamatan = new JLabel("Kecamatan :");
        JTextField inputKecamatan = new JTextField(20);
        labelKecamatan.setBounds(10, 275, 100, 25);
        inputKecamatan.setBounds(130, 275, 225, 25);
        jPanel.add(labelKecamatan);
        jPanel.add(inputKecamatan);

        JLabel labelAgama = new JLabel("Agama :");
        JTextField inputAgama = new JTextField(20);
        labelAgama.setBounds(10, 300, 100, 25);
        inputAgama.setBounds(130, 300, 225, 25);
        jPanel.add(labelAgama);
        jPanel.add(inputAgama);

        JLabel labelStatusPerkawinan = new JLabel("Status Perkawinan :");
        JTextField inputStatusPerkawinan = new JTextField(20);
        labelStatusPerkawinan.setBounds(10, 325, 125, 25);
        inputStatusPerkawinan.setBounds(130, 325, 225, 25);
        jPanel.add(labelStatusPerkawinan);
        jPanel.add(inputStatusPerkawinan);

        JLabel labelPekerjaan = new JLabel("Pekerjaan :");
        JTextField inputPekerjaan = new JTextField(20);
        labelPekerjaan.setBounds(10, 350, 100, 25);
        inputPekerjaan.setBounds(130, 350, 225, 25);
        jPanel.add(labelPekerjaan);
        jPanel.add(inputPekerjaan);

        JLabel labelKewarganegaraan = new JLabel("Kewarganegaraan :");
        JTextField inputKewarganegaraan = new JTextField(20);
        labelKewarganegaraan.setBounds(10, 375, 120, 25);
        inputKewarganegaraan.setBounds(130, 375, 225, 25);
        jPanel.add(labelKewarganegaraan);
        jPanel.add(inputKewarganegaraan);

        JLabel labelBerlakuHingga = new JLabel("Berlaku Hingga :");
        JTextField inputBerlakuHingga = new JTextField(20);
        labelBerlakuHingga.setBounds(10, 400, 100, 25);
        inputBerlakuHingga.setBounds(130, 400, 225, 25);
        jPanel.add(labelBerlakuHingga);
        jPanel.add(inputBerlakuHingga);

        jFrame.setVisible(true);        
        

    }
}
