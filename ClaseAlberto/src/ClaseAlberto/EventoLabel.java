package ClaseAlberto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventoLabel extends JFrame{
 
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public EventoLabel(){
  JPanel panel = new JPanel();
  JLabel etiqueta = new JLabel("P�lsame");
  etiqueta.setFont(new Font("Tahoma", 1, 18));
  etiqueta.setForeground(new java.awt.Color(51, 51, 255));
  panel.add(etiqueta);
  
  etiqueta.addMouseListener(new MouseListener() { 
   @Override
   public void mouseClicked(MouseEvent e) {//Evento al clickear o (presionar y soltar) el rat�n sobre la etiqueta
	   etiqueta.setText("Soy una Etiqueta");
	    etiqueta.setFont(new Font("Tahoma", 1, 18));
	    etiqueta.setForeground(new Color(245, 10, 10));
   }
   public void mouseEntered(MouseEvent e) {//Evento al iniciar pasar por encima el rat�n de la etiqueta
	   
   }
   public void mouseExited(MouseEvent e) { //Evento al salir pasar por encima el rat�n de la etiqueta
	   
   }
   public void mousePressed(MouseEvent e) {//Evento al presionar la etiqueta de texto o bot�n
	   
   }
   public void mouseReleased(MouseEvent e) { //Evento al soltar el rat�n la etiqueta de texto
	   
   }
  });
  
  getContentPane().add(panel);
  setLocation(500,200);
  setSize(300,100);
  setVisible(true);
 }
 
 public static void main(String args[]) {
  EventoLabel v = new EventoLabel();
  v.setTitle("Evento de Mouse "); 
 } 
}