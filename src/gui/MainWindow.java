/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.scene.paint.Color;

/**
 *
 * @author delle
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainContainer = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        memberButton = new javax.swing.JButton();
        booksButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        layerContainer = new javax.swing.JLayeredPane();
        settingsPanel = new javax.swing.JPanel();
        settingsPanelSidebar = new javax.swing.JPanel();
        settingsPanelSidebarHeader = new javax.swing.JPanel();
        settingsPanelSidebarHeaderText = new javax.swing.JLabel();
        booksPanel = new javax.swing.JPanel();
        booksPanelSidebar = new javax.swing.JPanel();
        booksPanelSidebarHeader = new javax.swing.JPanel();
        booksPanelSidebarHeaderText = new javax.swing.JLabel();
        memberPanel = new javax.swing.JPanel();
        memberPanelSidebar = new javax.swing.JPanel();
        memberPanelSidebarHeader = new javax.swing.JPanel();
        memberPanelSidebarHeaderText = new javax.swing.JLabel();
        mmember = new javax.swing.JButton();
        amember = new javax.swing.JButton();
        nmember = new javax.swing.JButton();
        memberPanelContainer = new javax.swing.JLayeredPane();
        mmemberPanel = new javax.swing.JPanel();
        mmemberPanelSearchText = new javax.swing.JLabel();
        mmemberPanelSearchBox = new javax.swing.JTextField();
        mmemberPanelSearchButton = new javax.swing.JButton();
        amemberPanel = new javax.swing.JPanel();
        amemberPanelTitle = new javax.swing.JLabel();
        amemberNameLabel = new javax.swing.JLabel();
        amemberName = new javax.swing.JTextField();
        amemberIDNumber = new javax.swing.JTextField();
        amemberIDNumberLable = new javax.swing.JLabel();
        amemberPhoneNumber = new javax.swing.JTextField();
        amemberPhoneNumberLabel = new javax.swing.JLabel();
        amemberEmailLabel = new javax.swing.JLabel();
        amemberEmail = new javax.swing.JTextField();
        amemberTempAddressLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        amemberTempAddress = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        amemberPmtAddress = new javax.swing.JTextArea();
        amemberPmtAddressLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lirary Managment System");
        setName("MainWindow"); // NOI18N

        MainContainer.setBackground(new java.awt.Color(102, 102, 102));

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));

        memberButton.setBackground(new java.awt.Color(255, 255, 255));
        memberButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/users.png"))); // NOI18N
        memberButton.setToolTipText("View Members and Manage Members");
        memberButton.setBorder(null);
        memberButton.setFocusPainted(false);
        memberButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        memberButton.setIconTextGap(10);
        memberButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                memberButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                memberButtonMouseExited(evt);
            }
        });
        memberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberButtonActionPerformed(evt);
            }
        });

        booksButton.setBackground(new java.awt.Color(255, 255, 255));
        booksButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/books.png"))); // NOI18N
        booksButton.setToolTipText("View Books and Manage Books");
        booksButton.setBorder(null);
        booksButton.setFocusPainted(false);
        booksButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        booksButton.setIconTextGap(10);
        booksButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                booksButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                booksButtonMouseExited(evt);
            }
        });
        booksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksButtonActionPerformed(evt);
            }
        });

        settingsButton.setBackground(new java.awt.Color(255, 255, 255));
        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/settings.png"))); // NOI18N
        settingsButton.setToolTipText("Settings");
        settingsButton.setBorder(null);
        settingsButton.setFocusPainted(false);
        settingsButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        settingsButton.setIconTextGap(10);
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButtonMouseExited(evt);
            }
        });
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(memberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(booksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(memberButton, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(settingsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(booksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        layerContainer.setBackground(new java.awt.Color(153, 153, 153));

        settingsPanelSidebar.setBackground(new java.awt.Color(255, 255, 255));

        settingsPanelSidebarHeader.setBackground(new java.awt.Color(153, 255, 255));

        settingsPanelSidebarHeaderText.setFont(new java.awt.Font("Source Sans Pro Light", 0, 18)); // NOI18N
        settingsPanelSidebarHeaderText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsPanelSidebarHeaderText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/settings.png"))); // NOI18N
        settingsPanelSidebarHeaderText.setText("Settings");

        javax.swing.GroupLayout settingsPanelSidebarHeaderLayout = new javax.swing.GroupLayout(settingsPanelSidebarHeader);
        settingsPanelSidebarHeader.setLayout(settingsPanelSidebarHeaderLayout);
        settingsPanelSidebarHeaderLayout.setHorizontalGroup(
            settingsPanelSidebarHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsPanelSidebarHeaderText, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        settingsPanelSidebarHeaderLayout.setVerticalGroup(
            settingsPanelSidebarHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsPanelSidebarHeaderText, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout settingsPanelSidebarLayout = new javax.swing.GroupLayout(settingsPanelSidebar);
        settingsPanelSidebar.setLayout(settingsPanelSidebarLayout);
        settingsPanelSidebarLayout.setHorizontalGroup(
            settingsPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsPanelSidebarHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        settingsPanelSidebarLayout.setVerticalGroup(
            settingsPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(settingsPanelSidebarHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 536, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addComponent(settingsPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 844, Short.MAX_VALUE))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsPanelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        booksPanelSidebar.setBackground(new java.awt.Color(255, 255, 255));

        booksPanelSidebarHeader.setBackground(new java.awt.Color(153, 255, 255));

        booksPanelSidebarHeaderText.setFont(new java.awt.Font("Source Sans Pro Light", 0, 18)); // NOI18N
        booksPanelSidebarHeaderText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        booksPanelSidebarHeaderText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/books.png"))); // NOI18N
        booksPanelSidebarHeaderText.setText("Books");

        javax.swing.GroupLayout booksPanelSidebarHeaderLayout = new javax.swing.GroupLayout(booksPanelSidebarHeader);
        booksPanelSidebarHeader.setLayout(booksPanelSidebarHeaderLayout);
        booksPanelSidebarHeaderLayout.setHorizontalGroup(
            booksPanelSidebarHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(booksPanelSidebarHeaderText, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        booksPanelSidebarHeaderLayout.setVerticalGroup(
            booksPanelSidebarHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(booksPanelSidebarHeaderText, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout booksPanelSidebarLayout = new javax.swing.GroupLayout(booksPanelSidebar);
        booksPanelSidebar.setLayout(booksPanelSidebarLayout);
        booksPanelSidebarLayout.setHorizontalGroup(
            booksPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(booksPanelSidebarHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        booksPanelSidebarLayout.setVerticalGroup(
            booksPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(booksPanelSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(booksPanelSidebarHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 530, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout booksPanelLayout = new javax.swing.GroupLayout(booksPanel);
        booksPanel.setLayout(booksPanelLayout);
        booksPanelLayout.setHorizontalGroup(
            booksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(booksPanelLayout.createSequentialGroup()
                .addComponent(booksPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 805, Short.MAX_VALUE))
        );
        booksPanelLayout.setVerticalGroup(
            booksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(booksPanelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        memberPanelSidebar.setBackground(new java.awt.Color(255, 255, 255));

        memberPanelSidebarHeader.setBackground(new java.awt.Color(153, 255, 255));

        memberPanelSidebarHeaderText.setFont(new java.awt.Font("Source Sans Pro Light", 0, 18)); // NOI18N
        memberPanelSidebarHeaderText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberPanelSidebarHeaderText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/users.png"))); // NOI18N
        memberPanelSidebarHeaderText.setText("Members");

        javax.swing.GroupLayout memberPanelSidebarHeaderLayout = new javax.swing.GroupLayout(memberPanelSidebarHeader);
        memberPanelSidebarHeader.setLayout(memberPanelSidebarHeaderLayout);
        memberPanelSidebarHeaderLayout.setHorizontalGroup(
            memberPanelSidebarHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(memberPanelSidebarHeaderText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        memberPanelSidebarHeaderLayout.setVerticalGroup(
            memberPanelSidebarHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(memberPanelSidebarHeaderText, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );

        mmember.setBackground(new java.awt.Color(255, 255, 255));
        mmember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mmember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/deleteUser.png"))); // NOI18N
        mmember.setText("Manage members");
        mmember.setBorderPainted(false);
        mmember.setFocusPainted(false);
        mmember.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mmember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mmemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mmemberMouseExited(evt);
            }
        });
        mmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmemberActionPerformed(evt);
            }
        });

        amember.setBackground(new java.awt.Color(255, 255, 255));
        amember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/addUser.png"))); // NOI18N
        amember.setText("Add a new member");
        amember.setBorderPainted(false);
        amember.setFocusPainted(false);
        amember.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        amember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                amemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                amemberMouseExited(evt);
            }
        });
        amember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amemberActionPerformed(evt);
            }
        });

        nmember.setBackground(new java.awt.Color(255, 255, 255));
        nmember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nmember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/send.png"))); // NOI18N
        nmember.setText("Notity member for due book");
        nmember.setBorderPainted(false);
        nmember.setFocusPainted(false);
        nmember.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nmember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nmemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nmemberMouseExited(evt);
            }
        });

        javax.swing.GroupLayout memberPanelSidebarLayout = new javax.swing.GroupLayout(memberPanelSidebar);
        memberPanelSidebar.setLayout(memberPanelSidebarLayout);
        memberPanelSidebarLayout.setHorizontalGroup(
            memberPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(memberPanelSidebarHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mmember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(amember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nmember, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        memberPanelSidebarLayout.setVerticalGroup(
            memberPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberPanelSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(memberPanelSidebarHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mmember, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amember, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nmember, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 400, Short.MAX_VALUE))
        );

        mmemberPanelSearchText.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        mmemberPanelSearchText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mmemberPanelSearchText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/user.png"))); // NOI18N
        mmemberPanelSearchText.setText("Search for member");

        mmemberPanelSearchBox.setToolTipText("Enter member ID");

        mmemberPanelSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/search.png"))); // NOI18N
        mmemberPanelSearchButton.setBorder(null);
        mmemberPanelSearchButton.setBorderPainted(false);
        mmemberPanelSearchButton.setContentAreaFilled(false);
        mmemberPanelSearchButton.setFocusPainted(false);

        javax.swing.GroupLayout mmemberPanelLayout = new javax.swing.GroupLayout(mmemberPanel);
        mmemberPanel.setLayout(mmemberPanelLayout);
        mmemberPanelLayout.setHorizontalGroup(
            mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mmemberPanelSearchText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mmemberPanelLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(mmemberPanelSearchBox, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(mmemberPanelSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
        );
        mmemberPanelLayout.setVerticalGroup(
            mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mmemberPanelLayout.createSequentialGroup()
                .addComponent(mmemberPanelSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mmemberPanelSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mmemberPanelSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        amemberPanel.setBackground(new java.awt.Color(240, 240, 239));

        amemberPanelTitle.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        amemberPanelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amemberPanelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/addUser.png"))); // NOI18N
        amemberPanelTitle.setText("Add a new member");
        amemberPanelTitle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        amemberNameLabel.setText("Name");

        amemberName.setMaximumSize(new java.awt.Dimension(600, 24));

        amemberIDNumber.setMaximumSize(new java.awt.Dimension(600, 24));

        amemberIDNumberLable.setText("ID Number");

        amemberPhoneNumber.setMaximumSize(new java.awt.Dimension(600, 24));

        amemberPhoneNumberLabel.setText("Phone Number");

        amemberEmailLabel.setText("Email");

        amemberEmail.setMaximumSize(new java.awt.Dimension(600, 24));

        amemberTempAddressLabel.setText("Temporary Address");

        amemberTempAddress.setColumns(20);
        amemberTempAddress.setRows(5);
        amemberTempAddress.setMaximumSize(new java.awt.Dimension(600, 150));
        jScrollPane1.setViewportView(amemberTempAddress);

        amemberPmtAddress.setColumns(20);
        amemberPmtAddress.setRows(5);
        amemberPmtAddress.setMaximumSize(new java.awt.Dimension(600, 150));
        jScrollPane2.setViewportView(amemberPmtAddress);

        amemberPmtAddressLabel.setText("Permanent Address");

        resetButton.setBackground(new java.awt.Color(240, 240, 239));
        resetButton.setText("Reset");
        resetButton.setFocusPainted(false);

        addButton.setBackground(new java.awt.Color(240, 240, 239));
        addButton.setText("Add");
        addButton.setFocusPainted(false);

        javax.swing.GroupLayout amemberPanelLayout = new javax.swing.GroupLayout(amemberPanel);
        amemberPanel.setLayout(amemberPanelLayout);
        amemberPanelLayout.setHorizontalGroup(
            amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amemberPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(amemberPanelLayout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton))
                    .addGroup(amemberPanelLayout.createSequentialGroup()
                        .addGroup(amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(amemberPhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amemberEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amemberTempAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amemberPmtAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amemberIDNumberLable, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amemberNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(amemberEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amemberPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amemberIDNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                            .addComponent(amemberName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(47, 47, 47))
            .addComponent(amemberPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        amemberPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, resetButton});

        amemberPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {amemberEmailLabel, amemberIDNumberLable, amemberNameLabel, amemberPhoneNumberLabel, amemberPmtAddressLabel, amemberTempAddressLabel});

        amemberPanelLayout.setVerticalGroup(
            amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amemberPanelLayout.createSequentialGroup()
                .addComponent(amemberPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberIDNumberLable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amemberIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberPhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amemberPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amemberEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberTempAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberPmtAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(addButton))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        amemberPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {amemberEmailLabel, amemberIDNumberLable, amemberNameLabel, amemberPhoneNumberLabel, amemberPmtAddressLabel, amemberTempAddressLabel});

        memberPanelContainer.setLayer(mmemberPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        memberPanelContainer.setLayer(amemberPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout memberPanelContainerLayout = new javax.swing.GroupLayout(memberPanelContainer);
        memberPanelContainer.setLayout(memberPanelContainerLayout);
        memberPanelContainerLayout.setHorizontalGroup(
            memberPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mmemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(memberPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(amemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        memberPanelContainerLayout.setVerticalGroup(
            memberPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mmemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(memberPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(amemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout memberPanelLayout = new javax.swing.GroupLayout(memberPanel);
        memberPanel.setLayout(memberPanelLayout);
        memberPanelLayout.setHorizontalGroup(
            memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberPanelLayout.createSequentialGroup()
                .addComponent(memberPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(memberPanelContainer))
        );
        memberPanelLayout.setVerticalGroup(
            memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(memberPanelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(memberPanelContainer)
        );

        layerContainer.setLayer(settingsPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerContainer.setLayer(booksPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerContainer.setLayer(memberPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layerContainerLayout = new javax.swing.GroupLayout(layerContainer);
        layerContainer.setLayout(layerContainerLayout);
        layerContainerLayout.setHorizontalGroup(
            layerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(booksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(memberPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layerContainerLayout.setVerticalGroup(
            layerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(booksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(memberPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainContainerLayout = new javax.swing.GroupLayout(MainContainer);
        MainContainer.setLayout(MainContainerLayout);
        MainContainerLayout.setHorizontalGroup(
            MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(layerContainer)
        );
        MainContainerLayout.setVerticalGroup(
            MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainContainerLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(layerContainer))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1121, 696));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        this.memberPanel.setVisible(false);
        this.booksPanel.setVisible(false);
        this.settingsPanel.setVisible(true);
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseExited
        settingsButton.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_settingsButtonMouseExited

    private void settingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseEntered
        settingsButton.setBackground(java.awt.Color.lightGray);
    }//GEN-LAST:event_settingsButtonMouseEntered

    private void booksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksButtonActionPerformed
        this.memberPanel.setVisible(false);
        this.settingsPanel.setVisible(false);
        this.booksPanel.setVisible(true);
    }//GEN-LAST:event_booksButtonActionPerformed

    private void booksButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksButtonMouseExited
        booksButton.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_booksButtonMouseExited

    private void booksButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksButtonMouseEntered
        booksButton.setBackground(java.awt.Color.lightGray);
    }//GEN-LAST:event_booksButtonMouseEntered

    private void memberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberButtonActionPerformed
        this.booksPanel.setVisible(false);
        this.settingsPanel.setVisible(false);
        this.memberPanel.setVisible(true);
        mmemberPanel.setVisible(false);
        amemberPanel.setVisible(false);
    }//GEN-LAST:event_memberButtonActionPerformed

    private void memberButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberButtonMouseExited
        memberButton.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_memberButtonMouseExited

    private void memberButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberButtonMouseEntered
        memberButton.setBackground(java.awt.Color.lightGray);
    }//GEN-LAST:event_memberButtonMouseEntered

    private void mmemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmemberMouseEntered
        mmember.setBackground(java.awt.Color.cyan);
    }//GEN-LAST:event_mmemberMouseEntered

    private void mmemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmemberMouseExited
        mmember.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_mmemberMouseExited

    private void amemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amemberMouseEntered
        amember.setBackground(java.awt.Color.cyan);
    }//GEN-LAST:event_amemberMouseEntered

    private void amemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amemberMouseExited
        amember.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_amemberMouseExited

    private void nmemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nmemberMouseEntered
        nmember.setBackground(java.awt.Color.cyan);
    }//GEN-LAST:event_nmemberMouseEntered

    private void nmemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nmemberMouseExited
        nmember.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_nmemberMouseExited

    private void mmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmemberActionPerformed
        amemberPanel.setVisible(false);
        mmemberPanel.setVisible(true);
    }//GEN-LAST:event_mmemberActionPerformed

    private void amemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amemberActionPerformed
        amemberPanel.setVisible(true);
        mmemberPanel.setVisible(false);
    }//GEN-LAST:event_amemberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainContainer;
    private javax.swing.JButton addButton;
    private javax.swing.JButton amember;
    private javax.swing.JTextField amemberEmail;
    private javax.swing.JLabel amemberEmailLabel;
    private javax.swing.JTextField amemberIDNumber;
    private javax.swing.JLabel amemberIDNumberLable;
    private javax.swing.JTextField amemberName;
    private javax.swing.JLabel amemberNameLabel;
    private javax.swing.JPanel amemberPanel;
    private javax.swing.JLabel amemberPanelTitle;
    private javax.swing.JTextField amemberPhoneNumber;
    private javax.swing.JLabel amemberPhoneNumberLabel;
    private javax.swing.JTextArea amemberPmtAddress;
    private javax.swing.JLabel amemberPmtAddressLabel;
    private javax.swing.JTextArea amemberTempAddress;
    private javax.swing.JLabel amemberTempAddressLabel;
    private javax.swing.JButton booksButton;
    public javax.swing.JPanel booksPanel;
    private javax.swing.JPanel booksPanelSidebar;
    private javax.swing.JPanel booksPanelSidebarHeader;
    private javax.swing.JLabel booksPanelSidebarHeaderText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLayeredPane layerContainer;
    private javax.swing.JButton memberButton;
    public javax.swing.JPanel memberPanel;
    private javax.swing.JLayeredPane memberPanelContainer;
    private javax.swing.JPanel memberPanelSidebar;
    private javax.swing.JPanel memberPanelSidebarHeader;
    private javax.swing.JLabel memberPanelSidebarHeaderText;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton mmember;
    private javax.swing.JPanel mmemberPanel;
    private javax.swing.JTextField mmemberPanelSearchBox;
    private javax.swing.JButton mmemberPanelSearchButton;
    private javax.swing.JLabel mmemberPanelSearchText;
    private javax.swing.JButton nmember;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton settingsButton;
    public javax.swing.JPanel settingsPanel;
    private javax.swing.JPanel settingsPanelSidebar;
    private javax.swing.JPanel settingsPanelSidebarHeader;
    private javax.swing.JLabel settingsPanelSidebarHeaderText;
    // End of variables declaration//GEN-END:variables
}
