package View;

public class profresserPage extends javax.swing.JPanel {

    public profresserPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lineID = new javax.swing.JSeparator();
        PA2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logoTU1 = new javax.swing.JLabel();
        loginNametxt = new javax.swing.JLabel();
        nameSurname = new javax.swing.JLabel();
        logoutBtt = new javax.swing.JButton();
        loginNametxt1 = new javax.swing.JLabel();
        idSubjectInput = new javax.swing.JTextField();
        loginNametxt2 = new javax.swing.JLabel();
        subjectInput = new javax.swing.JTextField();
        subjectTxt = new javax.swing.JLabel();
        tearmTxt = new javax.swing.JLabel();
        subInput = new javax.swing.JTextField();
        Ftxt = new javax.swing.JLabel();
        BPtxt = new javax.swing.JLabel();
        Btxt = new javax.swing.JLabel();
        PA = new javax.swing.JLabel();
        CPtxt = new javax.swing.JLabel();
        Ctxt = new javax.swing.JLabel();
        DPtxt = new javax.swing.JLabel();
        Dtxt = new javax.swing.JLabel();
        Atxt1 = new javax.swing.JLabel();
        uploadTxt = new javax.swing.JLabel();
        importBtt = new javax.swing.JButton();
        addBtt = new javax.swing.JButton();
        bpScore = new javax.swing.JTextField();
        aScore = new javax.swing.JTextField();
        bScore = new javax.swing.JTextField();
        cpScore = new javax.swing.JTextField();
        cScore = new javax.swing.JTextField();
        dpScore = new javax.swing.JTextField();
        dScore = new javax.swing.JTextField();
        fScore = new javax.swing.JTextField();
        uploadTxt1 = new javax.swing.JLabel();
        yearInput = new javax.swing.JComboBox<>();
        subjectTxt1 = new javax.swing.JLabel();
        secInput1 = new javax.swing.JTextField();
        loginNametxt5 = new javax.swing.JLabel();
        yearInput1 = new javax.swing.JComboBox<>();
        backBtt = new javax.swing.JButton();
        PA1 = new javax.swing.JLabel();
        PA3 = new javax.swing.JLabel();
        PA4 = new javax.swing.JLabel();
        PA5 = new javax.swing.JLabel();
        PA6 = new javax.swing.JLabel();
        PA7 = new javax.swing.JLabel();
        PA8 = new javax.swing.JLabel();

        PA2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        PA2.setText("point");

        setBackground(new java.awt.Color(255, 233, 114));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        logoTU1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Logo-TU.png"))); // NOI18N
        logoTU1.setPreferredSize(new java.awt.Dimension(150, 150));

        loginNametxt.setFont(new java.awt.Font("Century Gothic", 1, 50)); // NOI18N
        loginNametxt.setText("Login name : ");

        nameSurname.setFont(new java.awt.Font("Century Gothic", 1, 38)); // NOI18N
        nameSurname.setText("NAME + SURNAME");

