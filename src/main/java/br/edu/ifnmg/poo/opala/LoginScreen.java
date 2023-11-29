package br.edu.ifnmg.poo.opala;

import br.edu.ifnmg.poo.credential.Credential;
import br.edu.ifnmg.poo.credential.CredentialDAO;
import br.edu.ifnmg.poo.user.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class LoginScreen extends javax.swing.JFrame {

    private static LoginScreen instance;

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();
        //setLocationRelativeTo(null);
        new Timer(50, new ActionListener() {
            float opacity = 0f;

            @Override
            public void actionPerformed(ActionEvent e) {
                // Aumenta a opacidade em 0.05
                opacity += 0.05f;

                // Define a nova opacidade
                setOpacity(Math.min(opacity, 1f));

                // Se a opacidade chegar a 1, para o Timer
                if (opacity >= 1f) {
                    ((Timer) e.getSource()).stop();
                }
            }
        }).start();
    }

    public static LoginScreen getInstance() {
        if (instance == null) {
            instance = new LoginScreen();
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        imgLogin = new javax.swing.JLabel();
        btnExitLogin = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        pwdUser = new javax.swing.JPasswordField();
        lblBemVindo = new javax.swing.JLabel();
        btnToEnter = new javax.swing.JButton();
        lblErrorLogin = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        imgLogin1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(695, 310));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amico.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 133, 255));

        imgLogin.setBackground(new java.awt.Color(0, 0, 255));
        imgLogin.setForeground(new java.awt.Color(51, 51, 255));
        imgLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User.png"))); // NOI18N
        imgLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnExitLogin.setBackground(new java.awt.Color(255, 0, 0));
        btnExitLogin.setText("X");
        btnExitLogin.setAlignmentY(0.0F);
        btnExitLogin.setBorder(null);
        btnExitLogin.setBorderPainted(false);
        btnExitLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExitLogin.setFocusPainted(false);
        btnExitLogin.setFocusable(false);
        btnExitLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitLoginActionPerformed(evt);
            }
        });

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setForeground(new java.awt.Color(157, 194, 132));
        txtUser.setText("VrunoBinicius");
        txtUser.setCaretColor(new java.awt.Color(157, 230, 178));

        pwdUser.setBackground(new java.awt.Color(255, 255, 255));
        pwdUser.setForeground(new java.awt.Color(157, 194, 132));
        pwdUser.setText("senha123");
        pwdUser.setCaretColor(new java.awt.Color(157, 230, 178));

        lblBemVindo.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(0, 133, 255));
        lblBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBemVindo.setText("Bem-vindo!");

        btnToEnter.setBackground(new java.awt.Color(0, 133, 255));
        btnToEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnToEnter.setText("ENTRAR");
        btnToEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToEnterActionPerformed(evt);
            }
        });

        lblErrorLogin.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblErrorLogin.setForeground(new java.awt.Color(255, 0, 51));

        jPanel4.setBackground(new java.awt.Color(0, 133, 255));

        imgLogin1.setBackground(new java.awt.Color(0, 0, 255));
        imgLogin1.setForeground(new java.awt.Color(51, 51, 255));
        imgLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lock.png"))); // NOI18N
        imgLogin1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblErrorLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(pwdUser)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnToEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExitLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnExitLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtUser)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pwdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(lblErrorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnToEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitLoginActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitLoginActionPerformed

    private void btnToEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToEnterActionPerformed
        // TODO add your handling code here:
        Credential credential = new Credential();
        credential.setUsername(txtUser.getText());
        String password = String.valueOf(pwdUser.getPassword());
        credential.setPassword(password);

        CredentialDAO credentialDao = new CredentialDAO();
        User user = credentialDao.authenticate(credential);
        if (user != null) {
            credential = user.getCredential();
            this.setVisible(false);
            new MainScreen(credential).setVisible(true);
            lblErrorLogin.setText("");
        } else {
            lblErrorLogin.setText("Usuário ou Senha incorretos.");
        }

        pwdUser.setText(null);
        txtUser.requestFocus();
        txtUser.selectAll();
    }//GEN-LAST:event_btnToEnterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginScreen.getInstance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExitLogin;
    private javax.swing.JButton btnToEnter;
    private javax.swing.JLabel imgLogin;
    private javax.swing.JLabel imgLogin1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblErrorLogin;
    private javax.swing.JPasswordField pwdUser;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
