/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.view.verificadores;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author apple
 */
public class EnteroVerificador extends InputVerifier {
         
    public boolean verify(JComponent input) {
             JTextField tf = (JTextField) input;
             return "pass".equals(tf.getText());
         }

}
