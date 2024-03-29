package Kruskal;

import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class         CityDetails.java
 * Description   A class representing the GUI used to display details of a
 *               selected city.
 * Project       Kruskal
 * Platform      jdk 1.8.0_241; Windows 11
 * History log
 * @author	     <i>wldeh</i>
 * @version 	   %1% %2%
 * @see          javax.swing.JDialog
 * @see          java.awt.Toolkit
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class CityDetails extends javax.swing.JDialog {

  private City city;

  @SuppressWarnings("OverridableMethodCallInConstructor")
  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * Constructor  CityDetails()-default constructor
   * Description  Create an instance of the GUI form, center form.
   * Date         11/28/2023
   * History log
   * @author      <i>wldeh</i>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public CityDetails(City city) {
    initComponents();
    this.city = city;
    displayInfo(); // Display city information
    this.setLocationRelativeTo(null);
    this.setResizable(false);
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * Constructor   setPicture()
   * Description   Sets picture of player in dishJLabel
   * Date          11/28/2023
   * History log
   * @author       <i>wldeh</i>
   * @param        label JLabel
   * @param        folder String
   * @param        name String
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public void setPicture(JLabel label, String folder, String name) {
    String image = folder + "/" + name + ".jpg";
    label.setIcon(new ImageIcon(image));
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * Constructor   displayInfo()
   * Description   Display detail about city in detailJTextArea
   * Date          11/28/2023
   * History log
   * @author       <i>wldeh</i>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public void displayInfo() {
    if (city != null) {
      DecimalFormat df = new DecimalFormat("#.##");
      String info =
        "Name: " +
        city.getName() +
        "\nState: " +
        city.getState() +
        "\nArea: " +
        df.format(city.getArea()) +
        " square miles" +
        "\nPopulation: " +
        city.getPopulation();
      infoJTextArea.setText(info);
    }
    setPicture(photoJLabel, "src/Images/", city.getName());
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    infoJScrollPane = new javax.swing.JScrollPane();
    infoJTextArea = new javax.swing.JTextArea();
    photoJLabel = new javax.swing.JLabel();
    closeJButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("City Details");
    setResizable(false);
    setType(java.awt.Window.Type.UTILITY);

    infoJTextArea.setEditable(false);
    infoJTextArea.setColumns(20);
    infoJTextArea.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
    infoJTextArea.setLineWrap(true);
    infoJTextArea.setRows(5);
    infoJTextArea.setWrapStyleWord(true);
    infoJScrollPane.setViewportView(infoJTextArea);

    photoJLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
    photoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    closeJButton.setBackground(new java.awt.Color(204, 255, 204));
    closeJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    closeJButton.setMnemonic('C');
    closeJButton.setText("Close");
    closeJButton.setToolTipText("");
    closeJButton.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          closeJButtonActionPerformed(evt);
        }
      }
    );

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
            .addGap(16, 16, 16)
            .addGroup(
              layout
                .createParallelGroup(
                  javax.swing.GroupLayout.Alignment.LEADING,
                  false
                )
                .addComponent(
                  closeJButton,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  242,
                  Short.MAX_VALUE
                )
                .addComponent(
                  infoJScrollPane,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  242,
                  Short.MAX_VALUE
                )
                .addComponent(
                  photoJLabel,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  Short.MAX_VALUE
                )
            )
            .addContainerGap(17, Short.MAX_VALUE)
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(
              photoJLabel,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              174,
              Short.MAX_VALUE
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              infoJScrollPane,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              142,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(21, 21, 21)
            .addComponent(
              closeJButton,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              63,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(12, 12, 12)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   *<pre>
   * Method       closeJButtonActionPerformed
   * Description  Closes the CityDetails form only.
   * Date         11/28/2023
   * History log
   * @author      <i>wldeh</i>
   * @param       evt java.awt.event.ActionEvent
   *</pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  private void closeJButtonActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_closeJButtonActionPerformed
    this.dispose();
  } //GEN-LAST:event_closeJButtonActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton closeJButton;
  private javax.swing.JScrollPane infoJScrollPane;
  private javax.swing.JTextArea infoJTextArea;
  private javax.swing.JLabel photoJLabel;
  // End of variables declaration//GEN-END:variables
}
