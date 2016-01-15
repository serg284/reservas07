package reservas07;

import java.io.*;
import java.util.Scanner;


public class reservas07 {
    public static void main(String[] args) {

        //arrays de salas.tzt
        int[]     salaIdSala = new int[100];                 //coluna1
        String[]  salaNomeSala = new String[100];            //coluna2
        int[]     salaFilas = new int[100];                  //coluna3
        int[]     salaLugares = new int[100];                //coluna4
        String[]  salaNomeEspetaculo = new String[100];      //coluna5
        int[]     salaPrecoBilhete = new int[100];           //coluna6

        //arrays de reservas.txt
        int[]     reservaIdSala = new int[100];              //coluna1
        String[]  reservaNomeEspetaculo = new String[100];   //coluna2
        char[]    reservaCondicao = new char[10];            //coluna3
        int[]     reservaFila = new int[100];                //coluna4
        int[]     reservaLugar = new int[100];               //coluna5
        int[]     reservaDia = new int[100];                 //coluna6
        int[]     reservaMes = new int[100];                 //coluna7
        char[]    reservaSessao = new char[10];              //coluna8

        //declara variaveis
        int num_salas = 0;
        int num_reservas = 0;
        int i, j;
        String output= "";

        
        /**
         *********************************************
         ************ salas.txt **********************
         *********************************************
         */

        // salas.txt : le dados do ficheiro
        Scanner scanner;
        try	{
            scanner = new Scanner( new File("salas.txt") ).useDelimiter( "\\s*:\\s*|\\s*\n\\s*" );
        }
        catch( FileNotFoundException ex )
        {
            System.out.println( ex );
            return;
        }
        
        scanner.skip( "\\s*" );
        
        
        // salas.txt: separa o conteudo da variavel scanner em arrays diferentes.
        for( i = 0;  scanner.hasNextLine();  i++ ){
            salaIdSala[i]         = scanner.nextInt();      //coluna1
            salaNomeSala[i]       = scanner.next();         //coluna2
            salaFilas[i]          = scanner.nextInt();      //coluna3
            salaLugares[i]        = scanner.nextInt();      //coluna4
            salaNomeEspetaculo[i] = scanner.next();         //coluna5
            salaPrecoBilhete[i]   = scanner.nextInt();      //coluna6

            scanner.skip( "\\s*" );
            num_salas++;
        }
        
        
        // salas.txt : output para ecra
        System.out.println("*** salas ***");
        System.out.println("\tC1:idSala \tC2:nomeSala \tC3:fila \tC4:lugares \tC5:nomeEspetaculo \tC6:precoBilhete");
        
        for( i = 0;  i < num_salas;  i++ ){
            System.out.print  ( "L" + i + ":\t") ;
            System.out.print  ( "C1:" + salaIdSala[i]  +        "\t\t");
            System.out.print  ( "C2:" + salaNomeSala[i] +      "\t");
            System.out.print  ( "C3:" + salaFilas[i] +         "\t\t");
            System.out.print  ( "C4:" + salaLugares[i] +       "\t\t");
            System.out.print  ( "C5:" + salaNomeEspetaculo[i] + "\t\t");
            System.out.println( "C6:" + salaPrecoBilhete[i]  +  "\t");
        }

         /**
         *********************************************
         ************ reservas.txt *******************
         *********************************************
         */

        // reservas.txt : le dados do ficheiro
        Scanner scannerReservas;
        try {
            scannerReservas = new Scanner( new File("reservas.txt") ).useDelimiter( "\\s*:\\s*|\\s*\n\\s*" );
        }
        catch( FileNotFoundException ex )
        {
            System.out.println( ex );
            return;
        }
        scannerReservas.skip( "\\s*" );

        // reservas.txt: separa o conteudo da variavel scanner em arrays diferentes.
        System.out.println("*** reservas ***");
        for( j = 0;  scannerReservas.hasNextLine();  j++ ){
            reservaIdSala[i] = scannerReservas.nextInt();           //coluna1
            reservaNomeEspetaculo[i] = scannerReservas.next();      //coluna2
            reservaCondicao[i] = scannerReservas.next().charAt(0);  //coluna3
            reservaFila[i]  = scannerReservas.nextInt();            //coluna4
            reservaLugar[i]  = scannerReservas.nextInt();           //coluna5
            reservaDia[i]    = scannerReservas.nextInt();           //coluna6
            reservaMes[i]   = scannerReservas.nextInt();            //coluna7
            reservaSessao[i] = scannerReservas.next().charAt(0);    //coluna8
 
            scannerReservas.skip( "\\s*" );
            num_reservas++;
        }

        
        // reservas.txt : output para ecra
        //for( j = 0;  j < num_reservas;  j++ ){
        for( i = 0;  i < 10;  i++ ){
            System.out.print  ( "L" + i + ":\t") ;
            System.out.print  ( "C1:" + reservaIdSala[i]          + "\t");
            System.out.print  ( "C2:" + reservaNomeEspetaculo[i]  + "\t");
            System.out.print  ( "C3:" + reservaCondicao[i]        + "\t");
            System.out.print  ( "C4:" + reservaFila[i]            + "\t");
            System.out.print  ( "C5:" + reservaLugar[i]           + "\t");
            System.out.print  ( "C6:" + reservaDia[i]             + "\t");
            System.out.print  ( "C7:" + reservaMes[i]             + "\t");
            System.out.println( "C8:" + reservaSessao[i]          + "\t");
        }
/**
        
        //output.txt
        System.out.println("***  output ***");
        System.out.println("Nome_Espetaculo:" + num_salas);
        System.out.println("Nome_Sala:" + num_reservas);
        System.out.println("Numero_Filas:" + num_reservas);
        System.out.println("Numero_Lugares:" + num_reservas);



/** sessao de sabado        
System.out.println("** inicio **");
System.out.println("lenght:" + condicoes.length);
int totalReservas = 0;
        for (int i = 0; i < condicoes.length ; i++) {
            //mostra as reservas feitas
            if (condicoes[i] == 'R') {
                System.out.println("pos:" + i + " condicao:" + condicoes[i] +  " espectadores: " + espectadores[i]);
            totalReservas++;    //prepara total de reservas
            }
        }
        System.out.println("totalReservas:" + totalReservas);
**/


    }
}
