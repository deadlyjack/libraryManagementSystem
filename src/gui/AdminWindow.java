package gui;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import server.DataBase;

/**
 *
 * @author delle
 */
public class AdminWindow extends javax.swing.JFrame {

    public AdminWindow() {
        initComponents();
        this.icon = new ImageIcon("D:\\projects\\java_projects\\LibraryManagemant\\src\\assests\\icon.png");
        this.db = new DataBase();
        this.db.OpenConnection();
    }
    
    private void initData(){
        this.settingsPanel.setVisible(false);
        this.alibrarianPanel.setVisible(false);
        this.librarianPanel.setVisible(false);
        this.mlibrarianPanel.setVisible(false);
        
        this.SettingsStaffID.setText(this.db.GetSessionValue("staffID"));
        this.SettingsName.setText(this.db.GetSessionValue("name"));
        this.SettingsPhone.setText(this.db.GetSessionValue("phone"));
        this.SettingsEmail.setText(this.db.GetSessionValue("email"));
        
        if(!this.db.GetSessionValue("name").equals(" ")){
            this.SettingsName.setEditable(false);
            this.SettingsStaffID.setEditable(false);
        }
        if(this.db.GetSessionValue("name").equals(" "))
            this.SettingsName.setText("");
        if(this.db.GetSessionValue("staffID").equals(" "))
            this.SettingsStaffID.setText("");
        if(this.db.GetSessionValue("email").equals(" "))
            this.SettingsEmail.setText("");
        if(this.db.GetSessionValue("phone").equals(" "))
            this.SettingsPhone.setText("");
            
        resultTableRender();
    }
    private void TableRender(ResultSet rs){
        DefaultTableModel resultTable = (DefaultTableModel) this.librarianSearchResult.getModel();
        
        resultTable.setRowCount(0);
        try {
            while(rs.next()){
                resultTable.addRow(new Object[]{rs.getString("id"), rs.getString("name"), rs.getString("staffID"), rs.getString("phone"), rs.getString("email")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void resultTableRender(){
        ResultSet rs = this.db.getRows("librarian");
        TableRender(rs);
    }

    private void resultTableRender(String condition){
        ResultSet rs = this.db.getRows("librarian", condition);
        TableRender(rs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanel = new javax.swing.JPanel();
        adminPanelSidebar = new javax.swing.JPanel();
        adminPanelSidebarHeader = new javax.swing.JPanel();
        settingsPanelSidebarHeaderText = new javax.swing.JLabel();
        librarian = new javax.swing.JButton();
        alibrarian = new javax.swing.JButton();
        settings = new javax.swing.JButton();
        mlibrarian = new javax.swing.JButton();
        aminPanelConatainer = new javax.swing.JLayeredPane();
        alibrarianPanel = new javax.swing.JPanel();
        alibrrianPanelHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        staffid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        msg = new javax.swing.JLabel();
        clearAll = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        librarianPanel = new javax.swing.JPanel();
        mlibrarianPanelHeader = new javax.swing.JLabel();
        mlibrarianPanelSearchBox = new javax.swing.JTextField();
        mlibrarianPanelSearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        librarianSearchResult = new javax.swing.JTable();
        reloadButton = new javax.swing.JButton();
        settingsPanel = new javax.swing.JPanel();
        settingsPanelHeader = new javax.swing.JLabel();
        SettingsStaffIDlable = new javax.swing.JLabel();
        SettingsStaffID = new javax.swing.JTextField();
        SettingsNameLable = new javax.swing.JLabel();
        SettingsName = new javax.swing.JTextField();
        SettingsPhoneLabel = new javax.swing.JLabel();
        SettingsPhone = new javax.swing.JTextField();
        SettingsEmailLable = new javax.swing.JLabel();
        SettingsEmail = new javax.swing.JTextField();
        SettingsPasswordlLable = new javax.swing.JLabel();
        SettingsPassword = new javax.swing.JTextField();
        SettingsSaveButton = new javax.swing.JButton();
        SettingsMsg = new javax.swing.JLabel();
        SettingsPasswordlLable1 = new javax.swing.JLabel();
        SettingsOldPassword = new javax.swing.JPasswordField();
        mlibrarianPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        searchStaffID = new javax.swing.JTextField();
        mlibrarianSearchButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        mlibrarianNameLabel = new javax.swing.JLabel();
        mlibrarianEmilLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        delteLibrarianButton = new javax.swing.JButton();
        blockLibrarianButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        notificationText = new javax.swing.JTextArea();
        sendNotification = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        mlibrarianMsg = new javax.swing.JLabel();

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

        librarian.setBackground(new java.awt.Color(255, 255, 255));
        librarian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        librarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/ids.png"))); // NOI18N
        librarian.setText("Librarian");
        librarian.setBorderPainted(false);
        librarian.setFocusPainted(false);
        librarian.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        librarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                librarianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                librarianMouseExited(evt);
            }
        });
        librarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librarianActionPerformed(evt);
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

        settings.setBackground(new java.awt.Color(255, 255, 255));
        settings.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/settings.png"))); // NOI18N
        settings.setText("Settings");
        settings.setBorderPainted(false);
        settings.setFocusPainted(false);
        settings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsActionPerformed(evt);
            }
        });

        mlibrarian.setBackground(new java.awt.Color(255, 255, 255));
        mlibrarian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mlibrarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/settings3.png"))); // NOI18N
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

        javax.swing.GroupLayout adminPanelSidebarLayout = new javax.swing.GroupLayout(adminPanelSidebar);
        adminPanelSidebar.setLayout(adminPanelSidebarLayout);
        adminPanelSidebarLayout.setHorizontalGroup(
            adminPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanelSidebarHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(librarian, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(alibrarian, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(settings, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(mlibrarian, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        adminPanelSidebarLayout.setVerticalGroup(
            adminPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(adminPanelSidebarHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(librarian, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mlibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        alibrarianPanel.setMaximumSize(new java.awt.Dimension(600, 25));
        alibrarianPanel.setMinimumSize(new java.awt.Dimension(300, 25));
        alibrarianPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alibrarianPanelMouseEntered(evt);
            }
        });

        alibrrianPanelHeader.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        alibrrianPanelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alibrrianPanelHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/addUser.png"))); // NOI18N
        alibrrianPanelHeader.setText("Add a new librarian");

        jLabel1.setText("Staff ID");
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 25));

        staffid.setMaximumSize(new java.awt.Dimension(600, 25));
        staffid.setMinimumSize(new java.awt.Dimension(300, 25));

        name.setMaximumSize(new java.awt.Dimension(600, 25));
        name.setMinimumSize(new java.awt.Dimension(300, 25));

        jLabel2.setText("Name");
        jLabel2.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(150, 25));

        jLabel4.setText("Password");
        jLabel4.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(150, 25));

        addButton.setBackground(new java.awt.Color(240, 240, 239));
        addButton.setText("add");
        addButton.setFocusPainted(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(240, 240, 239));
        resetButton.setText("reset");
        resetButton.setFocusPainted(false);
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Phone");
        jLabel5.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel5.setMinimumSize(new java.awt.Dimension(150, 25));

        phone.setMaximumSize(new java.awt.Dimension(600, 25));
        phone.setMinimumSize(new java.awt.Dimension(300, 25));

        jLabel6.setText("email");
        jLabel6.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel6.setMinimumSize(new java.awt.Dimension(150, 25));

        password.setMaximumSize(new java.awt.Dimension(600, 25));
        password.setMinimumSize(new java.awt.Dimension(300, 25));

        email.setMaximumSize(new java.awt.Dimension(600, 25));
        email.setMinimumSize(new java.awt.Dimension(300, 25));

        msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        clearAll.setText("Clear all feilds after adding librarian");

        javax.swing.GroupLayout alibrarianPanelLayout = new javax.swing.GroupLayout(alibrarianPanel);
        alibrarianPanel.setLayout(alibrarianPanelLayout);
        alibrarianPanelLayout.setHorizontalGroup(
            alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alibrrianPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alibrarianPanelLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(clearAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(alibrarianPanelLayout.createSequentialGroup()
                        .addComponent(msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(alibrarianPanelLayout.createSequentialGroup()
                        .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(staffid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(232, 232, 232))
        );
        alibrarianPanelLayout.setVerticalGroup(
            alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alibrarianPanelLayout.createSequentialGroup()
                .addComponent(alibrrianPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staffid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(alibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addButton)
                        .addComponent(resetButton))
                    .addComponent(msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(clearAll)
                .addGap(0, 365, Short.MAX_VALUE))
        );

        librarianPanel.setBackground(new java.awt.Color(240, 240, 239));

        mlibrarianPanelHeader.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        mlibrarianPanelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlibrarianPanelHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/user.png"))); // NOI18N
        mlibrarianPanelHeader.setText("Search For Librarian");

        mlibrarianPanelSearchBox.setToolTipText("Enter librarian ID");
        mlibrarianPanelSearchBox.setMaximumSize(new java.awt.Dimension(600, 30));
        mlibrarianPanelSearchBox.setMinimumSize(new java.awt.Dimension(200, 30));
        mlibrarianPanelSearchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mlibrarianPanelSearchBoxKeyReleased(evt);
            }
        });

        mlibrarianPanelSearchButton.setBackground(new java.awt.Color(240, 240, 239));
        mlibrarianPanelSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/search.png"))); // NOI18N
        mlibrarianPanelSearchButton.setBorder(null);
        mlibrarianPanelSearchButton.setBorderPainted(false);
        mlibrarianPanelSearchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mlibrarianPanelSearchButton.setFocusPainted(false);
        mlibrarianPanelSearchButton.setMaximumSize(new java.awt.Dimension(30, 30));
        mlibrarianPanelSearchButton.setMinimumSize(new java.awt.Dimension(30, 30));
        mlibrarianPanelSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlibrarianPanelSearchButtonActionPerformed(evt);
            }
        });

        librarianSearchResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "StaffID", "Phone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        librarianSearchResult.setColumnSelectionAllowed(true);
        librarianSearchResult.setGridColor(new java.awt.Color(204, 204, 204));
        librarianSearchResult.setRowHeight(25);
        jScrollPane1.setViewportView(librarianSearchResult);
        librarianSearchResult.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        reloadButton.setBackground(new java.awt.Color(240, 240, 239));
        reloadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/reload.png"))); // NOI18N
        reloadButton.setBorderPainted(false);
        reloadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reloadButton.setFocusPainted(false);
        reloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout librarianPanelLayout = new javax.swing.GroupLayout(librarianPanel);
        librarianPanel.setLayout(librarianPanelLayout);
        librarianPanelLayout.setHorizontalGroup(
            librarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlibrarianPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(librarianPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(librarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(librarianPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(librarianPanelLayout.createSequentialGroup()
                        .addComponent(reloadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244)
                        .addComponent(mlibrarianPanelSearchBox, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mlibrarianPanelSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277))))
        );
        librarianPanelLayout.setVerticalGroup(
            librarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(librarianPanelLayout.createSequentialGroup()
                .addComponent(mlibrarianPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(librarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mlibrarianPanelSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mlibrarianPanelSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reloadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );

        settingsPanelHeader.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        settingsPanelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsPanelHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/settings.png"))); // NOI18N
        settingsPanelHeader.setText("Settings");

        SettingsStaffIDlable.setFont(new java.awt.Font("Source Sans Pro Light", 0, 12)); // NOI18N
        SettingsStaffIDlable.setText("StaffID");
        SettingsStaffIDlable.setMaximumSize(new java.awt.Dimension(150, 28));
        SettingsStaffIDlable.setMinimumSize(new java.awt.Dimension(80, 28));

        SettingsStaffID.setMaximumSize(new java.awt.Dimension(600, 25));
        SettingsStaffID.setMinimumSize(new java.awt.Dimension(300, 25));

        SettingsNameLable.setFont(new java.awt.Font("Source Sans Pro Light", 0, 12)); // NOI18N
        SettingsNameLable.setText("Name");
        SettingsNameLable.setMaximumSize(new java.awt.Dimension(150, 28));
        SettingsNameLable.setMinimumSize(new java.awt.Dimension(80, 28));

        SettingsName.setMaximumSize(new java.awt.Dimension(600, 25));
        SettingsName.setMinimumSize(new java.awt.Dimension(300, 25));

        SettingsPhoneLabel.setFont(new java.awt.Font("Source Sans Pro Light", 0, 12)); // NOI18N
        SettingsPhoneLabel.setText("Phone");
        SettingsPhoneLabel.setMaximumSize(new java.awt.Dimension(150, 28));
        SettingsPhoneLabel.setMinimumSize(new java.awt.Dimension(80, 28));

        SettingsPhone.setMaximumSize(new java.awt.Dimension(600, 25));
        SettingsPhone.setMinimumSize(new java.awt.Dimension(300, 25));

        SettingsEmailLable.setFont(new java.awt.Font("Source Sans Pro Light", 0, 12)); // NOI18N
        SettingsEmailLable.setText("Email");
        SettingsEmailLable.setMaximumSize(new java.awt.Dimension(150, 28));
        SettingsEmailLable.setMinimumSize(new java.awt.Dimension(80, 28));

        SettingsEmail.setMaximumSize(new java.awt.Dimension(600, 25));
        SettingsEmail.setMinimumSize(new java.awt.Dimension(300, 25));

        SettingsPasswordlLable.setFont(new java.awt.Font("Source Sans Pro Light", 0, 12)); // NOI18N
        SettingsPasswordlLable.setText("Password");
        SettingsPasswordlLable.setMaximumSize(new java.awt.Dimension(150, 28));
        SettingsPasswordlLable.setMinimumSize(new java.awt.Dimension(80, 28));

        SettingsPassword.setMaximumSize(new java.awt.Dimension(600, 25));
        SettingsPassword.setMinimumSize(new java.awt.Dimension(300, 25));

        SettingsSaveButton.setBackground(new java.awt.Color(240, 240, 239));
        SettingsSaveButton.setText("Save Changes");
        SettingsSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsSaveButtonActionPerformed(evt);
            }
        });

        SettingsMsg.setForeground(new java.awt.Color(204, 204, 0));
        SettingsMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SettingsMsg.setText(" ");

        SettingsPasswordlLable1.setFont(new java.awt.Font("Source Sans Pro Light", 0, 12)); // NOI18N
        SettingsPasswordlLable1.setText("Current Password");
        SettingsPasswordlLable1.setMaximumSize(new java.awt.Dimension(150, 28));
        SettingsPasswordlLable1.setMinimumSize(new java.awt.Dimension(80, 28));

        SettingsOldPassword.setMaximumSize(new java.awt.Dimension(600, 25));
        SettingsOldPassword.setMinimumSize(new java.awt.Dimension(300, 25));

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addComponent(SettingsMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SettingsSaveButton))
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SettingsPhoneLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SettingsNameLable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SettingsStaffIDlable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SettingsPasswordlLable1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SettingsPasswordlLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SettingsEmailLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SettingsStaffID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SettingsName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(SettingsPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(SettingsEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(SettingsPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(SettingsOldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(254, 254, 254))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addComponent(settingsPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SettingsStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SettingsStaffIDlable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SettingsName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SettingsNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SettingsPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SettingsPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SettingsEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SettingsEmailLable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SettingsPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SettingsPasswordlLable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SettingsPasswordlLable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SettingsOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SettingsSaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SettingsMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 315, Short.MAX_VALUE))
        );

        mlibrarianPanel.setBackground(new java.awt.Color(240, 240, 239));
        mlibrarianPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mlibrarianPanelMouseEntered(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/settings3.png"))); // NOI18N
        jLabel3.setText("Manage Librarian");

        jLabel7.setText("Librarian StaffID");
        jLabel7.setMaximumSize(new java.awt.Dimension(150, 28));
        jLabel7.setMinimumSize(new java.awt.Dimension(80, 28));

        searchStaffID.setMaximumSize(new java.awt.Dimension(150, 30));
        searchStaffID.setMinimumSize(new java.awt.Dimension(100, 30));
        searchStaffID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchStaffIDKeyReleased(evt);
            }
        });

        mlibrarianSearchButton.setBackground(new java.awt.Color(240, 240, 239));
        mlibrarianSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/search.png"))); // NOI18N
        mlibrarianSearchButton.setBorderPainted(false);
        mlibrarianSearchButton.setFocusPainted(false);
        mlibrarianSearchButton.setMaximumSize(new java.awt.Dimension(31, 31));
        mlibrarianSearchButton.setMinimumSize(new java.awt.Dimension(30, 30));
        mlibrarianSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlibrarianSearchButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Name");

        mlibrarianNameLabel.setForeground(new java.awt.Color(0, 102, 102));

        mlibrarianEmilLabel.setForeground(new java.awt.Color(0, 102, 102));
        mlibrarianEmilLabel.setMaximumSize(new java.awt.Dimension(600, 30));
        mlibrarianEmilLabel.setMinimumSize(new java.awt.Dimension(300, 30));

        jLabel9.setText("Email");

        delteLibrarianButton.setBackground(new java.awt.Color(240, 240, 239));
        delteLibrarianButton.setText("delete");
        delteLibrarianButton.setEnabled(false);
        delteLibrarianButton.setFocusPainted(false);
        delteLibrarianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delteLibrarianButtonActionPerformed(evt);
            }
        });

        blockLibrarianButton.setBackground(new java.awt.Color(240, 240, 239));
        blockLibrarianButton.setText("block");
        blockLibrarianButton.setEnabled(false);
        blockLibrarianButton.setFocusPainted(false);
        blockLibrarianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockLibrarianButtonActionPerformed(evt);
            }
        });

        notificationText.setColumns(20);
        notificationText.setRows(5);
        notificationText.setMaximumSize(new java.awt.Dimension(600, 60));
        notificationText.setMinimumSize(new java.awt.Dimension(300, 60));
        jScrollPane2.setViewportView(notificationText);

        sendNotification.setBackground(new java.awt.Color(240, 240, 239));
        sendNotification.setText("send");
        sendNotification.setEnabled(false);
        sendNotification.setFocusPainted(false);
        sendNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendNotificationActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("send message");

        javax.swing.GroupLayout mlibrarianPanelLayout = new javax.swing.GroupLayout(mlibrarianPanel);
        mlibrarianPanel.setLayout(mlibrarianPanelLayout);
        mlibrarianPanelLayout.setHorizontalGroup(
            mlibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mlibrarianPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mlibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mlibrarianPanelLayout.createSequentialGroup()
                        .addGroup(mlibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mlibrarianPanelLayout.createSequentialGroup()
                                .addComponent(blockLibrarianButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delteLibrarianButton))
                            .addGroup(mlibrarianPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(mlibrarianSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mlibrarianMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sendNotification)
                            .addGroup(mlibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(mlibrarianPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mlibrarianEmilLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mlibrarianPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mlibrarianNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(mlibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(mlibrarianPanelLayout.createSequentialGroup()
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator4))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
        );
        mlibrarianPanelLayout.setVerticalGroup(
            mlibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mlibrarianPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mlibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mlibrarianSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mlibrarianMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mlibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(mlibrarianNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mlibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(mlibrarianEmilLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mlibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delteLibrarianButton)
                    .addComponent(blockLibrarianButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mlibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendNotification)
                .addContainerGap(263, Short.MAX_VALUE))
        );

        aminPanelConatainer.setLayer(alibrarianPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        aminPanelConatainer.setLayer(librarianPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        aminPanelConatainer.setLayer(settingsPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        aminPanelConatainer.setLayer(mlibrarianPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout aminPanelConatainerLayout = new javax.swing.GroupLayout(aminPanelConatainer);
        aminPanelConatainer.setLayout(aminPanelConatainerLayout);
        aminPanelConatainerLayout.setHorizontalGroup(
            aminPanelConatainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(librarianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(aminPanelConatainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(alibrarianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(aminPanelConatainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(settingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(aminPanelConatainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mlibrarianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aminPanelConatainerLayout.setVerticalGroup(
            aminPanelConatainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(librarianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(aminPanelConatainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(alibrarianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(aminPanelConatainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(settingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(aminPanelConatainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mlibrarianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void librarianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_librarianMouseEntered
        this.librarian.setBackground(java.awt.Color.cyan);
    }//GEN-LAST:event_librarianMouseEntered

    private void librarianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_librarianMouseExited
        if(selected != 2)this.librarian.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_librarianMouseExited

    private void alibrarianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alibrarianMouseEntered
        this.alibrarian.setBackground(java.awt.Color.cyan);
    }//GEN-LAST:event_alibrarianMouseEntered

    private void alibrarianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alibrarianMouseExited
        if(selected != 1)this.alibrarian.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_alibrarianMouseExited

    private void librarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librarianActionPerformed
        selected = 2;
        this.alibrarian.setBackground(java.awt.Color.white);
        this.mlibrarian.setBackground(java.awt.Color.white);
        this.settings.setBackground(java.awt.Color.white);
        this.librarianPanel.setVisible(true);
        this.alibrarianPanel.setVisible(false);
        this.settingsPanel.setVisible(false);
        this.mlibrarianPanel.setVisible(false);
    }//GEN-LAST:event_librarianActionPerformed

    private void alibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alibrarianActionPerformed
        selected = 1;
        this.librarian.setBackground(java.awt.Color.white);
        this.settings.setBackground(java.awt.Color.white);
        this.mlibrarian.setBackground(java.awt.Color.white);
        this.alibrarianPanel.setVisible(true);
        this.settingsPanel.setVisible(false);
        this.librarianPanel.setVisible(false);
        this.mlibrarianPanel.setVisible(false);
    }//GEN-LAST:event_alibrarianActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String staffIdValue, nameValue, phoneValue, emailValue, passwordValue;
        staffIdValue = this.staffid.getText();
        nameValue = this.name.getText();
        phoneValue = this.phone.getText();
        emailValue = this.email.getText();
        passwordValue = this.password.getText();
        int r = db.insertData("librarian", "(staffID, name, phone, email, password, addedBy) VALUES('"+staffIdValue+"','"+nameValue+"','"+phoneValue+"','"+emailValue+"','"+passwordValue+"', '"+this.db.GetSessionValue("name")+"')");
        if(r != 0){
            this.msg.setForeground(Color.green);
            this.msg.setText("new librarian added");
            if(this.clearAll.isSelected()) resetForm();
            resultTableRender();
        }else{
            this.msg.setForeground(Color.red);
            this.msg.setText("failed to add new librarian");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        this.settings.setBackground(java.awt.Color.cyan);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        if(selected != 3)this.settings.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_settingsMouseExited

    private void settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsActionPerformed
        selected = 3;
        this.alibrarian.setBackground(java.awt.Color.white);
        this.librarian.setBackground(java.awt.Color.white);
        this.mlibrarian.setBackground(java.awt.Color.white);
        this.alibrarianPanel.setVisible(false);
        this.librarianPanel.setVisible(false);
        this.settingsPanel.setVisible(true);
        this.mlibrarianPanel.setVisible(false);
    }//GEN-LAST:event_settingsActionPerformed

    private void SettingsSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsSaveButtonActionPerformed
        String Name, staffID, Email, Phone, Password, query;
        staffID = this.SettingsStaffID.getText();
        Name = this.SettingsName.getText();
        Email = this.SettingsEmail.getText();
        Phone = this.SettingsPhone.getText();
        Password = this.SettingsPassword.getText();
        
        if(String.valueOf(this.SettingsOldPassword.getPassword()).equals(this.db.GetSessionValue("password"))){
            query = "staffID='"+staffID+"', name='"+Name+"', email='"+Email+"', phone='"+Phone+"'";
            if(Password.length() != 0 && Password.length() >= 4) query += ", password='"+Password+"'";
            
            if(query.length() != 0){
                if(this.db.updateData("admin", query, "id=1") == 1){
                    this.SettingsMsg.setText("Settings Saved");
                    ResultSet rs = this.db.getValueWhere("admin", "*", "staffID='"+staffID+"'");
                    this.db.SessionStart(rs);
                }
                else{
                    this.SettingsMsg.setForeground(Color.red);
                    this.SettingsMsg.setText("Failed to save!");
                }
            }
        } else{
            this.SettingsMsg.setForeground(Color.red);
            this.SettingsMsg.setText("incorrect password!");
        }
    }//GEN-LAST:event_SettingsSaveButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        resetForm();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void alibrarianPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alibrarianPanelMouseEntered
        this.msg.setText("");
    }//GEN-LAST:event_alibrarianPanelMouseEntered

    private void mlibrarianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlibrarianMouseEntered
        this.mlibrarian.setBackground(java.awt.Color.cyan);
    }//GEN-LAST:event_mlibrarianMouseEntered

    private void mlibrarianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlibrarianMouseExited
        if(selected != 4)this.mlibrarian.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_mlibrarianMouseExited

    private void mlibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlibrarianActionPerformed
        selected = 4;
        this.alibrarian.setBackground(java.awt.Color.white);
        this.librarian.setBackground(java.awt.Color.white);
        this.settings.setBackground(java.awt.Color.white);
        this.alibrarianPanel.setVisible(false);
        this.librarianPanel.setVisible(false);
        this.settingsPanel.setVisible(false);
        this.mlibrarianPanel.setVisible(true);
    }//GEN-LAST:event_mlibrarianActionPerformed

    private void mlibrarianSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlibrarianSearchButtonActionPerformed
        String sid = this.searchStaffID.getText();
        if(sid.length() != 0){
            try {
                ResultSet rs = this.db.getValueWhere("librarian", "*", "staffID='"+sid+"'");
                if(rs.next()){
                    this.mlibrarianNameLabel.setText(rs.getString("name"));
                    this.mlibrarianEmilLabel.setText(rs.getString("email"));
                    this.delteLibrarianButton.setEnabled(true);
                    this.sendNotification.setEnabled(true);
                    if(rs.getString("isBlocked").equals("1")) this.blockLibrarianButton.setText("unblock");
                    else this.blockLibrarianButton.setText("block");
                    this.blockLibrarianButton.setEnabled(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mlibrarianSearchButtonActionPerformed

    private void delteLibrarianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delteLibrarianButtonActionPerformed
        if(this.db.deleteRow("librarian", "staffID='"+this.searchStaffID.getText()+"'") != 0){
            this.mlibrarianMsg.setForeground(Color.green);
            this.mlibrarianMsg.setText("Librarian deleted!");
            resultTableRender();
        }
        else{
            this.mlibrarianMsg.setForeground(Color.red);
            this.mlibrarianMsg.setText("Failed to delete librarian!");
        }
    }//GEN-LAST:event_delteLibrarianButtonActionPerformed

    private void mlibrarianPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlibrarianPanelMouseEntered
        this.mlibrarianMsg.setText("");
    }//GEN-LAST:event_mlibrarianPanelMouseEntered

    private void blockLibrarianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockLibrarianButtonActionPerformed
        if(this.db.updateData("librarian", "isBlocked=true", "staffID='"+this.searchStaffID.getText()+"'") != 0){
            this.mlibrarianMsg.setForeground(Color.green);
            this.mlibrarianMsg.setText("Librarian blocked!");
            resultTableRender();
        }else{
            this.mlibrarianMsg.setForeground(Color.red);
            this.mlibrarianMsg.setText("Failed to block librarian!");
        }
    }//GEN-LAST:event_blockLibrarianButtonActionPerformed

    private void sendNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendNotificationActionPerformed
        if(this.db.updateData("librarian", "msg='"+this.notificationText.getText()+"'", "staffID='"+this.searchStaffID.getText()+"'") != 0){
            this.mlibrarianMsg.setForeground(Color.green);
            this.mlibrarianMsg.setText("Message sent!"); 
        }else{
            this.mlibrarianMsg.setForeground(Color.red);
            this.mlibrarianMsg.setText("Failed to send message!");          
        }
    }//GEN-LAST:event_sendNotificationActionPerformed

    private void searchStaffIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchStaffIDKeyReleased
        this.delteLibrarianButton.setEnabled(false);
        this.sendNotification.setEnabled(false);
        this.blockLibrarianButton.setEnabled(false);
    }//GEN-LAST:event_searchStaffIDKeyReleased

    private void mlibrarianPanelSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlibrarianPanelSearchButtonActionPerformed
        String name = this.mlibrarianPanelSearchBox.getText();
        if(name.length() != 0) resultTableRender("name LIKE '%"+name+"%'");
    }//GEN-LAST:event_mlibrarianPanelSearchButtonActionPerformed

    private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
        resultTableRender();
    }//GEN-LAST:event_reloadButtonActionPerformed

    private void mlibrarianPanelSearchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mlibrarianPanelSearchBoxKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) this.mlibrarianPanelSearchButtonActionPerformed(null);
        else if(evt.getKeyCode() == KeyEvent.VK_ESCAPE) resultTableRender();
    }//GEN-LAST:event_mlibrarianPanelSearchBoxKeyReleased

    
    private void resetForm(){
        this.staffid.setText("");
        this.name.setText("");
        this.phone.setText("");
        this.email.setText("");
        this.password.setText("");
    }
    public void GetSession(ResultSet rs){
        this.db.SessionStart(rs);
        initData();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SettingsEmail;
    private javax.swing.JLabel SettingsEmailLable;
    private javax.swing.JLabel SettingsMsg;
    private javax.swing.JTextField SettingsName;
    private javax.swing.JLabel SettingsNameLable;
    private javax.swing.JPasswordField SettingsOldPassword;
    private javax.swing.JTextField SettingsPassword;
    private javax.swing.JLabel SettingsPasswordlLable;
    private javax.swing.JLabel SettingsPasswordlLable1;
    private javax.swing.JTextField SettingsPhone;
    private javax.swing.JLabel SettingsPhoneLabel;
    private javax.swing.JButton SettingsSaveButton;
    private javax.swing.JTextField SettingsStaffID;
    private javax.swing.JLabel SettingsStaffIDlable;
    private javax.swing.JButton addButton;
    public javax.swing.JPanel adminPanel;
    private javax.swing.JPanel adminPanelSidebar;
    private javax.swing.JPanel adminPanelSidebarHeader;
    private javax.swing.JButton alibrarian;
    private javax.swing.JPanel alibrarianPanel;
    private javax.swing.JLabel alibrrianPanelHeader;
    private javax.swing.JLayeredPane aminPanelConatainer;
    private javax.swing.JButton blockLibrarianButton;
    private javax.swing.JCheckBox clearAll;
    private javax.swing.JButton delteLibrarianButton;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton librarian;
    private javax.swing.JPanel librarianPanel;
    private javax.swing.JTable librarianSearchResult;
    private javax.swing.JButton mlibrarian;
    private javax.swing.JLabel mlibrarianEmilLabel;
    private javax.swing.JLabel mlibrarianMsg;
    private javax.swing.JLabel mlibrarianNameLabel;
    private javax.swing.JPanel mlibrarianPanel;
    private javax.swing.JLabel mlibrarianPanelHeader;
    private javax.swing.JTextField mlibrarianPanelSearchBox;
    private javax.swing.JButton mlibrarianPanelSearchButton;
    private javax.swing.JButton mlibrarianSearchButton;
    private javax.swing.JLabel msg;
    private javax.swing.JTextField name;
    private javax.swing.JTextArea notificationText;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phone;
    private javax.swing.JButton reloadButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField searchStaffID;
    private javax.swing.JButton sendNotification;
    private javax.swing.JButton settings;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JLabel settingsPanelHeader;
    private javax.swing.JLabel settingsPanelSidebarHeaderText;
    private javax.swing.JTextField staffid;
    // End of variables declaration//GEN-END:variables
    private int selected;
    private DataBase db;
    private ImageIcon icon;
}
