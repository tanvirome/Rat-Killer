package game;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
public class HitRat extends javax.swing.JFrame {
    private Random rand = new Random();
    private int speed=1000,score=0,level=1,highscore=0;
    private Thread t = new Thread();
    private boolean flag1,flag2,flag3,flag4,flag5,flag6,flag7,flag8,flag9,flag10,flag11,flag12,flag13,flag14,flag15,flag16;
    private String str;
    
    
    
    public HitRat() {
        CustomCursor();
        initComponents();
        bt1.setVisible(false);
        bt2.setVisible(false);
        bt3.setVisible(false);
        bt4.setVisible(false);
        bt5.setVisible(false);
        bt6.setVisible(false);
        bt7.setVisible(false);
        bt8.setVisible(false);
        bt9.setVisible(false);
        bt10.setVisible(false);
        bt11.setVisible(false);
        bt12.setVisible(false);
        bt13.setVisible(false);
        bt14.setVisible(false);
        bt15.setVisible(false);
        bt16.setVisible(false);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        try {
            FileReader f = new FileReader("HighScore");
            BufferedReader b = new BufferedReader(f);
            
            while ((str=b.readLine())!=null){
                //System.out.println(str);
                jLabel4.setText("High Score : "+str);
                highscore=Integer.parseInt(str);
            }
            b.close();
        } catch (Exception ex) {
            System.out.println("File Not Found");
        }
    }
    
    
    public void Run(){
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    int x =rand.nextInt(16)+1;
                    try {
                        if(x==1){
                            bt1.setVisible(true);
                            flag1=true;
                            Thread.sleep(speed);
                            bt1.setVisible(false);
                            flag1=false;
                            Thread.sleep(300);
                        }
                        if(x==2){
                            bt2.setVisible(true);
                            flag2=true;
                            Thread.sleep(speed);
                            bt2.setVisible(false);
                            flag2=false;
                            Thread.sleep(300);
                        }
                        if(x==3){
                            bt3.setVisible(true);
                            flag3=true;
                            Thread.sleep(speed);
                            bt3.setVisible(false);
                            flag3=false;
                            Thread.sleep(300);
                        }
                        if(x==4){
                            bt4.setVisible(true);
                            flag4=true;
                            Thread.sleep(speed);
                            bt4.setVisible(false);
                            flag4=false;
                            Thread.sleep(300);
                        }
                        if(x==5){
                            bt5.setVisible(true);
                            flag5=true;
                            Thread.sleep(speed);
                            bt5.setVisible(false);
                            flag5=false;
                            Thread.sleep(300);
                        }
                        if(x==6){
                            bt6.setVisible(true);
                            flag6=true;
                            Thread.sleep(speed);
                            bt6.setVisible(false);
                            flag6=false;
                            Thread.sleep(300);
                        }
                        if(x==7){
                            bt7.setVisible(true);
                            flag7=true;
                            Thread.sleep(speed);
                            bt7.setVisible(false);
                            flag7=false;
                            Thread.sleep(300);
                        }
                        if(x==8){
                            bt8.setVisible(true);
                            flag8=true;
                            Thread.sleep(speed);
                            bt8.setVisible(false);
                            flag8=false;
                            Thread.sleep(300);
                        }
                        if(x==9){
                            bt9.setVisible(true);
                            flag9=true;
                            Thread.sleep(speed);
                            bt9.setVisible(false);
                            flag9=false;
                            Thread.sleep(300);
                        }
                        if(x==10){
                            bt10.setVisible(true);
                            flag10=true;
                            Thread.sleep(speed);
                            bt10.setVisible(false);
                            flag10=false;
                            Thread.sleep(300);
                        }
                        if(x==11){
                            bt11.setVisible(true);
                            flag11=true;
                            Thread.sleep(speed);
                            bt11.setVisible(false);
                            flag11=false;
                            Thread.sleep(300);
                        }
                        if(x==12){
                            bt12.setVisible(true);
                            flag12=true;
                            Thread.sleep(speed);
                            bt12.setVisible(false);
                            flag12=false;
                            Thread.sleep(300);
                        }
                        if(x==13){
                            bt13.setVisible(true);
                            flag13=true;
                            Thread.sleep(speed);
                            bt13.setVisible(false);
                            flag13=false;
                            Thread.sleep(300);
                        }
                        if(x==14){
                            bt14.setVisible(true);
                            flag14=true;
                            Thread.sleep(speed);
                            bt14.setVisible(false);
                            flag14=false;
                            Thread.sleep(300);
                        }
                        if(x==15){
                            bt15.setVisible(true);
                            flag15=true;
                            Thread.sleep(speed);
                            bt15.setVisible(false);
                            flag15=false;
                            Thread.sleep(300);
                        }
                        if(x==16){
                            bt16.setVisible(true);
                            flag16=true;
                            Thread.sleep(speed);
                            bt16.setVisible(false);
                            flag16=false;
                            Thread.sleep(300);
                        }
                        if(score>highscore){
                            try {
                                FileWriter f= new FileWriter("highScore");
                                PrintWriter p = new PrintWriter(f);

                                highscore=score;
                                p.println(highscore);
                                jLabel4.setText("High Score : "+highscore);
                                //p.println(p);
                                p.close();
                            } catch (IOException ex) {
                                System.out.println("File Could Not Edited!");
                            }
                        }
                        if(score>(level*500)){
                            level+=1;
                            jLabel3.setText("Level : "+level);
                            speed=700+(level*100);
                            jLabel2.setText("Score : "+score);
                        }
                        if(score<((level*500))){
                            level-=1;
                            jLabel3.setText("Level : "+level);
                            speed=700-(level*100);
                            jLabel2.setText("Score : "+score);
                        }
                    } 
                    catch (InterruptedException ex) {
                        Logger.getLogger(HitRat.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        t.start();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt10 = new javax.swing.JButton();
        bt11 = new javax.swing.JButton();
        bt12 = new javax.swing.JButton();
        bt13 = new javax.swing.JButton();
        bt14 = new javax.swing.JButton();
        bt15 = new javax.swing.JButton();
        bt16 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 700));

        jPanel1.setLayout(null);

        bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt1MouseClicked(evt);
            }
        });
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt1);
        bt1.setBounds(330, 90, 65, 64);

        bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt2);
        bt2.setBounds(450, 90, 65, 64);

        bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        jPanel1.add(bt3);
        bt3.setBounds(560, 90, 65, 64);

        bt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        jPanel1.add(bt4);
        bt4.setBounds(680, 90, 65, 64);

        bt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        jPanel1.add(bt5);
        bt5.setBounds(330, 200, 65, 64);

        bt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        jPanel1.add(bt6);
        bt6.setBounds(450, 200, 65, 64);

        bt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        jPanel1.add(bt7);
        bt7.setBounds(560, 200, 65, 64);

        bt8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        jPanel1.add(bt8);
        bt8.setBounds(680, 200, 64, 64);

        bt9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        jPanel1.add(bt9);
        bt9.setBounds(330, 310, 64, 64);

        bt10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt10ActionPerformed(evt);
            }
        });
        jPanel1.add(bt10);
        bt10.setBounds(450, 310, 64, 64);

        bt11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt11ActionPerformed(evt);
            }
        });
        jPanel1.add(bt11);
        bt11.setBounds(560, 310, 64, 64);

        bt12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt12ActionPerformed(evt);
            }
        });
        jPanel1.add(bt12);
        bt12.setBounds(680, 310, 64, 64);

        bt13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt13ActionPerformed(evt);
            }
        });
        jPanel1.add(bt13);
        bt13.setBounds(330, 420, 64, 64);

        bt14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt14ActionPerformed(evt);
            }
        });
        jPanel1.add(bt14);
        bt14.setBounds(450, 420, 64, 64);

        bt15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt15ActionPerformed(evt);
            }
        });
        jPanel1.add(bt15);
        bt15.setBounds(560, 430, 64, 64);

        bt16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/mouse2.png"))); // NOI18N
        bt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt16ActionPerformed(evt);
            }
        });
        jPanel1.add(bt16);
        bt16.setBounds(680, 420, 64, 64);

        jLabel2.setFont(new java.awt.Font("Lobster", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Score : 0");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 370, 150, 30);

        jLabel3.setFont(new java.awt.Font("Lobster", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Level : 1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 320, 170, 30);

        jLabel4.setFont(new java.awt.Font("Lobster", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("High Score : ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 420, 230, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/finalBG.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
        if(flag2){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
        if(flag3){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:
        if(flag4){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        // TODO add your handling code here:
        if(flag5){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        // TODO add your handling code here:
        if(flag6){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        // TODO add your handling code here:
        if(flag7){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        // TODO add your handling code here:
        if(flag8){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        // TODO add your handling code here:
        if(flag9){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt10ActionPerformed
        // TODO add your handling code here:
        if(flag10){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt10ActionPerformed

    private void bt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt11ActionPerformed
        // TODO add your handling code here:
        if(flag11){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt11ActionPerformed

    private void bt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt12ActionPerformed
        // TODO add your handling code here:
        if(flag12){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt12ActionPerformed

    private void bt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt13ActionPerformed
        // TODO add your handling code here:
        if(flag13){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt13ActionPerformed

    private void bt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt14ActionPerformed
        // TODO add your handling code here:
        if(flag14){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt14ActionPerformed

    private void bt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt15ActionPerformed
        // TODO add your handling code here:
        if(flag15){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt15ActionPerformed

    private void bt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt16ActionPerformed
        // TODO add your handling code here:
        if(flag16){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
    }//GEN-LAST:event_bt16ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        //this.Run();
        score-=50;
        jLabel2.setText("Score : "+score);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        if(flag1){
            score+=50;
            jLabel2.setText("Score : "+score);
        }
        else{
            score-=50;
            jLabel2.setText("Score : "+score);
        }
        
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt1MouseClicked

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
            java.util.logging.Logger.getLogger(HitRat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HitRat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HitRat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HitRat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HitRat().setVisible(true);
            }
        });
    }
    public void CustomCursor(){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image img = tk.getImage("cursor.png");
        Point point=new Point(0,0);
        Cursor cursor = tk.createCustomCursor(img, point, "cursor");
        
        setCursor(cursor);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt10;
    private javax.swing.JButton bt11;
    private javax.swing.JButton bt12;
    private javax.swing.JButton bt13;
    private javax.swing.JButton bt14;
    private javax.swing.JButton bt15;
    private javax.swing.JButton bt16;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
