package Kruskal;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        About.java
 * Description  About form for Application
 * Platform     jdk 1.8.0_214; Windows 11
 * Hourse       2 hours and 45 minutes
 * Date         11/28/2023
 * Histoly log
 * @author	    <i>wldeh</i>
 * @version 	%1% %4%
 * @see     	javax.swing.JDialog
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class About extends javax.swing.JDialog {

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   *<pre>
   * Constructor  JDialog to allow to select modal or modeless form
   * Description  Create the form as designed, center it, set the icon,
   *              closeJButton as default.
   * Date         11/28/2023
   * History log
   * @author      <i>wldeh</i>
   * @param       parent java.awt.Frame
   * @param       modal boolean
   * @see         javax.swing.JDialog
   *</pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public About(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    //set closeJButton as default
    this.getRootPane().setDefaultButton(closeJButton);
    this.setLocationRelativeTo(null); //center form
    infoJTextArea.setCaretPosition(0);
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    titleJLabel = new javax.swing.JLabel();
    closeJButton = new javax.swing.JButton();
    authorJLabel = new javax.swing.JLabel();
    versionJLabel = new javax.swing.JLabel();
    copyrightJLabel1 = new javax.swing.JLabel();
    dateJLabel = new javax.swing.JLabel();
    infoJScrollPane = new javax.swing.JScrollPane();
    infoJTextArea = new javax.swing.JTextArea();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Kruskal About");
    setResizable(false);
    setType(java.awt.Window.Type.UTILITY);

    titleJLabel.setFont(new java.awt.Font("Tempus Sans ITC", 2, 26)); // NOI18N
    titleJLabel.setForeground(new java.awt.Color(0, 102, 102));
    titleJLabel.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/Images/Cities_tiny.png")
      )
    ); // NOI18N
    titleJLabel.setText("Kruskal's Minimum Spanning Tree");

    closeJButton.setBackground(new java.awt.Color(204, 255, 204));
    closeJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    closeJButton.setMnemonic('C');
    closeJButton.setText("Close");
    closeJButton.setToolTipText("Close the form");
    closeJButton.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          closeJButtonActionPerformed(evt);
        }
      }
    );

    authorJLabel.setText("Author:  wldeh");

    versionJLabel.setText("Version 1.2.3");

    copyrightJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    copyrightJLabel1.setText("Copyright: Freeware");

    dateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    dateJLabel.setText("Date:  11/28/2023");

    infoJScrollPane.setVerticalScrollBarPolicy(
      javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER
    );

    infoJTextArea.setEditable(false);
    infoJTextArea.setColumns(20);
    infoJTextArea.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
    infoJTextArea.setLineWrap(true);
    infoJTextArea.setRows(5);
    infoJTextArea.setText(
      "This program allows you to visualize the minimum spanning tree (MST) of a graph using Kruskal's algorithm. Users can load graph data from a text file where the first line specifies the number of vertices and each subsequent line describes an edge with a weight, like `(u1, v1, w1)`.\n\nAfter reading the file, the program displays the graph's edges and calculates the MST, ensuring all vertices are connected with the least possible total weight. The end result is a display of the MST and its total weight, offering a practical tool for understanding and applying this important concept in graph theory."
    );
    infoJTextArea.setWrapStyleWord(true);
    infoJScrollPane.setViewportView(infoJTextArea);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
      getContentPane()
    );
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addGap(29, 29, 29)
            .addGroup(
              layout
                .createParallelGroup(
                  javax.swing.GroupLayout.Alignment.LEADING,
                  false
                )
                .addComponent(infoJScrollPane)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(
                          versionJLabel,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          204,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          authorJLabel,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          204,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                    .addGap(34, 34, 34)
                    .addComponent(
                      closeJButton,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      79,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      30,
                      Short.MAX_VALUE
                    )
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(
                          copyrightJLabel1,
                          javax.swing.GroupLayout.Alignment.TRAILING
                        )
                        .addComponent(
                          dateJLabel,
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          204,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                )
                .addComponent(
                  titleJLabel,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  Short.MAX_VALUE
                )
            )
            .addContainerGap(30, Short.MAX_VALUE)
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          layout
            .createSequentialGroup()
            .addGap(23, 23, 23)
            .addComponent(
              titleJLabel,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              59,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(18, 18, 18)
            .addComponent(
              infoJScrollPane,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              387,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              32,
              Short.MAX_VALUE
            )
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  layout
                    .createParallelGroup(
                      javax.swing.GroupLayout.Alignment.LEADING
                    )
                    .addGroup(
                      layout
                        .createSequentialGroup()
                        .addComponent(copyrightJLabel1)
                        .addPreferredGap(
                          javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                        )
                        .addComponent(dateJLabel)
                    )
                    .addComponent(
                      closeJButton,
                      javax.swing.GroupLayout.Alignment.TRAILING,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      40,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  layout
                    .createParallelGroup(
                      javax.swing.GroupLayout.Alignment.LEADING
                    )
                    .addGroup(
                      layout
                        .createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(versionJLabel)
                    )
                    .addComponent(authorJLabel)
                )
            )
            .addGap(25, 25, 25)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   *<pre>
   * Method       closeJButtonActionPerformed
   * Description  Closes the About form only.
   * Date         11/28/2023
   * History log
   * @author      <i>wldeh</i>
   * @param       evt java.awt.event.ActionEvent
   *</pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  private void closeJButtonActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_closeJButtonActionPerformed //GEN-HEADEREND:event_closeJButtonActionPerformed
    this.dispose();
  } //GEN-LAST:event_closeJButtonActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel authorJLabel;
  private javax.swing.JButton closeJButton;
  private javax.swing.JLabel copyrightJLabel1;
  private javax.swing.JLabel dateJLabel;
  private javax.swing.JScrollPane infoJScrollPane;
  private javax.swing.JTextArea infoJTextArea;
  private javax.swing.JLabel titleJLabel;
  private javax.swing.JLabel versionJLabel;
  // End of variables declaration//GEN-END:variables
}
