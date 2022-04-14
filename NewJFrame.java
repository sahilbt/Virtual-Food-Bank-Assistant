
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author patel
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        outerPanel = new javax.swing.JPanel();
        tableScrollPanel = new javax.swing.JScrollPane();
        hamperOrderTable = new javax.swing.JTable();
        hamperOrderForm = new javax.swing.JPanel();
        titleOne = new javax.swing.JLabel();
        titleTwo = new javax.swing.JLabel();
        subheading = new javax.swing.JLabel();
        maleText = new javax.swing.JLabel();
        femaleInput = new javax.swing.JTextField();
        femaleText = new javax.swing.JLabel();
        maleInput = new javax.swing.JTextField();
        childrenOver8Text = new javax.swing.JLabel();
        childrenOver8Input = new javax.swing.JTextField();
        childrenUnder8Text = new javax.swing.JLabel();
        childrenUnder8Input = new javax.swing.JTextField();
        addHamperButton = new javax.swing.JButton();
        clearInputButton = new javax.swing.JButton();
        deleteHamperButton = new javax.swing.JButton();
        clearHampersButton = new javax.swing.JButton();
        submitOrderButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        outerPanel.setBackground(new java.awt.Color(255, 255, 255));

        tableScrollPanel.setBackground(new java.awt.Color(254, 253, 233));
        tableScrollPanel.setForeground(new java.awt.Color(254, 253, 233));

        hamperOrderTable.setBackground(new java.awt.Color(254, 253, 233));
        hamperOrderTable.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        hamperOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adult Males", "Adult Females", "Children Over 8", "Children Under 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        hamperOrderTable.setRowHeight(29);
        hamperOrderTable.getTableHeader().setReorderingAllowed(false);
        tableScrollPanel.setViewportView(hamperOrderTable);
        if (hamperOrderTable.getColumnModel().getColumnCount() > 0) {
            hamperOrderTable.getColumnModel().getColumn(0).setResizable(false);
            hamperOrderTable.getColumnModel().getColumn(1).setResizable(false);
            hamperOrderTable.getColumnModel().getColumn(2).setResizable(false);
            hamperOrderTable.getColumnModel().getColumn(3).setResizable(false);
        }

        hamperOrderForm.setBackground(new java.awt.Color(250, 252, 182));

        titleOne.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        titleOne.setForeground(new java.awt.Color(190, 164, 98));
        titleOne.setText("HAMPER ORDER ");

        titleTwo.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        titleTwo.setForeground(new java.awt.Color(190, 164, 98));
        titleTwo.setText("FORM");

        subheading.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        subheading.setForeground(new java.awt.Color(123, 106, 62));
        subheading.setText("ENTER HAMPER INFORMATION");

        maleText.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        maleText.setForeground(new java.awt.Color(119, 120, 103));
        maleText.setText("NUMBER OF MALE ADULTS");

        femaleInput.setBackground(new java.awt.Color(230, 211, 163));
        femaleInput.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        femaleInput.setForeground(new java.awt.Color(123, 106, 62));
        femaleInput.setToolTipText("");
        femaleInput.setPreferredSize(new java.awt.Dimension(70, 29));
        femaleInput.setSelectionColor(new java.awt.Color(0, 0, 0));
        femaleInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleInputActionPerformed(evt);
            }
        });

        femaleText.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        femaleText.setForeground(new java.awt.Color(119, 120, 103));
        femaleText.setText("NUMBER OF FEMALE ADULTS");

        maleInput.setBackground(new java.awt.Color(230, 211, 163));
        maleInput.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        maleInput.setForeground(new java.awt.Color(123, 106, 62));
        maleInput.setToolTipText("");
        maleInput.setPreferredSize(new java.awt.Dimension(70, 29));
        maleInput.setSelectionColor(new java.awt.Color(0, 0, 0));
        maleInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleInputActionPerformed(evt);
            }
        });

        childrenOver8Text.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        childrenOver8Text.setForeground(new java.awt.Color(119, 120, 103));
        childrenOver8Text.setText("NUMBER OF CHILDREN OVER 8");

        childrenOver8Input.setBackground(new java.awt.Color(230, 211, 163));
        childrenOver8Input.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        childrenOver8Input.setForeground(new java.awt.Color(123, 106, 62));
        childrenOver8Input.setPreferredSize(new java.awt.Dimension(70, 29));
        childrenOver8Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childrenOver8InputActionPerformed(evt);
            }
        });

        childrenUnder8Text.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        childrenUnder8Text.setForeground(new java.awt.Color(119, 120, 103));
        childrenUnder8Text.setText("NUMBER OF CHILDREN UNDER 8");

        childrenUnder8Input.setBackground(new java.awt.Color(230, 211, 163));
        childrenUnder8Input.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        childrenUnder8Input.setForeground(new java.awt.Color(123, 106, 62));
        childrenUnder8Input.setPreferredSize(new java.awt.Dimension(70, 29));
        childrenUnder8Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childrenUnder8InputActionPerformed(evt);
            }
        });

        addHamperButton.setBackground(new java.awt.Color(123, 106, 62));
        addHamperButton.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        addHamperButton.setForeground(new java.awt.Color(255, 255, 255));
        addHamperButton.setText("ADD HAMPER CONFIGURATION");
        addHamperButton.setPreferredSize(new java.awt.Dimension(194, 29));
        addHamperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHamperButtonActionPerformed(evt);
            }
        });

        clearInputButton.setBackground(new java.awt.Color(255, 102, 102));
        clearInputButton.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        clearInputButton.setForeground(new java.awt.Color(255, 255, 255));
        clearInputButton.setText("CLEAR INPUTS");
        clearInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearInputButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hamperOrderFormLayout = new javax.swing.GroupLayout(hamperOrderForm);
        hamperOrderForm.setLayout(hamperOrderFormLayout);
        hamperOrderFormLayout.setHorizontalGroup(
            hamperOrderFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hamperOrderFormLayout.createSequentialGroup()
                .addGroup(hamperOrderFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hamperOrderFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hamperOrderFormLayout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(hamperOrderFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(titleOne)
                                .addComponent(subheading)))
                        .addGroup(hamperOrderFormLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(hamperOrderFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(childrenOver8Text)
                                .addComponent(childrenUnder8Text)
                                .addComponent(femaleText)
                                .addComponent(maleText))
                            .addGap(18, 18, 18)
                            .addGroup(hamperOrderFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(maleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(femaleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(childrenUnder8Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(childrenOver8Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(hamperOrderFormLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(titleTwo))
                    .addGroup(hamperOrderFormLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(addHamperButton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hamperOrderFormLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(clearInputButton)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        hamperOrderFormLayout.setVerticalGroup(
            hamperOrderFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hamperOrderFormLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titleOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleTwo)
                .addGap(46, 46, 46)
                .addComponent(subheading)
                .addGap(39, 39, 39)
                .addGroup(hamperOrderFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maleText)
                    .addComponent(maleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(hamperOrderFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(femaleText)
                    .addComponent(femaleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(hamperOrderFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childrenOver8Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(childrenOver8Text))
                .addGap(18, 18, 18)
                .addGroup(hamperOrderFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childrenUnder8Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(childrenUnder8Text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearInputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addHamperButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        deleteHamperButton.setBackground(new java.awt.Color(255, 102, 102));
        deleteHamperButton.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        deleteHamperButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteHamperButton.setText("DELETE HAMPER(S)");
        deleteHamperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteHamperButtonActionPerformed(evt);
            }
        });

        clearHampersButton.setBackground(new java.awt.Color(255, 102, 102));
        clearHampersButton.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        clearHampersButton.setForeground(new java.awt.Color(255, 255, 255));
        clearHampersButton.setText("CLEAR ALL HAMPERS");
        clearHampersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearHampersButtonActionPerformed(evt);
            }
        });

        submitOrderButton.setBackground(new java.awt.Color(115, 203, 107));
        submitOrderButton.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        submitOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        submitOrderButton.setText("SUBMIT ORDER");
        submitOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout outerPanelLayout = new javax.swing.GroupLayout(outerPanel);
        outerPanel.setLayout(outerPanelLayout);
        outerPanelLayout.setHorizontalGroup(
            outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerPanelLayout.createSequentialGroup()
                .addComponent(hamperOrderForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outerPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(tableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(outerPanelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clearHampersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteHamperButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(submitOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        outerPanelLayout.setVerticalGroup(
            outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hamperOrderForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(outerPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(tableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(outerPanelLayout.createSequentialGroup()
                        .addComponent(deleteHamperButton)
                        .addGap(18, 18, 18)
                        .addComponent(clearHampersButton))
                    .addComponent(submitOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(outerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void femaleInputActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void maleInputActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void childrenOver8InputActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void childrenUnder8InputActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void clearHampersButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        DefaultTableModel table = (DefaultTableModel)hamperOrderTable.getModel();
        if(table.getRowCount() == 0){
              JOptionPane.showMessageDialog(this, "There are no hampers to be cleared", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        table.setRowCount(0);
    }                                                  

    private void submitOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void addHamperButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        String males = maleInput.getText();
        String females = femaleInput.getText();
        String childrenOv8 = childrenOver8Input.getText();
        String childrenUn8 = childrenUnder8Input.getText();
        
        int malesInt;
        int femalesInt;
        int childrenOv8Int;        
        int childrenUn8Int;
        
        try{
            if(males.isEmpty() || females.isEmpty() || childrenOv8.isEmpty() || childrenUn8.isEmpty()){
                throw new IllegalArgumentException();
            }
        }
        catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, "Please make sure all fields are filled!","Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            malesInt = Integer.parseInt(males);
            femalesInt = Integer.parseInt(females);
            childrenOv8Int = Integer.parseInt(childrenOv8);
            childrenUn8Int = Integer.parseInt(childrenUn8);
            
            if(malesInt < 0 || femalesInt < 0 || childrenOv8Int < 0 || childrenUn8Int < 0){
                throw new IllegalArgumentException();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please make sure all fields contain only a POSITIVE numerical value!","Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        DefaultTableModel table = (DefaultTableModel)hamperOrderTable.getModel();
        table.addRow(new Object[]{malesInt, femalesInt, childrenOv8Int, childrenUn8Int});
        
        maleInput.setText("");
        femaleInput.setText("");
        childrenOver8Input.setText("");
        childrenUnder8Input.setText("");
        
    }                                               

    private void deleteHamperButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        int row = hamperOrderTable.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel)hamperOrderTable.getModel();
        
        if(row < 0){
            JOptionPane.showMessageDialog(this, "No hampers are selected. Please select AT LEAST ONE hamper to delete it!","Error!", JOptionPane.ERROR_MESSAGE);
        }
            
        else{
            while(row != -1){
                table.removeRow(row);
                row = hamperOrderTable.getSelectedRow();
            }
        }
        
        
    }                                                  

    private void clearInputButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        maleInput.setText("");
        femaleInput.setText("");
        childrenOver8Input.setText("");
        childrenUnder8Input.setText("");
    }                                                

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

    // Variables declaration - do not modify                     
    private javax.swing.JButton addHamperButton;
    private javax.swing.JTextField childrenOver8Input;
    private javax.swing.JLabel childrenOver8Text;
    private javax.swing.JTextField childrenUnder8Input;
    private javax.swing.JLabel childrenUnder8Text;
    private javax.swing.JButton clearHampersButton;
    private javax.swing.JButton clearInputButton;
    private javax.swing.JButton deleteHamperButton;
    private javax.swing.JTextField femaleInput;
    private javax.swing.JLabel femaleText;
    private javax.swing.JPanel hamperOrderForm;
    private javax.swing.JTable hamperOrderTable;
    private javax.swing.JTextField maleInput;
    private javax.swing.JLabel maleText;
    private javax.swing.JPanel outerPanel;
    private javax.swing.JLabel subheading;
    private javax.swing.JButton submitOrderButton;
    private javax.swing.JScrollPane tableScrollPanel;
    private javax.swing.JLabel titleOne;
    private javax.swing.JLabel titleTwo;
    // End of variables declaration                   
}
