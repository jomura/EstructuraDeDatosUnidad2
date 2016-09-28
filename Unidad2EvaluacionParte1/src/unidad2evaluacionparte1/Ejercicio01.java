package unidad2evaluacionparte1;
import java.util.Scanner;
public class Ejercicio01 {
    public static String mostrarDatos(int mat [][]){
        String resultados="";
        for(int fila = 0; fila<mat.length;fila++){
            for(int columna=0; columna<mat[fila].length;columna++){
                resultados = resultados + mat[fila][columna]  + " , ";
            }
            resultados = resultados + "\n";
        }
        return resultados;
    }
    public void sumarDatosFilas(int mat [][]){
        for(int fila = 0; fila<mat.length;fila++){
            int resultados = 0;
            for(int columna=0; columna<mat[fila].length;columna++){
                resultados = resultados + mat[fila][columna];
            }
            System.out.println("La suma de los valores en la fila " + (fila+1)+  " es: " + resultados);
        }
        System.out.println("");
    }
    public void sumarDatosColumnas(int mat [][]){
        int c=0; 
        for(int fila=0; fila <6 ; fila++){ 
            for(int columna=0; columna<3; columna++){  
                c=c+mat[columna][fila]; //se pone en orden inverso, por q nos interesan las columnas 
            } 
            System.out.println("La suma de los valores en la columna  es: " + c); //se guarda la suma de los numeros de la columna 
            c=0;
        } 
    System.out.println("");
}
    public static void main(String[] args) {
        Ejercicio01 Eva01 = new Ejercicio01();
        int [][] mat = {{25,20,20,50,50,30},{20,15,15,90,80,90},{15,10,10,40,30,40}};
        System.out.println(mostrarDatos(mat));
        Eva01.sumarDatosFilas(mat);
        Eva01.sumarDatosColumnas(mat);
        
        
    }
}