        logoutBtt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logoutBtt.setForeground(new java.awt.Color(51, 51, 51));
        logoutBtt.setText("logout");
        logoutBtt.setBorder(null);
        logoutBtt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBttMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(logoTU1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginNametxt)
                    .addComponent(nameSurname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutBtt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginNametxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameSurname)
                .addContainerGap(47, Short.MAX_VALUE))
            .addComponent(logoTU1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        loginNametxt1.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
        loginNametxt1.setText("รหัสวิชา");

        idSubjectInput.setBackground(new java.awt.Color(255, 233, 114));
        idSubjectInput.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        idSubjectInput.setForeground(new java.awt.Color(255, 153, 0));
        idSubjectInput.setText("XXXXX");
        idSubjectInput.setBorder(null);
        idSubjectInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idSubjectInputActionPerformed(evt);
            }
        });

        loginNametxt2.setFont(new java.awt.Font("Century Gothic", 0, 31)); // NOI18N
        loginNametxt2.setText("Sec");

        subjectInput.setBackground(new java.awt.Color(255, 233, 114));
        subjectInput.setFont(new java.awt.Font("Angsana New", 1, 32)); // NOI18N
        subjectInput.setForeground(new java.awt.Color(255, 153, 0));
        subjectInput.setText("XXXXXXXXXXXXXXXXXXXXXXXXXXX");
        subjectInput.setBorder(null);
        subjectInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectInputActionPerformed(evt);
            }
        });

        subjectTxt.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        subjectTxt.setText("Subject");

        tearmTxt.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
        tearmTxt.setText("เทอม");

        subInput.setBackground(new java.awt.Color(255, 233, 114));
        subInput.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        subInput.setForeground(new java.awt.Color(255, 153, 0));
        subInput.setText("XXXXXXXXXXXXXXXXXXXXXXXXX");
        subInput.setBorder(null);
        subInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subInputActionPerformed(evt);
            }
        });

        Ftxt.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
        Ftxt.setText("F");

        BPtxt.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
        BPtxt.setText("B+");

        Btxt.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
        Btxt.setText("B ");

        PA.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        PA.setText("point");

        CPtxt.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
        CPtxt.setText("C+");

        Ctxt.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
        Ctxt.setText("C");

        DPtxt.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
        DPtxt.setText("D+");

        Dtxt.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
        Dtxt.setText("D");

        Atxt1.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
        Atxt1.setText("A");

        uploadTxt.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
        uploadTxt.setText("อัพโหลดราชชื่อนักศึกษา");

        importBtt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        importBtt.setText("import");

        addBtt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addBtt.setText("add");
        addBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBttActionPerformed(evt);
            }
        });

        bpScore.setBackground(new java.awt.Color(255, 233, 114));
        bpScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        bpScore.setText("75-79");
        bpScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpScoreActionPerformed(evt);
            }
        });

        aScore.setBackground(new java.awt.Color(255, 233, 114));
        aScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        aScore.setText("80-100");
        aScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aScoreActionPerformed(evt);
            }
        });

        bScore.setBackground(new java.awt.Color(255, 233, 114));
        bScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        bScore.setText("70-74");
        bScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bScoreActionPerformed(evt);
            }
        });

        cpScore.setBackground(new java.awt.Color(255, 233, 114));
        cpScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        cpScore.setText("58-69");
        cpScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpScoreActionPerformed(evt);
            }
        });

        cScore.setBackground(new java.awt.Color(255, 233, 114));
        cScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        cScore.setText("50-57");
        cScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cScoreActionPerformed(evt);
            }
        });

        dpScore.setBackground(new java.awt.Color(255, 233, 114));
        dpScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        dpScore.setText("45-49");
        dpScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpScoreActionPerformed(evt);
            }
        });

        dScore.setBackground(new java.awt.Color(255, 233, 114));
        dScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        dScore.setText("40-44");
        dScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dScoreActionPerformed(evt);
            }
        });

        fScore.setBackground(new java.awt.Color(255, 233, 114));
        fScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        fScore.setText("0-39");
        fScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fScoreActionPerformed(evt);
            }
        });

        uploadTxt1.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
        uploadTxt1.setText("เพิ่มรายวิชา");

        yearInput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        yearInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "summer", " " }));

        subjectTxt1.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
        subjectTxt1.setText("ชื่อวิชา");

        secInput1.setBackground(new java.awt.Color(255, 233, 114));
        secInput1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        secInput1.setForeground(new java.awt.Color(255, 153, 0));
        secInput1.setText("XXXXXX");
        secInput1.setBorder(null);
        secInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secInput1ActionPerformed(evt);
            }
        });

        loginNametxt5.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
        loginNametxt5.setText(" ปีการศึกษา");

        yearInput1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        yearInput1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "year", " " }));

        backBtt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        backBtt.setText("back");

        PA1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        PA1.setText("point");

        PA3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        PA3.setText("point");

        PA4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        PA4.setText("point");

        PA5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        PA5.setText("point");

        PA6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        PA6.setText("point");

        PA7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        PA7.setText("point");

        PA8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        PA8.setText("point");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginNametxt1)
                            .addComponent(subjectTxt1)
                            .addComponent(subjectTxt))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idSubjectInput, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(loginNametxt2)
                                .addGap(25, 25, 25)
                                .addComponent(secInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(subjectInput, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subInput, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tearmTxt)
                        .addGap(32, 32, 32)
                        .addComponent(yearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loginNametxt5)
                        .addGap(18, 18, 18)
                        .addComponent(yearInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uploadTxt)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(uploadTxt1)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(importBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DPtxt)
                            .addComponent(Dtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PA8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dpScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PA5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PA7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Atxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BPtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CPtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bpScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PA, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PA3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PA1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PA4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PA6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(backBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginNametxt1)
                                .addGap(13, 13, 13)
                                .addComponent(subjectTxt1)
                                .addGap(23, 23, 23)
                                .addComponent(subjectTxt))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginNametxt2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(idSubjectInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(secInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(29, 29, 29)
                                .addComponent(subjectInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(subInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(backBtt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(yearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginNametxt5)
                                    .addComponent(yearInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tearmTxt))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(uploadTxt)
                                        .addGap(13, 13, 13)
                                        .addComponent(uploadTxt1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(addBtt)
                                        .addGap(33, 33, 33)
                                        .addComponent(importBtt))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(aScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PA))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bpScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PA3))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PA4))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cpScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PA1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Atxt1)
                                .addGap(17, 17, 17)
                                .addComponent(BPtxt)
                                .addGap(17, 17, 17)
                                .addComponent(Btxt)
                                .addGap(17, 17, 17)
                                .addComponent(CPtxt)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PA6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Ctxt)))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dpScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PA5))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PA8))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PA7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(DPtxt)
                                .addGap(17, 17, 17)
                                .addComponent(Dtxt)
                                .addGap(17, 17, 17)
                                .addComponent(Ftxt)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void idSubjectInputActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void subjectInputActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void subInputActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void bpScoreActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void aScoreActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void bScoreActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void cpScoreActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void cScoreActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void dpScoreActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void dScoreActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void fScoreActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void addBttActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void secInput1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void logoutBttMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
    }                                      


    // Variables declaration - do not modify                     
    private javax.swing.JLabel Atxt1;
    private javax.swing.JLabel BPtxt;
    private javax.swing.JLabel Btxt;
    private javax.swing.JLabel CPtxt;
    private javax.swing.JLabel Ctxt;
    private javax.swing.JLabel DPtxt;
    private javax.swing.JLabel Dtxt;
    private javax.swing.JLabel Ftxt;
    private javax.swing.JLabel PA;
    private javax.swing.JLabel PA1;
    private javax.swing.JLabel PA2;
    private javax.swing.JLabel PA3;
    private javax.swing.JLabel PA4;
    private javax.swing.JLabel PA5;
    private javax.swing.JLabel PA6;
    private javax.swing.JLabel PA7;
    private javax.swing.JLabel PA8;
    private javax.swing.JTextField aScore;
    private javax.swing.JButton addBtt;
    private javax.swing.JTextField bScore;
    private javax.swing.JButton backBtt;
    private javax.swing.JTextField bpScore;
    private javax.swing.JTextField cScore;
    private javax.swing.JTextField cpScore;
    private javax.swing.JTextField dScore;
    private javax.swing.JTextField dpScore;
    private javax.swing.JTextField fScore;
    private javax.swing.JTextField idSubjectInput;
    private javax.swing.JButton importBtt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator lineID;
    private javax.swing.JLabel loginNametxt;
    private javax.swing.JLabel loginNametxt1;
    private javax.swing.JLabel loginNametxt2;
    private javax.swing.JLabel loginNametxt5;
    private javax.swing.JLabel logoTU1;
    private javax.swing.JButton logoutBtt;
    private javax.swing.JLabel nameSurname;
    private javax.swing.JTextField secInput1;
    private javax.swing.JTextField subInput;
    private javax.swing.JTextField subjectInput;
    private javax.swing.JLabel subjectTxt;
    private javax.swing.JLabel subjectTxt1;
    private javax.swing.JLabel tearmTxt;
    private javax.swing.JLabel uploadTxt;
    private javax.swing.JLabel uploadTxt1;
    private javax.swing.JComboBox<String> yearInput;
    private javax.swing.JComboBox<String> yearInput1;
    // End of variables declaration                   
}
