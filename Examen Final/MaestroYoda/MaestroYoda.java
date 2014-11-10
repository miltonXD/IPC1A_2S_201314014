import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MaestroYoda extends JFrame{
	static String path;
	int primeralinea;
		public void abrirArchivo(){
			 JFileChooser selector=new JFileChooser();
			   selector.setDialogTitle("Abrir");
			   FileNameExtensionFilter filtro=new FileNameExtensionFilter("Archivos txt","txt");
		       selector.setFileFilter(filtro);
		       int resultado=selector.showOpenDialog(this);
		       if(resultado==JFileChooser.APPROVE_OPTION)
		        {
		    	   path= selector.getSelectedFile().getAbsolutePath();
		    	  
		        }
	          
		}
	public void leerTxt(String path){ //direccion del archivo
		 String linea;
		 int c=0;
		 String temp[]=null;
		 FileWriter fichero = null;
         PrintWriter pw = null;
				try {
				File archivo = new File(path);
				FileReader fr = new FileReader(archivo);
	            BufferedReader bufer = new BufferedReader(fr);
	            fichero = new FileWriter("C:\\Users\\Milton Navarro\\Documents\\examenFinal\\src\\examenFinal\\Output_MaestroYoda2_201314014.txt");
	            pw = new PrintWriter(fichero);
	            while((linea = bufer.readLine())!= null){
	            	temp=linea.split(" ");
	            	 if(c==0){
	            		 primeralinea= Integer.parseInt(linea);
	            	 }
	            	 else{
	            		 pw.print("caso#"+c+": ");
	            		 for(int i=temp.length-1;i>=0;i--){
	            	           pw.print(temp[i]+" ");  
	            	       }
	            		 pw.println(" ");
	            	 } 
	            	 c++;
	            }
	            fr.close();
	            bufer.close();
	            fichero.close();
	            pw.close();
	            JOptionPane.showMessageDialog(null,"Archivos creado con Exito","Aviso", JOptionPane.INFORMATION_MESSAGE);
	        }catch(Exception e){ 
	        	JOptionPane.showMessageDialog(null,"El Archivo Incorrecto,se cerrara el programa","Error", JOptionPane.INFORMATION_MESSAGE);
	        	System.exit(0);
				}
	}
	 public static void main(String [] arg) {
		MaestroYoda yoda = new MaestroYoda();
		yoda.abrirArchivo();
		yoda.leerTxt(path);
	 }
}
