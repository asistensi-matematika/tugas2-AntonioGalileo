package Asistensi;
public class Aproximasi extends javax.swing.JFrame {

    /**
     * Creates new form Aproksimasi
     */
    public Antonio_Tugas2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PilihanSoal = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nilaia = new javax.swing.JTextField();
        nilain = new javax.swing.JTextField();
        nilaix = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        JenisSoal = new javax.swing.JTextField();
        Hasil = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Square New TC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Aproksimasi");

        PilihanSoal.setBackground(new java.awt.Color(0, 102, 153));
        PilihanSoal.setFont(new java.awt.Font("Square New Tc", 0, 14)); // NOI18N
        PilihanSoal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilihan Soal", "Soal 4", "Soal 5", "Soal 7" }));
        PilihanSoal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PilihanSoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihanSoalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Square New Tc", 1, 16)); // NOI18N
        jLabel3.setText("Masukkan Angka :");

        jLabel4.setFont(new java.awt.Font("Square New Tc ", 0, 16)); // NOI18N
        jLabel4.setText("a");
        jLabel4.setName("text"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Square New Tc ", 0, 16)); // NOI18N
        jLabel5.setText("n");

        jLabel6.setFont(new java.awt.Font("Square New Tc ", 0, 16)); // NOI18N
        jLabel6.setText("x");

        nilaia.setBackground(new java.awt.Color(255, 0, 0));
        nilaia.setFont(new java.awt.Font("Square New Tc ", 0, 12)); // NOI18N
        nilaia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiaActionPerformed(evt);
            }
        });

        nilain.setBackground(java.awt.Color.white);
        nilain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilainActionPerformed(evt);
            }
        });

        nilaix.setBackground(new java.awt.Color(255, 255, 0));
        nilaix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaixActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Square New Tc ", 0, 10)); // NOI18N
        jButton1.setText("HITUNG");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Square New Tc ", 0, 11)); // NOI18N
        jButton2.setText("HAPUS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Square New Tc ", 0, 11)); // NOI18N
        jButton3.setText("KELUAR");

        JenisSoal.setBackground(new java.awt.Color(51, 255, 51));
        JenisSoal.setFont(new java.awt.Font("Square New Tc ", 0, 36)); // NOI18N
        JenisSoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JenisSoalActionPerformed(evt);
            }
        });

        Hasil.setBackground(new java.awt.Color(0, 0, 255));
        Hasil.setFont(new java.awt.Font("Square New Tc ", 0, 48)); // NOI18N
        Hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Square New Tc ", 0, 24)); // NOI18N
        jLabel2.setText("Nilai");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nilaix, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nilain, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nilaia, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(PilihanSoal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JenisSoal, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(PilihanSoal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JenisSoal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nilaia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nilain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nilaix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PilihanSoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihanSoalActionPerformed
        switch(PilihanSoal.getSelectedIndex()){
            case 0:
                nilaia.setText("");
                nilain.setText("");
                nilaix.setText("");
                JenisSoal.setText("");
                Hasil.setText("");
                break;
            case 1:
                JenisSoal.setText("f(x) = ln(-x)");
                break;
            case 2:
                JenisSoal.setText("f(x) = x/1-x");
                break;
            case 3:
                JenisSoal.setText("f(x) = xe^2x");
                break;    
        }
    }//GEN-LAST:event_PilihanSoalActionPerformed
public static double faktorial(int angka){
    if(angka == 1 || angka == 0){
        return 1;        
    }else{
        return angka*faktorial(angka-1);
    }
}	
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nilaia.setText("");
        nilain.setText("");
        nilaix.setText("");
	  Hasil.setText("");
        JenisSoal.setText("");
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nilaiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaiaActionPerformed

    private void JenisSoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JenisSoalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JenisSoalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double a = Double.parseDouble(nilaia.getText());
        double n = Double.parseDouble(nilain.getText());
        double x = Double.parseDouble(nilaix.getText());
        double [] f = new double[10001];
        double Fungsi = 0;
        double Es = 0.5 * Math.pow(10, 2-n);
        
        switch(PilihanSoal.getSelectedIndex()){
                case 1:
                //Soal Nomor 4    
                    f[0] = Math.log(-a);
                    for(int i=1; i<=100000; i++){
                    f[i]=f[i-1] + (Math.pow(-1,i+1)*Math.pow(x-a, i))/(i*Math.pow(a,i));
                        double ea = ((f[i]-f[i-1])/f[i])*100;
                        if(Math.abs(ea)<Es){
                            Fungsi+=f[i];
                            break;
                    }
                }
                double nilai1 = Math.floor(Fungsi*1000)/1000;
                Hasil.setText(String.valueOf(nilai1));        
                break;
                
                case 2:
                //Soal Nomor 5    
                f[0] = a/(1-a);
                double es = 0.5 * Math.pow(10, 2-n);
                for(int i=1; i<=100000; i++){
                f[i]=f[i-1]+deret(x, a, i); 
                double Ea = ((f[i]-f[i-1])/f[i])*100;
                if(Math.abs(Ea)<Es){
                    Fungsi += f[i];
                    break;
                    }
                }
                double nilai2 = Math.floor(Fungsi*100000)/100000;
                Hasil.setText(String.valueOf(nilai2));
                break;
            
                case 3:
                //Soal Nomor 7
                    f[0] = a*Math.exp(2*a);
                    double b;
                    double c = 1;
                    for(int i=1; i<=1000; i++){
                        b = Math.pow(2,i);
                        f[i] = f[i-1] + (b*a*Math.exp(2*x)+c*Math.exp(2*a))*Math.pow(x-a,1)/faktorial(i);
                        c = 2*c+b;
                        double ea = ((f[i]-f[i-1])/f[i])*100;
                        if(Math.abs(ea)<Es){
                            Fungsi+=f[i];
                            break;
                        }
            }
                    double nilai3 = Math.floor(Fungsi*100)/100;
                    Hasil.setText(String.valueOf(nilai3));
                    break;
        }
    }
        public static double deret(double x, double a, int suku) {
        double hasil = 1/(1-a);
        for(int i=1; i<=suku; i++){
            hasil *=(x-a)/(1-a); 
        }
        return hasil;
}
    //GEN-LAST:event_jButton1ActionPerformed

    private void nilainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilainActionPerformed

    private void nilaixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaixActionPerformed

    private void HasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HasilActionPerformed

private void HasilActionPerformed(java.awt.event.ActionEvent evt){
	this.dispose();

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aproximasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aproximasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aproximasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aproximasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimaTeguh_TUGAS2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Hasil;
    private javax.swing.JTextField JenisSoal;
    private javax.swing.JComboBox<String> PilihanSoal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nilaia;
    private javax.swing.JTextField nilain;
    private javax.swing.JTextField nilaix;

    // End of variables declaration//GEN-END:variables
