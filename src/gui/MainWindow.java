package gui;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import server.DataBase;

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
        this.db = new DataBase();
        this.db.OpenConnection();
        this.initMainWindow();
    }
    
    public final void initMainWindow(){
        ContainerVisiblity(false);
        PanelVisiblity(false);
        this.booksContanerPanel.setVisible(true);
//        DefaultTableModel booksTable = (DefaultTableModel) this.memberSearchResult.getModel();
        memberTableRender(this.db.getRows("member"));
    }
    
    private void memberTableRender(ResultSet rs){
        DefaultTableModel resultTable = (DefaultTableModel) this.memberSearchResult.getModel();
        resultTable.setRowCount(0);
        try {
            while(rs.next()){
                resultTable.addRow(new Object[]{rs.getString("memberID"), rs.getString("name"), rs.getString("email"), rs.getString("phone"), rs.getString("t_address"), rs.getString("booksBorrowed")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void PanelVisiblity(Boolean bool){
        this.ibookPanel.setVisible(bool);
        this.rbookPanel.setVisible(bool);
        this.searchBooksPanel.setVisible(bool);
        this.abookPanel.setVisible(bool);
        this.mbookPanel.setVisible(bool);
        this.amemberPanel.setVisible(bool);
        this.mmemberPanel.setVisible(bool);
        this.membersContainerPanel.setVisible(bool);
    }
    
    private void ContainerVisiblity(Boolean bool){
        this.membersContainerPanel.setVisible(bool);
        this.booksContanerPanel.setVisible(bool);
        this.settingsContainerPanel.setVisible(bool);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainContainer = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        memberContainerButton = new javax.swing.JButton();
        booksContainerButton = new javax.swing.JButton();
        settingsContainerButton = new javax.swing.JButton();
        layerContainer = new javax.swing.JLayeredPane();
        settingsContainerPanel = new javax.swing.JPanel();
        settingsPanelSidebar = new javax.swing.JPanel();
        settingsPanelSidebarHeader = new javax.swing.JPanel();
        settingsPanelSidebarHeaderText = new javax.swing.JLabel();
        booksContanerPanel = new javax.swing.JPanel();
        booksPanelSidebar = new javax.swing.JPanel();
        booksPanelSidebarHeader = new javax.swing.JPanel();
        booksPanelSidebarHeaderText = new javax.swing.JLabel();
        books = new javax.swing.JButton();
        abook = new javax.swing.JButton();
        rbooks = new javax.swing.JButton();
        ibook = new javax.swing.JButton();
        mbooks = new javax.swing.JButton();
        booksContainer = new javax.swing.JLayeredPane();
        searchBooksPanel = new javax.swing.JPanel();
        bookPanelHeader = new javax.swing.JLabel();
        searchBook = new javax.swing.JTextField();
        searchBookButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        booksSearchResult = new javax.swing.JTable();
        reloadButton1 = new javax.swing.JButton();
        abookPanel = new javax.swing.JPanel();
        abooPanelTitle = new javax.swing.JLabel();
        amemberNameLabel1 = new javax.swing.JLabel();
        abookTitle = new javax.swing.JTextField();
        abookISBN = new javax.swing.JTextField();
        amemberIDNumberLable1 = new javax.swing.JLabel();
        abookResetButton = new javax.swing.JButton();
        abookPublication = new javax.swing.JTextField();
        abookAddButton = new javax.swing.JButton();
        amemberPhoneNumberLabel1 = new javax.swing.JLabel();
        abook_msg = new javax.swing.JLabel();
        amemberEmailLabel1 = new javax.swing.JLabel();
        abookAuther = new javax.swing.JTextField();
        amemberEmailLabel2 = new javax.swing.JLabel();
        abookQuatity = new javax.swing.JTextField();
        abookPrice = new javax.swing.JTextField();
        amemberEmailLabel3 = new javax.swing.JLabel();
        ibookPanel = new javax.swing.JPanel();
        abooPanelTitle1 = new javax.swing.JLabel();
        amemberNameLabel2 = new javax.swing.JLabel();
        ibookMemberID = new javax.swing.JTextField();
        amemberIDNumberLable2 = new javax.swing.JLabel();
        ibookBookID = new javax.swing.JTextField();
        ibook_msg = new javax.swing.JLabel();
        ibookButton = new javax.swing.JButton();
        ibookResetButton = new javax.swing.JButton();
        ibookMemberAddress = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ibookBookIssued = new javax.swing.JLabel();
        ibookMemberDetails = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ibookMemberPhone = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ibookMemberEmail = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        rbookPanel = new javax.swing.JPanel();
        abooPanelTitle2 = new javax.swing.JLabel();
        amemberNameLabel3 = new javax.swing.JLabel();
        rbookMemberID = new javax.swing.JTextField();
        amemberIDNumberLable3 = new javax.swing.JLabel();
        rbookBookID = new javax.swing.JTextField();
        rbook_msg = new javax.swing.JLabel();
        ibookButton1 = new javax.swing.JButton();
        ibookResetButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        rbookMemberDetails = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbookMemberPhone = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbookMemberEmail = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbookMemberAddress = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rbookBookIssued = new javax.swing.JLabel();
        mbookPanel = new javax.swing.JPanel();
        mbookSearchBook = new javax.swing.JTextField();
        mbookSearchButton = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        mbookTitle = new javax.swing.JLabel();
        mmemberMsg1 = new javax.swing.JLabel();
        mbookISBN = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        mbookPrice = new javax.swing.JLabel();
        mbookDeleteButton = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        mbookQuantity = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        membersContainerPanel = new javax.swing.JPanel();
        memberPanelSidebar = new javax.swing.JPanel();
        memberPanelSidebarHeader = new javax.swing.JPanel();
        memberPanelSidebarHeaderText = new javax.swing.JLabel();
        searchMemberPanelButton = new javax.swing.JButton();
        amemberPanelButton = new javax.swing.JButton();
        mmemberPanelButton = new javax.swing.JButton();
        memberPanelContainer = new javax.swing.JLayeredPane();
        searchMemberPanel = new javax.swing.JPanel();
        mmemberPanelSearchText = new javax.swing.JLabel();
        mmemberSearchBox = new javax.swing.JTextField();
        memberSearchButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        memberSearchResult = new javax.swing.JTable();
        reloadButton = new javax.swing.JButton();
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
        aamember_msg = new javax.swing.JLabel();
        mmemberPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        searchMember = new javax.swing.JTextField();
        mlibrarianSearchButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        mmemberName = new javax.swing.JLabel();
        mmemberEmail = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        delteMemberButton = new javax.swing.JButton();
        blockMemberButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        notificationText = new javax.swing.JTextArea();
        sendNotification = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        mmemberMsg = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mmemberPhone = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mmemberPA = new javax.swing.JLabel();
        mmemberTA = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lirary Managment System");
        setName("MainWindow"); // NOI18N

        MainContainer.setBackground(new java.awt.Color(102, 102, 102));
        MainContainer.setMaximumSize(super.getSize());
        MainContainer.setPreferredSize(this.getSize());

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));

        memberContainerButton.setBackground(new java.awt.Color(255, 255, 255));
        memberContainerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/users.png"))); // NOI18N
        memberContainerButton.setToolTipText("View Members and Manage Members");
        memberContainerButton.setBorder(null);
        memberContainerButton.setFocusPainted(false);
        memberContainerButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        memberContainerButton.setIconTextGap(10);
        memberContainerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                memberContainerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                memberContainerButtonMouseExited(evt);
            }
        });
        memberContainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberContainerButtonActionPerformed(evt);
            }
        });

        booksContainerButton.setBackground(new java.awt.Color(255, 255, 255));
        booksContainerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/books.png"))); // NOI18N
        booksContainerButton.setToolTipText("View Books and Manage Books");
        booksContainerButton.setBorder(null);
        booksContainerButton.setFocusPainted(false);
        booksContainerButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        booksContainerButton.setIconTextGap(10);
        booksContainerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                booksContainerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                booksContainerButtonMouseExited(evt);
            }
        });
        booksContainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksContainerButtonActionPerformed(evt);
            }
        });

        settingsContainerButton.setBackground(new java.awt.Color(255, 255, 255));
        settingsContainerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/settings.png"))); // NOI18N
        settingsContainerButton.setToolTipText("Settings");
        settingsContainerButton.setBorder(null);
        settingsContainerButton.setFocusPainted(false);
        settingsContainerButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        settingsContainerButton.setIconTextGap(10);
        settingsContainerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsContainerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsContainerButtonMouseExited(evt);
            }
        });
        settingsContainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsContainerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(memberContainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(booksContainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(settingsContainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(memberContainerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(settingsContainerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(booksContainerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(settingsPanelSidebarHeaderText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        settingsPanelSidebarHeaderLayout.setVerticalGroup(
            settingsPanelSidebarHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsPanelSidebarHeaderText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout settingsContainerPanelLayout = new javax.swing.GroupLayout(settingsContainerPanel);
        settingsContainerPanel.setLayout(settingsContainerPanelLayout);
        settingsContainerPanelLayout.setHorizontalGroup(
            settingsContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsContainerPanelLayout.createSequentialGroup()
                .addComponent(settingsPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        settingsContainerPanelLayout.setVerticalGroup(
            settingsContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addComponent(booksPanelSidebarHeaderText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        booksPanelSidebarHeaderLayout.setVerticalGroup(
            booksPanelSidebarHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(booksPanelSidebarHeaderText, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );

        books.setBackground(new java.awt.Color(255, 255, 255));
        books.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        books.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/books.png"))); // NOI18N
        books.setText("Books");
        books.setBorderPainted(false);
        books.setFocusPainted(false);
        books.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                booksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                booksMouseExited(evt);
            }
        });
        books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksActionPerformed(evt);
            }
        });

        abook.setBackground(new java.awt.Color(255, 255, 255));
        abook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        abook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/books2.png"))); // NOI18N
        abook.setText("Add Books");
        abook.setBorderPainted(false);
        abook.setFocusPainted(false);
        abook.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        abook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abookMouseExited(evt);
            }
        });
        abook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abookActionPerformed(evt);
            }
        });

        rbooks.setBackground(new java.awt.Color(255, 255, 255));
        rbooks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/reload.png"))); // NOI18N
        rbooks.setText("Receive Books");
        rbooks.setBorderPainted(false);
        rbooks.setFocusPainted(false);
        rbooks.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbooksMouseExited(evt);
            }
        });
        rbooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbooksActionPerformed(evt);
            }
        });

        ibook.setBackground(new java.awt.Color(255, 255, 255));
        ibook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ibook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/login.png"))); // NOI18N
        ibook.setText("Issue Books");
        ibook.setBorderPainted(false);
        ibook.setFocusPainted(false);
        ibook.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ibook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ibookMouseExited(evt);
            }
        });
        ibook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibookActionPerformed(evt);
            }
        });

        mbooks.setBackground(new java.awt.Color(255, 255, 255));
        mbooks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mbooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/settings3.png"))); // NOI18N
        mbooks.setText("Manage Books");
        mbooks.setBorderPainted(false);
        mbooks.setFocusPainted(false);
        mbooks.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mbooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mbooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mbooksMouseExited(evt);
            }
        });
        mbooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbooksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout booksPanelSidebarLayout = new javax.swing.GroupLayout(booksPanelSidebar);
        booksPanelSidebar.setLayout(booksPanelSidebarLayout);
        booksPanelSidebarLayout.setHorizontalGroup(
            booksPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(booksPanelSidebarHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(books, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(abook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rbooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ibook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mbooks, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        booksPanelSidebarLayout.setVerticalGroup(
            booksPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(booksPanelSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(booksPanelSidebarHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(books, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ibook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(abook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 251, Short.MAX_VALUE))
        );

        bookPanelHeader.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        bookPanelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookPanelHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/book.png"))); // NOI18N
        bookPanelHeader.setText("Search for book");
        bookPanelHeader.setMinimumSize(new java.awt.Dimension(100, 40));

        searchBook.setToolTipText("Enter member ID");
        searchBook.setMaximumSize(new java.awt.Dimension(600, 28));
        searchBook.setMinimumSize(new java.awt.Dimension(300, 28));
        searchBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBookKeyReleased(evt);
            }
        });

        searchBookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/search.png"))); // NOI18N
        searchBookButton.setBorder(null);
        searchBookButton.setBorderPainted(false);
        searchBookButton.setContentAreaFilled(false);
        searchBookButton.setFocusPainted(false);
        searchBookButton.setMaximumSize(new java.awt.Dimension(30, 30));
        searchBookButton.setMinimumSize(new java.awt.Dimension(30, 30));
        searchBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookButtonActionPerformed(evt);
            }
        });

        booksSearchResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book Title", "ISBN", "Author", "Available", "Total Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(booksSearchResult);

        reloadButton1.setBackground(new java.awt.Color(240, 240, 239));
        reloadButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/reload.png"))); // NOI18N
        reloadButton1.setBorderPainted(false);
        reloadButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reloadButton1.setFocusPainted(false);

        javax.swing.GroupLayout searchBooksPanelLayout = new javax.swing.GroupLayout(searchBooksPanel);
        searchBooksPanel.setLayout(searchBooksPanelLayout);
        searchBooksPanelLayout.setHorizontalGroup(
            searchBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchBooksPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(searchBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(searchBooksPanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(searchBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(searchBooksPanelLayout.createSequentialGroup()
                                .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185)
                                .addComponent(searchBook, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(searchBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(197, 197, 197))))))
        );
        searchBooksPanelLayout.setVerticalGroup(
            searchBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchBooksPanelLayout.createSequentialGroup()
                .addComponent(bookPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(searchBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reloadButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(searchBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        abooPanelTitle.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        abooPanelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abooPanelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/book.png"))); // NOI18N
        abooPanelTitle.setText("Add a new book");
        abooPanelTitle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        amemberNameLabel1.setText("Book Title");

        abookTitle.setMaximumSize(new java.awt.Dimension(600, 24));

        abookISBN.setMaximumSize(new java.awt.Dimension(600, 24));

        amemberIDNumberLable1.setText("ISBN Number");

        abookResetButton.setBackground(new java.awt.Color(240, 240, 239));
        abookResetButton.setText("Reset");
        abookResetButton.setFocusPainted(false);

        abookPublication.setMaximumSize(new java.awt.Dimension(600, 24));

        abookAddButton.setBackground(new java.awt.Color(240, 240, 239));
        abookAddButton.setText("Add");
        abookAddButton.setFocusPainted(false);
        abookAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abookAddButtonActionPerformed(evt);
            }
        });

        amemberPhoneNumberLabel1.setText("Publication");

        amemberEmailLabel1.setText("Author Name");

        abookAuther.setMaximumSize(new java.awt.Dimension(600, 24));

        amemberEmailLabel2.setText("Quatity");

        abookQuatity.setMaximumSize(new java.awt.Dimension(600, 24));

        abookPrice.setMaximumSize(new java.awt.Dimension(600, 24));

        amemberEmailLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amemberEmailLabel3.setText("Price");

        javax.swing.GroupLayout abookPanelLayout = new javax.swing.GroupLayout(abookPanel);
        abookPanel.setLayout(abookPanelLayout);
        abookPanelLayout.setHorizontalGroup(
            abookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abookPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(abookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amemberEmailLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amemberPhoneNumberLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amemberIDNumberLable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amemberNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amemberEmailLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(abookPanelLayout.createSequentialGroup()
                        .addComponent(abook_msg, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abookAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abookResetButton))
                    .addComponent(abookAuther, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abookPublication, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abookISBN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abookTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, abookPanelLayout.createSequentialGroup()
                        .addComponent(abookQuatity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(amemberEmailLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(abookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
            .addComponent(abooPanelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        abookPanelLayout.setVerticalGroup(
            abookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abookPanelLayout.createSequentialGroup()
                .addComponent(abooPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(abookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberIDNumberLable1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abookISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberPhoneNumberLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abookPublication, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberEmailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abookAuther, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberEmailLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abookQuatity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amemberEmailLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abookResetButton)
                    .addComponent(abookAddButton)
                    .addComponent(abook_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 215, Short.MAX_VALUE))
        );

        abooPanelTitle1.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        abooPanelTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abooPanelTitle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/book.png"))); // NOI18N
        abooPanelTitle1.setText("Issue Books");
        abooPanelTitle1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        amemberNameLabel2.setText("Member ID");

        ibookMemberID.setMaximumSize(new java.awt.Dimension(600, 24));

        amemberIDNumberLable2.setText("Book(s) ID");

        ibookBookID.setMaximumSize(new java.awt.Dimension(600, 24));

        ibookButton.setBackground(new java.awt.Color(240, 240, 239));
        ibookButton.setText("OK");
        ibookButton.setEnabled(false);
        ibookButton.setFocusPainted(false);
        ibookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibookButtonActionPerformed(evt);
            }
        });

        ibookResetButton.setBackground(new java.awt.Color(240, 240, 239));
        ibookResetButton.setText("Reset");
        ibookResetButton.setFocusPainted(false);

        jLabel15.setText("Books issued");

        ibookMemberDetails.setFont(new java.awt.Font("Source Sans Pro Light", 0, 18)); // NOI18N
        ibookMemberDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ibookMemberDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/id.png"))); // NOI18N
        ibookMemberDetails.setText("Member Details");

        jLabel16.setText("Phone");

        jLabel17.setText("Email");

        jLabel18.setText("Address");

        javax.swing.GroupLayout ibookPanelLayout = new javax.swing.GroupLayout(ibookPanel);
        ibookPanel.setLayout(ibookPanelLayout);
        ibookPanelLayout.setHorizontalGroup(
            ibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abooPanelTitle1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator5)
            .addComponent(ibookMemberDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ibookPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(ibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ibookPanelLayout.createSequentialGroup()
                        .addGroup(ibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amemberIDNumberLable2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amemberNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ibookPanelLayout.createSequentialGroup()
                                .addComponent(ibook_msg, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ibookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ibookResetButton))
                            .addComponent(ibookBookID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ibookMemberID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ibookPanelLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ibookMemberPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ibookPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ibookMemberEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ibookPanelLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ibookMemberAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ibookPanelLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ibookBookIssued, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(100, 100, 100))
        );
        ibookPanelLayout.setVerticalGroup(
            ibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ibookPanelLayout.createSequentialGroup()
                .addComponent(abooPanelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(ibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ibookMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberIDNumberLable2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ibookBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ibookResetButton)
                    .addComponent(ibookButton)
                    .addComponent(ibook_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ibookMemberDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ibookMemberPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ibookMemberEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ibookMemberAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ibookBookIssued, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        abooPanelTitle2.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        abooPanelTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abooPanelTitle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/book.png"))); // NOI18N
        abooPanelTitle2.setText("Return Books");
        abooPanelTitle2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        amemberNameLabel3.setText("Member ID");

        rbookMemberID.setMaximumSize(new java.awt.Dimension(600, 24));

        amemberIDNumberLable3.setText("Book(s) ID");

        rbookBookID.setMaximumSize(new java.awt.Dimension(600, 24));

        ibookButton1.setBackground(new java.awt.Color(240, 240, 239));
        ibookButton1.setText("Receive");
        ibookButton1.setFocusPainted(false);
        ibookButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibookButton1ActionPerformed(evt);
            }
        });

        ibookResetButton1.setBackground(new java.awt.Color(240, 240, 239));
        ibookResetButton1.setText("Reset");
        ibookResetButton1.setFocusPainted(false);

        rbookMemberDetails.setFont(new java.awt.Font("Source Sans Pro Light", 0, 18)); // NOI18N
        rbookMemberDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbookMemberDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/id.png"))); // NOI18N
        rbookMemberDetails.setText("Member Details");

        jLabel4.setText("Phone");

        jLabel5.setText("Email");

        jLabel6.setText("Address");

        jLabel14.setText("Books issued");

        javax.swing.GroupLayout rbookPanelLayout = new javax.swing.GroupLayout(rbookPanel);
        rbookPanel.setLayout(rbookPanelLayout);
        rbookPanelLayout.setHorizontalGroup(
            rbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abooPanelTitle2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(rbookMemberDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(rbookPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(rbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rbookPanelLayout.createSequentialGroup()
                        .addGroup(rbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amemberIDNumberLable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amemberNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(rbookPanelLayout.createSequentialGroup()
                                .addComponent(rbook_msg, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ibookButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ibookResetButton1))
                            .addComponent(rbookBookID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbookMemberID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(rbookPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbookMemberPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(rbookPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbookMemberEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(rbookPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbookMemberAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(rbookPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbookBookIssued, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(100, 100, 100))
        );
        rbookPanelLayout.setVerticalGroup(
            rbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rbookPanelLayout.createSequentialGroup()
                .addComponent(abooPanelTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(rbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbookMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amemberIDNumberLable3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbookBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ibookResetButton1)
                    .addComponent(ibookButton1)
                    .addComponent(rbook_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbookMemberDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(rbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbookMemberPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbookMemberEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbookMemberAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbookBookIssued, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        mbookSearchBook.setMaximumSize(new java.awt.Dimension(150, 30));
        mbookSearchBook.setMinimumSize(new java.awt.Dimension(100, 30));
        mbookSearchBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mbookSearchBookKeyReleased(evt);
            }
        });

        mbookSearchButton.setBackground(new java.awt.Color(240, 240, 239));
        mbookSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/search.png"))); // NOI18N
        mbookSearchButton.setBorderPainted(false);
        mbookSearchButton.setFocusPainted(false);
        mbookSearchButton.setMaximumSize(new java.awt.Dimension(31, 31));
        mbookSearchButton.setMinimumSize(new java.awt.Dimension(30, 30));
        mbookSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbookSearchButtonActionPerformed(evt);
            }
        });

        jLabel19.setText("Title");

        mbookTitle.setForeground(new java.awt.Color(0, 102, 102));

        mbookISBN.setForeground(new java.awt.Color(0, 102, 102));
        mbookISBN.setMaximumSize(new java.awt.Dimension(600, 30));
        mbookISBN.setMinimumSize(new java.awt.Dimension(300, 30));

        jLabel20.setText("Price");

        jLabel21.setText("ISBN");

        mbookPrice.setForeground(new java.awt.Color(0, 102, 102));
        mbookPrice.setMaximumSize(new java.awt.Dimension(600, 30));
        mbookPrice.setMinimumSize(new java.awt.Dimension(300, 30));

        mbookDeleteButton.setBackground(new java.awt.Color(240, 240, 239));
        mbookDeleteButton.setText("delete");
        mbookDeleteButton.setEnabled(false);
        mbookDeleteButton.setFocusPainted(false);
        mbookDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbookDeleteButtonActionPerformed(evt);
            }
        });

        jLabel22.setText("Quantity");

        mbookQuantity.setForeground(new java.awt.Color(0, 102, 102));
        mbookQuantity.setMaximumSize(new java.awt.Dimension(600, 30));
        mbookQuantity.setMinimumSize(new java.awt.Dimension(300, 30));

        jLabel23.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/settings3.png"))); // NOI18N
        jLabel23.setText("Manage Book");
        jLabel23.setMaximumSize(super.getSize());
        jLabel23.setMinimumSize(super.getSize());
        jLabel23.setPreferredSize(MainContainer.getPreferredSize());

        jLabel24.setText("Book ID");
        jLabel24.setMaximumSize(new java.awt.Dimension(150, 28));
        jLabel24.setMinimumSize(new java.awt.Dimension(80, 28));

        javax.swing.GroupLayout mbookPanelLayout = new javax.swing.GroupLayout(mbookPanel);
        mbookPanel.setLayout(mbookPanelLayout);
        mbookPanelLayout.setHorizontalGroup(
            mbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
            .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
            .addGroup(mbookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mbookPanelLayout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mbookSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(mbookSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mmemberMsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(mbookPanelLayout.createSequentialGroup()
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mbookISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mbookPanelLayout.createSequentialGroup()
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mbookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mbookPanelLayout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mbookPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(mbookPanelLayout.createSequentialGroup()
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mbookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mbookDeleteButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mbookPanelLayout.setVerticalGroup(
            mbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mbookPanelLayout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mbookSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mbookSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mmemberMsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mbookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mbookISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mbookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mbookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mbookDeleteButton)
                .addGap(0, 234, Short.MAX_VALUE))
        );

        booksContainer.setLayer(searchBooksPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        booksContainer.setLayer(abookPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        booksContainer.setLayer(ibookPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        booksContainer.setLayer(rbookPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        booksContainer.setLayer(mbookPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout booksContainerLayout = new javax.swing.GroupLayout(booksContainer);
        booksContainer.setLayout(booksContainerLayout);
        booksContainerLayout.setHorizontalGroup(
            booksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(booksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(searchBooksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(booksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(abookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(booksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ibookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(booksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mbookPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        booksContainerLayout.setVerticalGroup(
            booksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbookPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(booksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(searchBooksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(booksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(abookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(booksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ibookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(booksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mbookPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout booksContanerPanelLayout = new javax.swing.GroupLayout(booksContanerPanel);
        booksContanerPanel.setLayout(booksContanerPanelLayout);
        booksContanerPanelLayout.setHorizontalGroup(
            booksContanerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(booksContanerPanelLayout.createSequentialGroup()
                .addComponent(booksPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(booksContainer))
        );
        booksContanerPanelLayout.setVerticalGroup(
            booksContanerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(booksPanelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(booksContainer)
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

        searchMemberPanelButton.setBackground(new java.awt.Color(255, 255, 255));
        searchMemberPanelButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchMemberPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/users.png"))); // NOI18N
        searchMemberPanelButton.setText("Members");
        searchMemberPanelButton.setBorderPainted(false);
        searchMemberPanelButton.setFocusPainted(false);
        searchMemberPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        searchMemberPanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMemberPanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMemberPanelButtonMouseExited(evt);
            }
        });
        searchMemberPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMemberPanelButtonActionPerformed(evt);
            }
        });

        amemberPanelButton.setBackground(new java.awt.Color(255, 255, 255));
        amemberPanelButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amemberPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/addUser.png"))); // NOI18N
        amemberPanelButton.setText("Add a new member");
        amemberPanelButton.setBorderPainted(false);
        amemberPanelButton.setFocusPainted(false);
        amemberPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        amemberPanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                amemberPanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                amemberPanelButtonMouseExited(evt);
            }
        });
        amemberPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amemberPanelButtonActionPerformed(evt);
            }
        });

        mmemberPanelButton.setBackground(new java.awt.Color(255, 255, 255));
        mmemberPanelButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mmemberPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/settings3.png"))); // NOI18N
        mmemberPanelButton.setText("Manage Member");
        mmemberPanelButton.setBorderPainted(false);
        mmemberPanelButton.setFocusPainted(false);
        mmemberPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mmemberPanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mmemberPanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mmemberPanelButtonMouseExited(evt);
            }
        });
        mmemberPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmemberPanelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout memberPanelSidebarLayout = new javax.swing.GroupLayout(memberPanelSidebar);
        memberPanelSidebar.setLayout(memberPanelSidebarLayout);
        memberPanelSidebarLayout.setHorizontalGroup(
            memberPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(memberPanelSidebarHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(searchMemberPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(amemberPanelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(mmemberPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        memberPanelSidebarLayout.setVerticalGroup(
            memberPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberPanelSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(memberPanelSidebarHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchMemberPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(mmemberPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amemberPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        memberPanelContainer.setPreferredSize(super.getSize());

        mmemberPanelSearchText.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        mmemberPanelSearchText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mmemberPanelSearchText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/user.png"))); // NOI18N
        mmemberPanelSearchText.setText("Search for member");
        mmemberPanelSearchText.setMinimumSize(new java.awt.Dimension(100, 40));

        mmemberSearchBox.setToolTipText("Enter member ID");
        mmemberSearchBox.setMaximumSize(new java.awt.Dimension(600, 28));
        mmemberSearchBox.setMinimumSize(new java.awt.Dimension(300, 28));
        mmemberSearchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mmemberSearchBoxKeyReleased(evt);
            }
        });

        memberSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/16x16/search.png"))); // NOI18N
        memberSearchButton.setBorder(null);
        memberSearchButton.setBorderPainted(false);
        memberSearchButton.setContentAreaFilled(false);
        memberSearchButton.setFocusPainted(false);
        memberSearchButton.setMaximumSize(new java.awt.Dimension(30, 30));
        memberSearchButton.setMinimumSize(new java.awt.Dimension(30, 30));
        memberSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberSearchButtonActionPerformed(evt);
            }
        });

        memberSearchResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Phone", "Address", "Due_books"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(memberSearchResult);

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

        javax.swing.GroupLayout searchMemberPanelLayout = new javax.swing.GroupLayout(searchMemberPanel);
        searchMemberPanel.setLayout(searchMemberPanelLayout);
        searchMemberPanelLayout.setHorizontalGroup(
            searchMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mmemberPanelSearchText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(searchMemberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchMemberPanelLayout.createSequentialGroup()
                        .addComponent(reloadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(mmemberSearchBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(memberSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))
                    .addGroup(searchMemberPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        searchMemberPanelLayout.setVerticalGroup(
            searchMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchMemberPanelLayout.createSequentialGroup()
                .addComponent(mmemberPanelSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(searchMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reloadButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(mmemberSearchBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
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
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout amemberPanelLayout = new javax.swing.GroupLayout(amemberPanel);
        amemberPanel.setLayout(amemberPanelLayout);
        amemberPanelLayout.setHorizontalGroup(
            amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amemberPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amemberTempAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(amemberPmtAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(amemberEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(amemberPhoneNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(amemberIDNumberLable, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(amemberNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(amemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(amemberPanelLayout.createSequentialGroup()
                        .addComponent(aamember_msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton))
                    .addComponent(amemberEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amemberPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amemberIDNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addComponent(amemberName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
            .addComponent(amemberPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        amemberPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, resetButton});

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
                    .addComponent(addButton)
                    .addComponent(aamember_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        amemberPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {amemberEmailLabel, amemberIDNumberLable, amemberNameLabel, amemberPhoneNumberLabel, amemberPmtAddressLabel, amemberTempAddressLabel});

        mmemberPanel.setBackground(new java.awt.Color(240, 240, 239));
        mmemberPanel.setMaximumSize(MainContainer.getPreferredSize());
        mmemberPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mmemberPanelMouseEntered(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/icons/40x40/settings3.png"))); // NOI18N
        jLabel3.setText("Manage Member");
        jLabel3.setMaximumSize(super.getSize());
        jLabel3.setMinimumSize(super.getSize());
        jLabel3.setPreferredSize(MainContainer.getPreferredSize());

        jLabel7.setText("Member ID");
        jLabel7.setMaximumSize(new java.awt.Dimension(150, 28));
        jLabel7.setMinimumSize(new java.awt.Dimension(80, 28));

        searchMember.setMaximumSize(new java.awt.Dimension(150, 30));
        searchMember.setMinimumSize(new java.awt.Dimension(100, 30));
        searchMember.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchMemberKeyReleased(evt);
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

        mmemberName.setForeground(new java.awt.Color(0, 102, 102));

        mmemberEmail.setForeground(new java.awt.Color(0, 102, 102));
        mmemberEmail.setMaximumSize(new java.awt.Dimension(600, 30));
        mmemberEmail.setMinimumSize(new java.awt.Dimension(300, 30));

        jLabel9.setText("Email");

        delteMemberButton.setBackground(new java.awt.Color(240, 240, 239));
        delteMemberButton.setText("delete");
        delteMemberButton.setEnabled(false);
        delteMemberButton.setFocusPainted(false);
        delteMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delteMemberButtonActionPerformed(evt);
            }
        });

        blockMemberButton.setBackground(new java.awt.Color(240, 240, 239));
        blockMemberButton.setText("block");
        blockMemberButton.setEnabled(false);
        blockMemberButton.setFocusPainted(false);
        blockMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockMemberButtonActionPerformed(evt);
            }
        });

        notificationText.setColumns(20);
        notificationText.setRows(5);
        notificationText.setMaximumSize(new java.awt.Dimension(600, 60));
        notificationText.setMinimumSize(new java.awt.Dimension(300, 60));
        jScrollPane4.setViewportView(notificationText);

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

        jLabel11.setText("Phone");

        mmemberPhone.setForeground(new java.awt.Color(0, 102, 102));
        mmemberPhone.setMaximumSize(new java.awt.Dimension(600, 30));
        mmemberPhone.setMinimumSize(new java.awt.Dimension(300, 30));

        jLabel12.setText("Permanent Adrs");

        mmemberPA.setForeground(new java.awt.Color(0, 102, 102));
        mmemberPA.setMaximumSize(new java.awt.Dimension(600, 30));
        mmemberPA.setMinimumSize(new java.awt.Dimension(300, 30));

        mmemberTA.setForeground(new java.awt.Color(0, 102, 102));
        mmemberTA.setMaximumSize(new java.awt.Dimension(600, 30));
        mmemberTA.setMinimumSize(new java.awt.Dimension(300, 30));

        jLabel13.setText("Temporary Adrs");

        javax.swing.GroupLayout mmemberPanelLayout = new javax.swing.GroupLayout(mmemberPanel);
        mmemberPanel.setLayout(mmemberPanelLayout);
        mmemberPanelLayout.setHorizontalGroup(
            mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mmemberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)
                    .addGroup(mmemberPanelLayout.createSequentialGroup()
                        .addGroup(mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mmemberPanelLayout.createSequentialGroup()
                                .addComponent(blockMemberButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delteMemberButton))
                            .addGroup(mmemberPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchMember, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(mlibrarianSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mmemberMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sendNotification)
                            .addGroup(mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(mmemberPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mmemberEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mmemberPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mmemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(mmemberPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mmemberPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(mmemberPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mmemberPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(mmemberPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mmemberTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(mmemberPanelLayout.createSequentialGroup()
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jSeparator4))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mmemberPanelLayout.setVerticalGroup(
            mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mmemberPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchMember, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mlibrarianSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mmemberMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(mmemberName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(mmemberEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(mmemberPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(mmemberPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(mmemberTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delteMemberButton)
                    .addComponent(blockMemberButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendNotification)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        memberPanelContainer.setLayer(searchMemberPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        memberPanelContainer.setLayer(amemberPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        memberPanelContainer.setLayer(mmemberPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout memberPanelContainerLayout = new javax.swing.GroupLayout(memberPanelContainer);
        memberPanelContainer.setLayout(memberPanelContainerLayout);
        memberPanelContainerLayout.setHorizontalGroup(
            memberPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchMemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(memberPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(amemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(memberPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mmemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        memberPanelContainerLayout.setVerticalGroup(
            memberPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchMemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(memberPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(amemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(memberPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mmemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout membersContainerPanelLayout = new javax.swing.GroupLayout(membersContainerPanel);
        membersContainerPanel.setLayout(membersContainerPanelLayout);
        membersContainerPanelLayout.setHorizontalGroup(
            membersContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(membersContainerPanelLayout.createSequentialGroup()
                .addComponent(memberPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(memberPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE))
        );
        membersContainerPanelLayout.setVerticalGroup(
            membersContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(memberPanelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(memberPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );

        layerContainer.setLayer(settingsContainerPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerContainer.setLayer(booksContanerPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerContainer.setLayer(membersContainerPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layerContainerLayout = new javax.swing.GroupLayout(layerContainer);
        layerContainer.setLayout(layerContainerLayout);
        layerContainerLayout.setHorizontalGroup(
            layerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(booksContanerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(membersContainerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layerContainerLayout.setVerticalGroup(
            layerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(booksContanerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(membersContainerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainContainerLayout = new javax.swing.GroupLayout(MainContainer);
        MainContainer.setLayout(MainContainerLayout);
        MainContainerLayout.setHorizontalGroup(
            MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layerContainer)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(MainContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 1223, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1239, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void settingsContainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsContainerButtonActionPerformed
        ContainerVisiblity(false);
        this.settingsContainerPanel.setVisible(true);
    }//GEN-LAST:event_settingsContainerButtonActionPerformed

    private void settingsContainerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsContainerButtonMouseExited
        settingsContainerButton.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_settingsContainerButtonMouseExited

    private void settingsContainerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsContainerButtonMouseEntered
        settingsContainerButton.setBackground(java.awt.Color.lightGray);
    }//GEN-LAST:event_settingsContainerButtonMouseEntered

    private void booksContainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksContainerButtonActionPerformed
        ContainerVisiblity(false);
        this.booksContanerPanel.setVisible(true);
    }//GEN-LAST:event_booksContainerButtonActionPerformed

    private void booksContainerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksContainerButtonMouseExited
        booksContainerButton.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_booksContainerButtonMouseExited

    private void booksContainerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksContainerButtonMouseEntered
        booksContainerButton.setBackground(java.awt.Color.lightGray);
    }//GEN-LAST:event_booksContainerButtonMouseEntered

    private void memberContainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberContainerButtonActionPerformed
        ContainerVisiblity(false);
        this.membersContainerPanel.setVisible(true);
    }//GEN-LAST:event_memberContainerButtonActionPerformed

    private void memberContainerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberContainerButtonMouseExited
        memberContainerButton.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_memberContainerButtonMouseExited

    private void memberContainerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberContainerButtonMouseEntered
        memberContainerButton.setBackground(java.awt.Color.lightGray);
    }//GEN-LAST:event_memberContainerButtonMouseEntered

    private void searchMemberPanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMemberPanelButtonMouseEntered
        searchMemberPanelButton.setBackground(java.awt.Color.cyan);
    }//GEN-LAST:event_searchMemberPanelButtonMouseEntered

    private void searchMemberPanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMemberPanelButtonMouseExited
        searchMemberPanelButton.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_searchMemberPanelButtonMouseExited

    private void amemberPanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amemberPanelButtonMouseEntered
        amemberPanelButton.setBackground(java.awt.Color.cyan);
    }//GEN-LAST:event_amemberPanelButtonMouseEntered

    private void amemberPanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amemberPanelButtonMouseExited
        amemberPanelButton.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_amemberPanelButtonMouseExited

    private void searchMemberPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMemberPanelButtonActionPerformed
        PanelVisiblity(false);
        this.searchMemberPanel.setVisible(true);
    }//GEN-LAST:event_searchMemberPanelButtonActionPerformed

    private void amemberPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amemberPanelButtonActionPerformed
        PanelVisiblity(false);
        this.amemberPanel.setVisible(true);
    }//GEN-LAST:event_amemberPanelButtonActionPerformed

    private void booksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksMouseEntered
        books.setBackground(java.awt.Color.cyan);
    }//GEN-LAST:event_booksMouseEntered

    private void booksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksMouseExited
        books.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_booksMouseExited

    private void abookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abookMouseEntered
        abook.setBackground(java.awt.Color.cyan);
    }//GEN-LAST:event_abookMouseEntered

    private void abookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abookMouseExited
        abook.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_abookMouseExited

    private void mmemberPanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmemberPanelButtonMouseEntered
        mmemberPanelButton.setBackground(Color.cyan);
    }//GEN-LAST:event_mmemberPanelButtonMouseEntered

    private void mmemberPanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmemberPanelButtonMouseExited
        mmemberPanelButton.setBackground(Color.white);
    }//GEN-LAST:event_mmemberPanelButtonMouseExited

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String name, id, phone, email, taddrs, paddrs, addedBy;
        name = this.amemberName.getText();
        id = this.amemberIDNumber.getText();
        phone = this.amemberPhoneNumber.getText();
        email = this.amemberEmail.getText();
        taddrs = this.amemberTempAddress.getText();
        paddrs = this.amemberPmtAddress.getText();
        addedBy = this.db.GetSessionValue("staffID");
        
        int rs = this.db.insertData("member", "(memberID, name, phone, email, p_address, t_address, booksBorrowed, addedBy) VALUES('"
                +id+ "','"
                +name+ "','"
                +phone+ "','"
                +email+ "','"
                +paddrs+ "','"
                +taddrs+ "',null, '"
                +addedBy+ "')");
        if(rs != 0){
            this.aamember_msg.setForeground(Color.green);
            this.aamember_msg.setText("Member added successfully");
            memberTableRender(this.db.getRows("member"));
        }else{
            this.aamember_msg.setForeground(Color.red);
            this.aamember_msg.setText("Faild add member.");            
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void searchMemberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchMemberKeyReleased
        this.delteMemberButton.setEnabled(false);
        this.sendNotification.setEnabled(false);
        this.blockMemberButton.setEnabled(false);
    }//GEN-LAST:event_searchMemberKeyReleased

    private void mlibrarianSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlibrarianSearchButtonActionPerformed
        String sid = this.searchMember.getText();
        if(sid.length() != 0){
            try {
                ResultSet rs = this.db.getValueWhere("member", "*", "memberID='"+sid+"'");
                if(rs.next()){
                    this.mmemberName.setText(rs.getString("name"));
                    this.mmemberEmail.setText(rs.getString("email"));
                    this.mmemberPhone.setText(rs.getString("phone"));
                    this.mmemberPA.setText(rs.getString("p_address"));
                    this.mmemberTA.setText(rs.getString("t_address"));
                    this.delteMemberButton.setEnabled(true);
                    this.sendNotification.setEnabled(true);
                    if(rs.getString("isBlocked").equals("1")) this.blockMemberButton.setText("unblock");
                    else this.blockMemberButton.setText("block");
                    this.blockMemberButton.setEnabled(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mlibrarianSearchButtonActionPerformed

    private void delteMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delteMemberButtonActionPerformed
        if(this.db.deleteRow("member", "memberID='"+this.searchMember.getText()+"'") != 0){
            this.mmemberMsg.setForeground(Color.green);
            this.mmemberMsg.setText("Member deleted!");
            memberTableRender(this.db.getRows("member"));
        }
        else{
            this.mmemberMsg.setForeground(Color.red);
            this.mmemberMsg.setText("Failed to delete member!");
        }
    }//GEN-LAST:event_delteMemberButtonActionPerformed

    private void blockMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockMemberButtonActionPerformed
        if(this.db.updateData("member", "isBlocked=true", "memberID='"+this.searchMember.getText()+"'") != 0){
            this.mmemberMsg.setForeground(Color.green);
            this.mmemberMsg.setText("member blocked!");
            memberTableRender(this.db.getRows("member"));
        }else{
            this.mmemberMsg.setForeground(Color.red);
            this.mmemberMsg.setText("Failed to block member!");
        }
    }//GEN-LAST:event_blockMemberButtonActionPerformed

    private void sendNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendNotificationActionPerformed
        if(this.db.updateData("librarian", "msg='"+this.notificationText.getText()+"'", "staffID='"+this.searchMember.getText()+"'") != 0){
            this.mmemberMsg.setForeground(Color.green);
            this.mmemberMsg.setText("Message sent!");
        }else{
            this.mmemberMsg.setForeground(Color.red);
            this.mmemberMsg.setText("Failed to send message!");
        }
    }//GEN-LAST:event_sendNotificationActionPerformed

    private void mmemberPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmemberPanelMouseEntered
        this.mmemberMsg.setText("");
    }//GEN-LAST:event_mmemberPanelMouseEntered

    private void mmemberPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmemberPanelButtonActionPerformed
        PanelVisiblity(false);
        this.mmemberPanel.setVisible(true);
    }//GEN-LAST:event_mmemberPanelButtonActionPerformed

    private void memberSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberSearchButtonActionPerformed
        memberTableRender(this.db.getRows("member", "name LIKE '%"+this.mmemberSearchBox.getText()+"%'"));
    }//GEN-LAST:event_memberSearchButtonActionPerformed

    private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
        memberTableRender(this.db.getRows("member"));
    }//GEN-LAST:event_reloadButtonActionPerformed

    private void mmemberSearchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mmemberSearchBoxKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) this.memberSearchButtonActionPerformed(null);
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            this.mmemberSearchBox.setText("");
            this.reloadButtonActionPerformed(null);
        }
    }//GEN-LAST:event_mmemberSearchBoxKeyReleased

    private void rbooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbooksMouseEntered
        this.rbooks.setBackground(Color.cyan);
    }//GEN-LAST:event_rbooksMouseEntered

    private void rbooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbooksMouseExited
        this.rbooks.setBackground(Color.white);
    }//GEN-LAST:event_rbooksMouseExited

    private void ibookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibookMouseEntered
        this.ibook.setBackground(Color.cyan);
    }//GEN-LAST:event_ibookMouseEntered

    private void ibookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibookMouseExited
        this.ibook.setBackground(Color.white);
    }//GEN-LAST:event_ibookMouseExited

    private void mbooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbooksMouseEntered
        this.mbooks.setBackground(Color.cyan);
    }//GEN-LAST:event_mbooksMouseEntered

    private void mbooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbooksMouseExited
        this.mbooks.setBackground(Color.white);
    }//GEN-LAST:event_mbooksMouseExited

    private void mbooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbooksActionPerformed
        PanelVisiblity(false);
        this.mbookPanel.setVisible(true);
    }//GEN-LAST:event_mbooksActionPerformed

    private void searchBookKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBookKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBookKeyReleased

    private void searchBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBookButtonActionPerformed

    private void abookAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abookAddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abookAddButtonActionPerformed

    private void ibookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibookButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ibookButtonActionPerformed

    private void ibookButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibookButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ibookButton1ActionPerformed

    private void mbookSearchBookKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mbookSearchBookKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_mbookSearchBookKeyReleased

    private void mbookSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbookSearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbookSearchButtonActionPerformed

    private void mbookDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbookDeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbookDeleteButtonActionPerformed

    private void booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksActionPerformed
        PanelVisiblity(false);
        this.searchBooksPanel.setVisible(true);
    }//GEN-LAST:event_booksActionPerformed

    private void ibookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibookActionPerformed
        PanelVisiblity(false);
        this.ibookPanel.setVisible(true);
    }//GEN-LAST:event_ibookActionPerformed

    private void rbooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbooksActionPerformed
        PanelVisiblity(false);
        this.rbookPanel.setVisible(true);
    }//GEN-LAST:event_rbooksActionPerformed

    private void abookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abookActionPerformed
        PanelVisiblity(false);
        this.abookPanel.setVisible(true);
    }//GEN-LAST:event_abookActionPerformed

    public void GetSession(ResultSet rs){
        this.db.SessionStart(rs);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainContainer;
    private javax.swing.JLabel aamember_msg;
    private javax.swing.JLabel abooPanelTitle;
    private javax.swing.JLabel abooPanelTitle1;
    private javax.swing.JLabel abooPanelTitle2;
    private javax.swing.JButton abook;
    private javax.swing.JButton abookAddButton;
    private javax.swing.JTextField abookAuther;
    private javax.swing.JTextField abookISBN;
    private javax.swing.JPanel abookPanel;
    private javax.swing.JTextField abookPrice;
    private javax.swing.JTextField abookPublication;
    private javax.swing.JTextField abookQuatity;
    private javax.swing.JButton abookResetButton;
    private javax.swing.JTextField abookTitle;
    private javax.swing.JLabel abook_msg;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField amemberEmail;
    private javax.swing.JLabel amemberEmailLabel;
    private javax.swing.JLabel amemberEmailLabel1;
    private javax.swing.JLabel amemberEmailLabel2;
    private javax.swing.JLabel amemberEmailLabel3;
    private javax.swing.JTextField amemberIDNumber;
    private javax.swing.JLabel amemberIDNumberLable;
    private javax.swing.JLabel amemberIDNumberLable1;
    private javax.swing.JLabel amemberIDNumberLable2;
    private javax.swing.JLabel amemberIDNumberLable3;
    private javax.swing.JTextField amemberName;
    private javax.swing.JLabel amemberNameLabel;
    private javax.swing.JLabel amemberNameLabel1;
    private javax.swing.JLabel amemberNameLabel2;
    private javax.swing.JLabel amemberNameLabel3;
    private javax.swing.JPanel amemberPanel;
    private javax.swing.JButton amemberPanelButton;
    private javax.swing.JLabel amemberPanelTitle;
    private javax.swing.JTextField amemberPhoneNumber;
    private javax.swing.JLabel amemberPhoneNumberLabel;
    private javax.swing.JLabel amemberPhoneNumberLabel1;
    private javax.swing.JTextArea amemberPmtAddress;
    private javax.swing.JLabel amemberPmtAddressLabel;
    private javax.swing.JTextArea amemberTempAddress;
    private javax.swing.JLabel amemberTempAddressLabel;
    private javax.swing.JButton blockMemberButton;
    private javax.swing.JLabel bookPanelHeader;
    private javax.swing.JButton books;
    private javax.swing.JLayeredPane booksContainer;
    private javax.swing.JButton booksContainerButton;
    public javax.swing.JPanel booksContanerPanel;
    private javax.swing.JPanel booksPanelSidebar;
    private javax.swing.JPanel booksPanelSidebarHeader;
    private javax.swing.JLabel booksPanelSidebarHeaderText;
    private javax.swing.JTable booksSearchResult;
    private javax.swing.JButton delteMemberButton;
    private javax.swing.JButton ibook;
    private javax.swing.JTextField ibookBookID;
    private javax.swing.JLabel ibookBookIssued;
    private javax.swing.JButton ibookButton;
    private javax.swing.JButton ibookButton1;
    private javax.swing.JLabel ibookMemberAddress;
    private javax.swing.JLabel ibookMemberDetails;
    private javax.swing.JLabel ibookMemberEmail;
    private javax.swing.JTextField ibookMemberID;
    private javax.swing.JLabel ibookMemberPhone;
    private javax.swing.JPanel ibookPanel;
    private javax.swing.JButton ibookResetButton;
    private javax.swing.JButton ibookResetButton1;
    private javax.swing.JLabel ibook_msg;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLayeredPane layerContainer;
    private javax.swing.JButton mbookDeleteButton;
    private javax.swing.JLabel mbookISBN;
    private javax.swing.JPanel mbookPanel;
    private javax.swing.JLabel mbookPrice;
    private javax.swing.JLabel mbookQuantity;
    private javax.swing.JTextField mbookSearchBook;
    private javax.swing.JButton mbookSearchButton;
    private javax.swing.JLabel mbookTitle;
    private javax.swing.JButton mbooks;
    private javax.swing.JButton memberContainerButton;
    private javax.swing.JLayeredPane memberPanelContainer;
    private javax.swing.JPanel memberPanelSidebar;
    private javax.swing.JPanel memberPanelSidebarHeader;
    private javax.swing.JLabel memberPanelSidebarHeaderText;
    private javax.swing.JButton memberSearchButton;
    private javax.swing.JTable memberSearchResult;
    public javax.swing.JPanel membersContainerPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton mlibrarianSearchButton;
    private javax.swing.JLabel mmemberEmail;
    private javax.swing.JLabel mmemberMsg;
    private javax.swing.JLabel mmemberMsg1;
    private javax.swing.JLabel mmemberName;
    private javax.swing.JLabel mmemberPA;
    private javax.swing.JPanel mmemberPanel;
    private javax.swing.JButton mmemberPanelButton;
    private javax.swing.JLabel mmemberPanelSearchText;
    private javax.swing.JLabel mmemberPhone;
    private javax.swing.JTextField mmemberSearchBox;
    private javax.swing.JLabel mmemberTA;
    private javax.swing.JTextArea notificationText;
    private javax.swing.JTextField rbookBookID;
    private javax.swing.JLabel rbookBookIssued;
    private javax.swing.JLabel rbookMemberAddress;
    private javax.swing.JLabel rbookMemberDetails;
    private javax.swing.JLabel rbookMemberEmail;
    private javax.swing.JTextField rbookMemberID;
    private javax.swing.JLabel rbookMemberPhone;
    private javax.swing.JPanel rbookPanel;
    private javax.swing.JLabel rbook_msg;
    private javax.swing.JButton rbooks;
    private javax.swing.JButton reloadButton;
    private javax.swing.JButton reloadButton1;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField searchBook;
    private javax.swing.JButton searchBookButton;
    private javax.swing.JPanel searchBooksPanel;
    private javax.swing.JTextField searchMember;
    private javax.swing.JPanel searchMemberPanel;
    private javax.swing.JButton searchMemberPanelButton;
    private javax.swing.JButton sendNotification;
    private javax.swing.JButton settingsContainerButton;
    public javax.swing.JPanel settingsContainerPanel;
    private javax.swing.JPanel settingsPanelSidebar;
    private javax.swing.JPanel settingsPanelSidebarHeader;
    private javax.swing.JLabel settingsPanelSidebarHeaderText;
    // End of variables declaration//GEN-END:variables
    private final DataBase db;
}
