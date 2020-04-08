//Adicionado ao git
package Interface_grafica.pkg;
//Pacotes IN
import java.awt.event.KeyEvent;
import pacote_rotores.pkg.*;
import pacote_prepararotores.pkg.*;
import pacote_mensagem.pkg.*;
import pacote_funcionamento.pkg.*;
import java.util.*;
import javax.swing.*;
//FIM
public class MainFrame extends javax.swing.JFrame {
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        CBX_R1 = new javax.swing.JComboBox<>();
        CBX_R2 = new javax.swing.JComboBox<>();
        CBX_R3 = new javax.swing.JComboBox<>();
        CBX_CH1 = new javax.swing.JComboBox<>();
        CBX_CH2 = new javax.swing.JComboBox<>();
        CBX_CH3 = new javax.swing.JComboBox<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        C1_0 = new javax.swing.JComboBox<>();
        C1_1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        C2_0 = new javax.swing.JComboBox<>();
        C2_1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        C3_0 = new javax.swing.JComboBox<>();
        C3_1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        C6_0 = new javax.swing.JComboBox<>();
        C6_1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        C5_0 = new javax.swing.JComboBox<>();
        C5_1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        C4_0 = new javax.swing.JComboBox<>();
        C4_1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JEntrada = new javax.swing.JTextArea();
        Confirmar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JSaida = new javax.swing.JTextArea();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enigma 1");
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Aviso(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(855, 530));

        jTabbedPane1.setBackground(new java.awt.Color(102, 0, 0));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        CBX_R1.setBackground(new java.awt.Color(255, 255, 153));
        CBX_R1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CBX_R1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modelo 1", "Modelo 2", "Modelo 3", "Modelo 4", "Modelo 5" }));
        CBX_R1.setSelectedIndex(0);

        CBX_R2.setBackground(new java.awt.Color(255, 255, 153));
        CBX_R2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CBX_R2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modelo 1", "Modelo 2", "Modelo 3", "Modelo 4", "Modelo 5" }));
        CBX_R2.setSelectedIndex(2);

        CBX_R3.setBackground(new java.awt.Color(255, 255, 153));
        CBX_R3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CBX_R3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modelo 1", "Modelo 2", "Modelo 3", "Modelo 4", "Modelo 5" }));
        CBX_R3.setSelectedIndex(4);

        CBX_CH1.setBackground(new java.awt.Color(255, 255, 153));
        CBX_CH1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CBX_CH1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26" }));
        CBX_CH1.setSelectedIndex(4);

        CBX_CH2.setBackground(new java.awt.Color(255, 255, 153));
        CBX_CH2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CBX_CH2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26" }));
        CBX_CH2.setSelectedIndex(9);

        CBX_CH3.setBackground(new java.awt.Color(255, 255, 153));
        CBX_CH3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CBX_CH3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26" }));
        CBX_CH3.setSelectedIndex(14);

        jLayeredPane1.setBackground(new java.awt.Color(153, 0, 0));
        jLayeredPane1.setOpaque(true);

