
public class Main extends javax.swing.JFrame {

    private int[][] matrizDeAdyacencia;

    public Main() {
        initComponents();
        this.setTitle("Grafo");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Background = new javax.swing.JPanel();
        JL_NúmeroDeNodos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTA_MatrizDeAdyacencia = new javax.swing.JTextArea();
        JTF_Nodos = new javax.swing.JTextField();
        JT_GenerarGrafo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JL_NúmeroDeNodos.setText("Número de nodos:");

        JTA_MatrizDeAdyacencia.setColumns(20);
        JTA_MatrizDeAdyacencia.setRows(5);
        jScrollPane1.setViewportView(JTA_MatrizDeAdyacencia);

        JT_GenerarGrafo.setText("Generar grafo");
        JT_GenerarGrafo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JT_GenerarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_GenerarGrafoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_BackgroundLayout = new javax.swing.GroupLayout(JP_Background);
        JP_Background.setLayout(JP_BackgroundLayout);
        JP_BackgroundLayout.setHorizontalGroup(
            JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(JP_BackgroundLayout.createSequentialGroup()
                        .addComponent(JL_NúmeroDeNodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_Nodos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JT_GenerarGrafo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JP_BackgroundLayout.setVerticalGroup(
            JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_NúmeroDeNodos)
                    .addComponent(JTF_Nodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_GenerarGrafo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JP_Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JT_GenerarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_GenerarGrafoActionPerformed
        int nodos = Integer.parseInt(JTF_Nodos.getText());
        matrizDeAdyacencia = new int[nodos][nodos];
        String[] filas = JTA_MatrizDeAdyacencia.getText().split("\n");
        for (int i = 0; i < filas.length; i++) {
            String[] valores = filas[i].split(" ");
            for (int j = 0; j < valores.length; j++) {
                matrizDeAdyacencia[i][j] = Integer.parseInt(valores[j]);
            }
        }
        GraphFrame gp = new GraphFrame(matrizDeAdyacencia);
        new GraphFrame(matrizDeAdyacencia).setVisible(true);
    }//GEN-LAST:event_JT_GenerarGrafoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_NúmeroDeNodos;
    private javax.swing.JPanel JP_Background;
    private javax.swing.JTextArea JTA_MatrizDeAdyacencia;
    private javax.swing.JTextField JTF_Nodos;
    private javax.swing.JButton JT_GenerarGrafo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
