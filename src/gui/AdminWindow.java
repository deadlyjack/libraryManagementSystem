package gui;

/**
 *
 * @author delle
 */
public class AdminWindow extends javax.swing.JFrame {

    public AdminWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanel = new javax.swing.JPanel();
        adminPanelSidebar = new javax.swing.JPanel();
        adminPanelSidebarHeader = new javax.swing.JPanel();
        settingsPanelSidebarHeaderText = new javax.swing.JLabel();
        mlibrarian = new javax.swing.JButton();
        alibrarian = new javax.swing.JButton();
        aminPanelConatainer = new javax.swing.JLayeredPane();
        alibrarianPanel = new javax.swing.JPanel();
        alibrrianPanelHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        mlibrarianPanel = new javax.swing.JPanel();
        mlibrarianPanelHeader = new javax.swing.JLabel();
        mlibrarianPanelSearchBox = new javax.swing.JTextField();
        mlibrarianPanelSearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        librarianSearchResult = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");

        adminPanelSidebar.setBackground(new java.awt.Color(255, 255, 255));

        adminPanelSidebarHeader.setBackground(new java.awt.Color(153, 255, 255));

        settingsPanelSidebarHeaderText.setFont(new java.awt.Font("Source Sans Pro Light", 0, 18)); // NOI18N
        settingsPanelSidebarHeaderText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsPanelSidebarHeaderText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/user.png"))); // NOI18N
        settingsPanelSidebarHeaderText.setText("Admin Panel");