        C1_0.setBackground(new java.awt.Color(255, 255, 204));
        C1_0.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        C1_0.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));

        C1_1.setBackground(new java.awt.Color(255, 255, 204));
        C1_1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        C1_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        C1_1.setSelectedIndex(25);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Para");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Para");

        C2_0.setBackground(new java.awt.Color(255, 255, 204));
        C2_0.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        C2_0.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        C2_0.setSelectedIndex(1);

        C2_1.setBackground(new java.awt.Color(255, 255, 204));
        C2_1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        C2_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        C2_1.setSelectedIndex(24);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Para");

        C3_0.setBackground(new java.awt.Color(255, 255, 204));
        C3_0.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        C3_0.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        C3_0.setSelectedIndex(2);

        C3_1.setBackground(new java.awt.Color(255, 255, 204));
        C3_1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        C3_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        C3_1.setSelectedIndex(23);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Para");

        C6_0.setBackground(new java.awt.Color(255, 255, 204));
        C6_0.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        C6_0.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        C6_0.setSelectedIndex(5);

        C6_1.setBackground(new java.awt.Color(255, 255, 204));
        C6_1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        C6_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        C6_1.setSelectedIndex(20);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Para");

        C5_0.setBackground(new java.awt.Color(255, 255, 204));
        C5_0.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        C5_0.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        C5_0.setSelectedIndex(4);

        C5_1.setBackground(new java.awt.Color(255, 255, 204));
        C5_1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        C5_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        C5_1.setSelectedIndex(21);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Para");

        C4_0.setBackground(new java.awt.Color(255, 255, 204));
        C4_0.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        C4_0.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        C4_0.setSelectedIndex(3);

        C4_1.setBackground(new java.awt.Color(255, 255, 204));
        C4_1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        C4_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        C4_1.setSelectedIndex(22);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Trocas individuais");

        jLayeredPane1.setLayer(C1_0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(C1_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(C2_0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(C2_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(C3_0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(C3_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(C6_0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(C6_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(C5_0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(C5_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(C4_0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(C4_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(C3_0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(C3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                    .addComponent(C2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(C2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                    .addComponent(C1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(C1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(C4_0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(C4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                    .addComponent(C6_0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(C6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                    .addComponent(C5_0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(C5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(25, 25, 25)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(C3_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(C3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(C6_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(C6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C4_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(25, 25, 25)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C5_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addGap(15, 15, 15))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rotor 1");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rotor 3");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rotor 2");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Chave Inicial");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Chave inicial");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Chave inicial");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CBX_CH1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CBX_CH2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CBX_R1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CBX_R2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBX_R3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBX_CH3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBX_R1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBX_R2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBX_R3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBX_CH1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CBX_CH2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CBX_CH3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Configuração", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));

        JEntrada.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        JEntrada.setForeground(new java.awt.Color(102, 102, 102));
        JEntrada.setLineWrap(true);
        JEntrada.setText("Insira aqui sua mensagem ...");
        JEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        JEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JEntradaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JEntrada);

        Confirmar.setBackground(new java.awt.Color(255, 0, 0));
        Confirmar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Confirmar.setForeground(new java.awt.Color(255, 255, 255));
        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        JSaida.setEditable(false);
        JSaida.setColumns(20);
        JSaida.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JSaida.setLineWrap(true);
        JSaida.setRows(5);
        JSaida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(JSaida);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(Confirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cifragem", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        JSaida.setText("");
        JSaida.setLineWrap(true);
    //Criando Variáveis IN
        String U1, U2, U3; //--> Rotores que serão usados
        int aux_R1 = CBX_R1.getSelectedIndex(); aux_R1++;
        int aux_R2 = CBX_R2.getSelectedIndex(); aux_R2++;
        int aux_R3 = CBX_R3.getSelectedIndex(); aux_R3++;
        int aux_CH1 = CBX_CH1.getSelectedIndex();
        int aux_CH2 = CBX_CH2.getSelectedIndex();
        int aux_CH3 = CBX_CH3.getSelectedIndex();
        String mensagem = JEntrada.getText();
    //FIM
    //Criando variáveis para trocas par a par IN
        int [] parapar_vetor = new int[12];
        parapar_vetor [0] = C1_0.getSelectedIndex();
        parapar_vetor [1] = C1_1.getSelectedIndex();
        parapar_vetor [2] = C2_0.getSelectedIndex();
        parapar_vetor [3] = C2_1.getSelectedIndex();
        parapar_vetor [4] = C3_0.getSelectedIndex();
        parapar_vetor [5] = C3_1.getSelectedIndex();
        parapar_vetor [6] = C4_0.getSelectedIndex();
        parapar_vetor [7] = C4_1.getSelectedIndex();
        parapar_vetor [8] = C5_0.getSelectedIndex();
        parapar_vetor [9] = C5_1.getSelectedIndex();
        parapar_vetor [10] = C6_0.getSelectedIndex();
        parapar_vetor [11] = C6_1.getSelectedIndex();
    //FIM
    //Instanciando o objeto rotores IN
        Classe_Rotores Rotores = new Classe_Rotores();
        String U0 = Rotores.define_rotor_usado(0); // U0 = R0 --> Padrão 
        char[][] Ref_b = Rotores.define_refletor();
    //FIM
    //Instanciando o objeto Prepara IN
        Prepara_Rotores Prepara = new Prepara_Rotores();
    //FIM
    //Instanciando o objeto Prepara_mensagem IN
        Prepara_Mensagem Pre_Men = new Prepara_Mensagem();
    //FIM
//Input imaginário dos rotores a serem usados IN          
        U1 = Rotores.define_rotor_usado(aux_R1); // U1 = R1
        U2 = Rotores.define_rotor_usado(aux_R2); // U2 = R2
        U3 = Rotores.define_rotor_usado(aux_R3); // U3 = R3
//FIM
//Input imaginário das chaves a serem utilizadas IN
        U1 = Prepara.Prepararotor(U1, aux_CH1);
        U2 = Prepara.Prepararotor(U2, aux_CH2);
        U3 = Prepara.Prepararotor(U3, aux_CH3);
//FIM
//Preparar String IN
        mensagem = mensagem.replace("\n", "");
        mensagem = mensagem.replace("\t", "");
        mensagem = mensagem.replace("\r", "");
        mensagem = Pre_Men.Preparamensagem(mensagem);
//FIM
//Critica de dados IN
        boolean validade = true;
    //Caso haja um caracter invalido na mensagem
        if(mensagem == null) {
            validade = false;
            JOptionPane.showMessageDialog(rootPane, "Há caracteres inválidos na mensagem", "Mensagem inválida", JOptionPane.ERROR_MESSAGE);
        }
    //Caso haja o uso dos mesmos rotores
        if(aux_R1 == aux_R2 || aux_R2 == aux_R3 || aux_R1 == aux_R3){
            validade = false;
            JOptionPane.showMessageDialog(rootPane, "Há 1 ou mais rotores iguais", "Rotores inválidos", JOptionPane.ERROR_MESSAGE);
        }
    //Caso haja letras repetidas na trocas parapar
        boolean aux_validade = true;
        for(int i=0; i<12; i++){
            for(int j=0; j<12; j++){
                if(i==j) continue;
                else{
                   if(parapar_vetor[i] == parapar_vetor[j]){
                       aux_validade = false;
                       //JOptionPane.showMessageDialog(rootPane, "Há uma letra igual a outra", "Troca par a par inválida", JOptionPane.ERROR_MESSAGE);
                       break;
                   }
                }
            }
        }
        if(!aux_validade){
            validade = false;
            JOptionPane.showMessageDialog(rootPane, "Há letras iguais", "Troca par a par inválida", JOptionPane.ERROR_MESSAGE);
        }
//FIM
        if(validade){
//Troca par a par IN
            char[] aux_parapar = Rotores.define_rotor_usado(0).toCharArray();
            char[] aux_mensagem_1 = mensagem.toCharArray();
            String mensagem_1 = "";
            boolean b = true;
            for(int i=0; i<aux_mensagem_1.length; i++){
                for(int j=0; j<12; j+=2){
                    if(aux_parapar[parapar_vetor[j]] == aux_mensagem_1[i]){
                        mensagem_1 += aux_parapar[parapar_vetor[(j+1)]];
                        b = false;
                    }else if(aux_parapar[parapar_vetor[(j+1)]] == aux_mensagem_1[i]){
                        mensagem_1 += aux_parapar[parapar_vetor[j]];
                        b = false;
                    }
                }
                if(b) mensagem_1 += aux_mensagem_1[i];
                b = true;
            }
            b = true;
//FIM
            Inicia_Funcionamento Funcionamento_1 = new Inicia_Funcionamento(Ref_b, U0, U1, U2, U3, mensagem_1, aux_R2, aux_R3);
            String mensagem_final = Funcionamento_1.funcionamento();
 //Troca par a par IN
            char[] aux_mensagem_2 = mensagem_final.toCharArray();
            String mensagem_2 = "";
            for(int i=0; i<aux_mensagem_2.length; i++){
                for(int j=0; j<12; j+=2){
                    if(aux_parapar[parapar_vetor[j]] == aux_mensagem_2[i]){
                        mensagem_2 += aux_parapar[parapar_vetor[(j+1)]];
                        b = false;
                    }else if(aux_parapar[parapar_vetor[(j+1)]] == aux_mensagem_2[i]){
                        mensagem_2 += aux_parapar[parapar_vetor[j]];
                        b = false;
                    }
                }
                if(b) mensagem_2 += aux_mensagem_2[i];
                b = true;
            }
 //FIM
            JSaida.insert(mensagem_2, 0);
        }
        else{
            JSaida.insert("", 0);
        }
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void JEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JEntradaMouseClicked
        // TODO add your handling code here:
        JEntrada.setText("");
        JEntrada.setFont(new java.awt.Font("Arial", 1, 24));
        JEntrada.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_JEntradaMouseClicked

    private void Aviso(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Aviso
        // TODO add your handling code here:
        String Inst = "Bem-vindo ao simulador da máquina Enigma 1\n";
        Inst += "\nConfigure o rotor e suas respectivas chaves, com algumas restrições: \n";
        Inst += "\n- Os rotores não podem ser iguais;";
        Inst += "\n- Cada letra só poderá ser escolhida uma vez em trocas individuais.";
        
        JOptionPane.showMessageDialog(rootPane, Inst, "Bem-vindo!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Aviso

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> C1_0;
    private javax.swing.JComboBox<String> C1_1;
    private javax.swing.JComboBox<String> C2_0;
    private javax.swing.JComboBox<String> C2_1;
    private javax.swing.JComboBox<String> C3_0;
    private javax.swing.JComboBox<String> C3_1;
    private javax.swing.JComboBox<String> C4_0;
    private javax.swing.JComboBox<String> C4_1;
    private javax.swing.JComboBox<String> C5_0;
    private javax.swing.JComboBox<String> C5_1;
    private javax.swing.JComboBox<String> C6_0;
    private javax.swing.JComboBox<String> C6_1;
    private javax.swing.JComboBox<String> CBX_CH1;
    private javax.swing.JComboBox<String> CBX_CH2;
    private javax.swing.JComboBox<String> CBX_CH3;
    private javax.swing.JComboBox<String> CBX_R1;
    private javax.swing.JComboBox<String> CBX_R2;
    private javax.swing.JComboBox<String> CBX_R3;
    private javax.swing.JButton Confirmar;
    private javax.swing.JTextArea JEntrada;
    private javax.swing.JTextArea JSaida;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
/*
//Troca par a par IN
            char[] aux_parapar = Rotores.define_rotor_usado(0).toCharArray();
            char[] aux_mensagem_1 = mensagem.toCharArray();
            String mensagem_1 = "";
            boolean b = true;
            for(int i=0; i<aux_mensagem_1.length; i++){
                for(int j=0; j<12; j+=2){
                    if(aux_parapar[parapar_vetor[j]] == aux_mensagem_1[i]){
                        mensagem_1 += aux_parapar[parapar_vetor[(j+1)]];
                        b = false;
                    }else if(aux_parapar[parapar_vetor[(j+1)]] == aux_mensagem_final[i]){
                        mensagem_final_final += aux_parapar[parapar_vetor[j]];
                        b = false;
                    }
                }
                if(b) mensagem_1 += aux_mensagem_1[i];
                b = true;
            }
            b = true;
    //FIM
//Troca par a par IN
            char[] aux_mensagem_final = mensagem_final.toCharArray();
            String mensagem_final_final = "";
            for(int i=0; i<aux_mensagem_final.length; i++){
                for(int j=0; j<12; j+=2){
                    if(aux_parapar[parapar_vetor[(j+1)]] == aux_mensagem_final[i]){
                        mensagem_final_final += aux_parapar[parapar_vetor[j]];
                        b = false;
                    }
                }
                if(b) mensagem_final_final += aux_mensagem_final[i];
                b = true;
            }
    //FIM
*/