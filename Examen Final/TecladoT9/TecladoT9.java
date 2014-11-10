import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TecladoT9 extends JFrame{
	static String path;
	char anterior,an;
	String codigo[]={"0","2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
	char letra[]={' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
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
		 char caracter[]=null;
		 int c=0;
		 FileWriter fichero = null;
         PrintWriter pw = null;
				try {	
				File archivo = new File(path);
				FileReader fr = new FileReader(archivo);
	            BufferedReader bufer = new BufferedReader(fr);
	            fichero = new FileWriter("C:\\Users\\Milton Navarro\\Documents\\examenFinal\\src\\examenFinal\\Output_TecladoT91_201314014.txt");
	             pw = new PrintWriter(fichero);
	            while((linea = bufer.readLine())!= null){
	            	  caracter=linea.toCharArray();
	            	 if(c==0){
	            		 primeralinea= Integer.parseInt(linea);
	            	 }
	            	 else{
	            		 pw.print("caso#"+c+": ");
	                     for(int i =0;i<caracter.length;i++){
	                    	 if((caracter[i]==anterior) || codigo[obtener(caracter[i])].charAt(0)== an ){
	                    		 pw.print(" "+codigo[obtener(caracter[i])]);
		            		 }else{
	                        pw.print(codigo[obtener(caracter[i])]+"");
	                        }   
	                    	 anterior= caracter[i];
	                    	 an=codigo[obtener(caracter[i])].charAt(0);
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
	public int obtener(char dato){
		int index;
	    for(int i=0;i<letra.length;i++)
	    {
	        if(letra[i]==dato){
	        	index=i;
	        	  return index;
	        }
	    }
	  return -1;

		
	}
	 public static void main(String [] arg) {
		TecladoT9 teclado = new TecladoT9();
		teclado.abrirArchivo();
		teclado.leerTxt(path);
	 }
	

}