        javax.swing.GroupLayout adminPanelSidebarHeaderLayout = new javax.swing.GroupLayout(adminPanelSidebarHeader);
        adminPanelSidebarHeader.setLayout(adminPanelSidebarHeaderLayout);
        adminPanelSidebarHeaderLayout.setHorizontalGroup(
            adminPanelSidebarHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsPanelSidebarHeaderText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        adminPanelSidebarHeaderLayout.setVerticalGroup(
            adminPanelSidebarHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsPanelSidebarHeaderText, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );

        mlibrarian.setBackground(new java.awt.Color(255, 255, 255));
        mlibrarian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mlibrarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/deleteUser.png"))); // NOI18N
        mlibrarian.setText("Manage librarian");
        mlibrarian.setBorderPainted(false);
        mlibrarian.setFocusPainted(false);
        mlibrarian.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mlibrarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mlibrarianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlibrarianMouseExited(evt);
            }
        });
        mlibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlibrarianActionPerformed(evt);
            }
        });

        alibrarian.setBackground(new java.awt.Color(255, 255, 255));
        alibrarian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alibrarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/addUser.png"))); // NOI18N
        alibrarian.setText("Add librarian");
        alibrarian.setBorderPainted(false);
        alibrarian.setFocusPainted(false);
        alibrarian.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        alibrarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alibrarianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alibrarianMouseExited(evt);
            }
        });
        alibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alibrarianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminPanelSidebarLayout = new javax.swing.GroupLayout(adminPanelSidebar);
        adminPanelSidebar.setLayout(adminPanelSidebarLayout);
        adminPanelSidebarLayout.setHorizontalGroup(
            adminPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanelSidebarHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mlibrarian, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(alibrarian, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        adminPanelSidebarLayout.setVerticalGroup(
            adminPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(adminPanelSidebarHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mlibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 495, Short.MAX_VALUE))
        );

        alibrarianPanel.setMaximumSize(new java.awt.Dimension(600, 25));
        alibrarianPanel.setMinimumSize(new java.awt.Dimension(300, 25));

        alibrrianPanelHeader.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        alibrrianPanelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alibrrianPanelHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/addUser.png"))); // NOI18N
        alibrrianPanelHeader.setText("Add a new librarian");

        jLabel1.setText("Staff ID");
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 25));

        jTextField1.setMaximumSize(new java.awt.Dimension(600, 25));
        jTextField1.setMinimumSize(new java.awt.Dimension(300, 25));

        jTextField2.setMaximumSize(new java.awt.Dimension(600, 25));
        jTextField2.setMinimumSize(new java.awt.Dimension(300, 25));

        jLabel2.setText("Name");
        jLabel2.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(150, 25));

        jTextField3.setMaximumSize(new java.awt.Dimension(600, 25));
        jTextField3.setMinimumSize(new java.awt.Dimension(300, 25));

        jLabel3.setText("Username");
        jLabel3.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(150, 25));

        jTextField4.setMaximumSize(new java.awt.Dimension(600, 25));
        jTextField4.setMinimumSize(new java.awt.Dimension(300, 25));

        jLabel4.setText("Password");
        jLabel4.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(150, 25));

        jButton1.setBackground(new java.awt.Color(240, 240, 239));
        jButton1.setText("add");
        jButton1.setFocusPainted(false);

        jButton2.setBackground(new java.awt.Color(240, 240, 239));
        jButton2.setText("reset");
        jButton2.setFocusPainted(false);

        javax.swing.GroupLayout alibrarianPanelLayout = new javax.swing.GroupLayout(alibrarianPanel);
        alibrarianPanel.setLayout(alibrarianPanelLayout);
        alibrarianPanelLayout.setHorizontalGroup(
            alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alibrrianPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alibrarianPanelLayout.createSequentialGroup()
                .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(alibrarianPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(alibrarianPanelLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(232, 232, 232))
        );
        alibrarianPanelLayout.setVerticalGroup(
            alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alibrarianPanelLayout.createSequentialGroup()
                .addComponent(alibrrianPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 351, Short.MAX_VALUE))
        );

        mlibrarianPanelHeader.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        mlibrarianPanelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlibrarianPanelHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/user.png"))); // NOI18N
        mlibrarianPanelHeader.setText("Search For Librarian");

        mlibrarianPanelSearchBox.setToolTipText("Enter librarian ID");

        mlibrarianPanelSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/search.png"))); // NOI18N
        mlibrarianPanelSearchButton.setBorder(null);
        mlibrarianPanelSearchButton.setBorderPainted(false);
        mlibrarianPanelSearchButton.setContentAreaFilled(false);
        mlibrarianPanelSearchButton.setFocusPainted(false);

        librarianSearchResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Delete", "Edit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(librarianSearchResult);

        javax.swing.GroupLayout mlibrarianPanelLayout = new javax.swing.GroupLayout(mlibrarianPanel);
        mlibrarianPanel.setLayout(mlibrarianPanelLayout);
        mlibrarianPanelLayout.setHorizontalGroup(
            mlibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mlibrarianPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(mlibrarianPanelLayout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(mlibrarianPanelSearchBox, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mlibrarianPanelSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
            .addComponent(mlibrarianPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mlibrarianPanelLayout.setVerticalGroup(
            mlibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mlibrarianPanelLayout.createSequentialGroup()
                .addComponent(mlibrarianPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mlibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mlibrarianPanelSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mlibrarianPanelSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        aminPanelConatainer.setLayer(alibrarianPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        aminPanelConatainer.setLayer(mlibrarianPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout aminPanelConatainerLayout = new javax.swing.GroupLayout(aminPanelConatainer);
        aminPanelConatainer.setLayout(aminPanelConatainerLayout);
        aminPanelConatainerLayout.setHorizontalGroup(
            aminPanelConatainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlibrarianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(aminPanelConatainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(alibrarianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aminPanelConatainerLayout.setVerticalGroup(
            aminPanelConatainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlibrarianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(aminPanelConatainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(alibrarianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addComponent(adminPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(aminPanelConatainer))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(aminPanelConatainer)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1191, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1207, 721);
    }// </editor-fold>//GEN-END:initComponents

    private void mlibrarianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlibrarianMouseEntered
        mlibrarian.setBackground(java.awt.Color.cyan);
    }//GEN-LAST:event_mlibrarianMouseEntered

    private void mlibrarianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlibrarianMouseExited
        mlibrarian.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_mlibrarianMouseExited

    private void alibrarianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alibrarianMouseEntered
        alibrarian.setBackground(java.awt.Color.cyan);
    }//GEN-LAST:event_alibrarianMouseEntered

    private void alibrarianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alibrarianMouseExited
        alibrarian.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_alibrarianMouseExited

    private void mlibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlibrarianActionPerformed
        this.mlibrarianPanel.setVisible(true);
        this.alibrarianPanel.setVisible(false);
    }//GEN-LAST:event_mlibrarianActionPerformed

    private void alibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alibrarianActionPerformed
        this.alibrarianPanel.setVisible(true);
        this.mlibrarianPanel.setVisible(false);
    }//GEN-LAST:event_alibrarianActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel adminPanel;
    private javax.swing.JPanel adminPanelSidebar;
    private javax.swing.JPanel adminPanelSidebarHeader;
    private javax.swing.JButton alibrarian;
    public javax.swing.JPanel alibrarianPanel;
    private javax.swing.JLabel alibrrianPanelHeader;
    public javax.swing.JLayeredPane aminPanelConatainer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable librarianSearchResult;
    private javax.swing.JButton mlibrarian;
    public javax.swing.JPanel mlibrarianPanel;
    private javax.swing.JLabel mlibrarianPanelHeader;
    private javax.swing.JTextField mlibrarianPanelSearchBox;
    private javax.swing.JButton mlibrarianPanelSearchButton;
    private javax.swing.JLabel settingsPanelSidebarHeaderText;
    // End of variables declaration//GEN-END:variables
}
