/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionfiles4;

import java.io.*;
import java.util.*; 
public class AplicacionFiles4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException {
        
        BufferedReader ent = new BufferedReader(new FileReader("datos.txt")); 
PrintWriter sal = new PrintWriter(System.out,true); 
PrintWriter salErr = new PrintWriter(System.err, true);
int numero;
String nombre;
double saldo;
StringTokenizer stt; 
       String linea = ent.readLine();
while (linea != null) {
// se tokeniza la linea leida del archivo
try {
stt = new StringTokenizer(linea, "_");
// se extrae cada uno de los tokens de la línea
numero = Integer.parseInt(stt.nextToken());
nombre = stt.nextToken();
saldo = Double.parseDouble(stt.nextToken());
sal.println("" + numero + " " + nombre + " " + saldo);
}
catch (NoSuchElementException nsee) {
salErr.println("No hay datos completos " + linea + nsee.toString()); 
}
linea = ent.readLine();
}
salErr.println("Fin");
ent.close();  
    }
    
}
