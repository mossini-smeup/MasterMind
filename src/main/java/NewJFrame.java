
import java.awt.Component;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paolo
 */
public class NewJFrame extends javax.swing.JFrame {
    String numeroRandom = "";
    long inizioDurata = 0;
    long fineDurata = 0;
    int tentativi = 0;
    
    private static Component frame;
    
    public static String randomString(){
        Random rand = new Random();
        String numero = "";
        for (int i=0;i<4;i++){
            numero += String.valueOf(rand.nextInt(9));
        }
        return numero;
    }
    
    
    public static boolean numeroValido(String numero){
        boolean validità = false;
        for(int i = 0; i < numero.length(); i++){
            int ripetizioni = 0;
            for(int j = 0; j < numero.length(); j++){
                if(numero.charAt(i) == numero.charAt(j)){
                    ripetizioni++;
                }
            }
            if(ripetizioni > 1){
                validità = false;
                break;
            }else{
                validità = true;
            }
        }
        return validità;
    }
    
    public static int numeriGiustiPosizioniUguali(String numeroRandom, String numeroUtente){
        int risultato = 0;
        for(int i = 0; i < numeroRandom.length(); i++){
            for(int j = 0; j < numeroUtente.length(); j++){
                if(numeroRandom.charAt(i) == numeroUtente.charAt(j) && i == j){
                    risultato++;
                }
            }
        }
        return risultato;
    }
    
    public static int numeriGiustiPosizioniSbagliate(String numeroRandom, String numeroUtente){
        int risultato = 0;
        for(int i = 0; i < numeroRandom.length(); i++){
            for(int j = 0; j < numeroUtente.length(); j++){
                if(numeroRandom.charAt(i) == numeroUtente.charAt(j)  && i != j){
                    risultato++;
                }
            }
        }
        return risultato;
    }

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        inizioDurata = System.currentTimeMillis();
        
        boolean numeroValido = false;
       
        while(numeroValido == false){
            numeroRandom = NewJFrame.randomString();
            numeroValido = NewJFrame.numeroValido(numeroRandom);
        }
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

        numeroInserito = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        controlla = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        numTentativi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        soluzione = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        secondiImpiegati = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numeroInserito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroInseritoActionPerformed(evt);
            }
        });

        jLabel1.setText("Inserisci Numero:");

        controlla.setText("Controlla");
        controlla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllaActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero Tentativi: ");

        numTentativi.setEditable(false);

        jLabel3.setText("Soluzione: ");

        soluzione.setEditable(false);

        jLabel4.setText("Secondi Impiegati: ");

        secondiImpiegati.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numTentativi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroInserito, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(controlla)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secondiImpiegati, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soluzione, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroInserito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(controlla))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numTentativi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(soluzione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(secondiImpiegati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroInseritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroInseritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroInseritoActionPerformed

    private void controllaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controllaActionPerformed
        tentativi++;
        System.out.println(numeroRandom);
        //JOptionPane.showMessageDialog(frame, numero);
        
        String numeroUtente = this.numeroInserito.getText();
        
        if(numeroUtente.equals("9999")){
            soluzione.setText(numeroRandom);
        }
        
        if(numeroUtente.length() != 4){
            JOptionPane.showMessageDialog(frame, "La lunghezza del numero non è corretta");
            this.numeroInserito.setText("");
            
        }else if(numeroValido(numeroUtente)){
            int cifreGiustePosizioneGiusta = NewJFrame.numeriGiustiPosizioniUguali(numeroRandom, numeroUtente);
            int cifreGiustePosizioneSbagliata = NewJFrame.numeriGiustiPosizioniSbagliate(numeroRandom, numeroUtente);
            
            JOptionPane.showMessageDialog(frame, "Ci sono " + cifreGiustePosizioneGiusta + " cifre giuste al posto corretto");
            JOptionPane.showMessageDialog(frame, "Ci sono " + cifreGiustePosizioneSbagliata + " cifre giuste al posto sbagliato");
            
            if(cifreGiustePosizioneGiusta == 4){
                fineDurata = System.currentTimeMillis();
                JOptionPane.showMessageDialog(frame, "HAI INDOVINATO IL NUMERO: " + numeroUtente);
                numTentativi.setText(""+tentativi);
                soluzione.setText(numeroRandom);
                secondiImpiegati.setText(""+(fineDurata - inizioDurata)/1000);
            }
            
        }else{
            JOptionPane.showMessageDialog(frame, "Il numero non è valido");
            this.numeroInserito.setText("");
        }
        
        System.out.println(numeroUtente);
    }//GEN-LAST:event_controllaActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton controlla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField numTentativi;
    private javax.swing.JTextField numeroInserito;
    private javax.swing.JTextField secondiImpiegati;
    private javax.swing.JTextField soluzione;
    // End of variables declaration//GEN-END:variables
}
