import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Numeros extends JFrame{
	static String path;
	static int[][] inicio = { {3, 5}, {1, 3} };
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
	public void leerTxt(String path){
	String linea;
	int numero;
	 int c=1;
	 int digitos = 0;
	 FileWriter fichero = null;
    PrintWriter pw = null;
			try {
			File archivo = new File(path);
			FileReader fr = new FileReader(archivo);
           BufferedReader bufer = new BufferedReader(fr);
           fichero = new FileWriter("C:\\Users\\Milton Navarro\\Documents\\examenFinal\\src\\examenFinal\\Output_Numeros1_201314014.txt");
            pw = new PrintWriter(fichero);
           while((linea = bufer.readLine())!= null){
           		numero=Integer.parseInt(linea);
           		int [][] matrix = matrix_exp(inicio, numero);
           		int respuesta = (2 * matrix[0][0] - 1 + 1000) % 1000;
                int j=respuesta;
           	    while(j!=0){            
                 j= j/10;         
                digitos++;          
                   }
           	    if(digitos==2){
               		pw.println("Caso #"+c+": "+"0"+respuesta);
               		digitos=0;
           	    }
           	    else if(digitos==0){
            		pw.println("Caso #"+c+": "+"00"+respuesta);
            		digitos=0;
        	    }
           	    else{
           	    	pw.println("Caso #"+c+": "+respuesta); 
           	    	digitos=0;
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
	public int[][] matrix_exp(int[][] A, int exp) { 
		 if (exp == 1) { 
					return A; 
	     } else if (exp % 2 == 0) { 
				int[][] Ahalf = matrix_exp(A, exp/2); 
				return matrix_multiplicar(Ahalf, Ahalf); 
		 } else { 
				return matrix_multiplicar(matrix_exp(A, exp-1), A); 
		 } 
      	} 
	public int[][] matrix_multiplicar(int[][] A, int[][] B) { 
				int[][] res = new int[2][2]; 
		 		res[0][0] = (A[0][0] * B[0][0] + A[0][1] * B[1][0]) % 1000; 
	     		res[0][1] = (A[0][0] * B[0][1] + A[0][1] * B[1][1]) % 1000; 
				res[1][0] = (A[1][0] * B[0][0] + A[1][1] * B[1][0]) % 1000; 
		 		res[1][1] = (A[1][0] * B[0][1] + A[1][1] * B[1][1]) % 1000; 
				return res; 
			} 

	 public static void main(String [] arg) {
			Numeros numero = new Numeros();
			numero.abrirArchivo();
			numero.leerTxt(path);
		 }
}
