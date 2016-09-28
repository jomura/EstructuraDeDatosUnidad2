/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2evaluacionparte1;

/**
 *
 * @author José Muñoz Ramírez
 */
import java.util.Scanner;


public class Ejercicio02{
    private int contador;
    private   char posicion[]=new char[10];
    private   char jugador;
    public static void main(String args[])
    {
        String respuesta;
        Ejercicio02 Gato=new Ejercicio02();
        do{
            
            Gato.jugar();
            System.out.println ("Te gustaria Jugar otra vez? (Y/N) ");
            Scanner teclado =new Scanner(System.in);
            respuesta=teclado.nextLine();
            System.out.println("Su movimiento es" + respuesta);
        }
        while (respuesta.equalsIgnoreCase("Y"));
    }
    public  void nuevoTablero(){
        char posndef[] = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int i;
        contador = 0;
        jugador = 'X';
        for (i=1; i<10; i++) posicion[i]=posndef[i];
        tableroActual();
    }
    public  String tableroActual()
    {
        System.out.println( "\n\n" );
        System.out.println(  "\n\n" );
        System.out.println(  "\n\n\t\t" + posicion [1] + "   | " +posicion [2]+ "  | " +posicion [3]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t ___|____|___ " );
        System.out.println(  "\n\n\t\t" +posicion [4]+ "   | " +posicion [5]+ "  | " +posicion [6]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t ___|____|___ " );
        System.out.println(  "\n\n\t\t" +posicion [7]+ "   | " +posicion [8]+ "  | " +posicion [9]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  "\n\n" );
        return "tableroActual";
    }
    public  void jugar(){
        int spot;
        char blank = ' ';
        System.out.println(  "jugador " + getPlayer() +" juegas primero, tu marca es 'X'" );
        do {
            tableroActual();             
            System.out.println(  "\n\n Jugador " + getPlayer() +" selecciona una posicion." );
            boolean posTaken = true;
            while (posTaken) {
                Scanner in =new Scanner (System.in);
                spot=in.nextInt();
                posTaken = checkPosn(spot);
                if(posTaken==false)
                posicion[spot]=getPlayer();
            }
            System.out.println(  "Buen Movimiento" );
            tableroActual();              // display current board
            nextPlayer();
        }
        while ( checarGanador()== blank );
    }
    public  char checarGanador(){
        char Winner = ' ';
        if (posicion[1] == 'X' && posicion[2] == 'X' && posicion[3] == 'X') Winner = 'X';
        if (posicion[4] == 'X' && posicion[5] == 'X' && posicion[6] == 'X') Winner = 'X';
        if (posicion[7] == 'X' && posicion[8] == 'X' && posicion[9] == 'X') Winner = 'X';
        if (posicion[1] == 'X' && posicion[4] == 'X' && posicion[7] == 'X') Winner = 'X';
        if (posicion[2] == 'X' && posicion[5] == 'X' && posicion[8] == 'X') Winner = 'X';
        if (posicion[3] == 'X' && posicion[6] == 'X' && posicion[9] == 'X') Winner = 'X';
        if (posicion[1] == 'X' && posicion[5] == 'X' && posicion[9] == 'X') Winner = 'X';
        if (posicion[3] == 'X' && posicion[5] == 'X' && posicion[7] == 'X') Winner = 'X';
        if (Winner == 'X' )
        {System.out.println("Jugador 1 es el ganador" );
            return Winner;
        }
        if (posicion[1] == 'O' && posicion[2] == 'O' && posicion[3] == 'O') Winner = 'O';
        if (posicion[4] == 'O' && posicion[5] == 'O' && posicion[6] == 'O') Winner = 'O';
        if (posicion[7] == 'O' && posicion[8] == 'O' && posicion[9] == 'O') Winner = 'O';
        if (posicion[1] == 'O' && posicion[4] == 'O' && posicion[7] == 'O') Winner = 'O';
        if (posicion[2] == 'O' && posicion[5] == 'O' && posicion[8] == 'O') Winner = 'O';
        if (posicion[3] == 'O' && posicion[6] == 'O' && posicion[9] == 'O') Winner = 'O';
        if (posicion[1] == 'O' && posicion[5] == 'O' && posicion[9] == 'O') Winner = 'O';
        if (posicion[3] == 'O' && posicion[5] == 'O' && posicion[7] == 'O') Winner = 'O';
        if (Winner == 'O' )
        {
            System.out.println( "Player2 wins the game." );
        return Winner; }
        for(int i=1;i<10;i++)
        {
            if(posicion[i]=='X' || posicion[i]=='O')
            {
                if(i==9)
                {
                    char Draw='E';
                    System.out.println(" El juego esta empatado ");
                    return Draw;
                }
                continue;
            }
            else
            break;
            
        }
        
        return Winner;
    }
    
    public  boolean checkPosn(int spot)
    {
        
        
        if (posicion[spot] == 'X' || posicion[spot] == 'O')
        {
            System.out.println("Esa casilla esta tomada, selecciona otra");
            return true;
        }
        else {
            return false;
        }
    }
    
    
    
    public  void nextPlayer()
    {
        if (jugador == 'X')
        jugador = 'O';
        else jugador = 'X';
        
    }
    
    public String getTitle()
    {
        return "Tic Tac Toe" ;
    }
    
    public  char getPlayer()
    {
        return jugador;
    }
    
}