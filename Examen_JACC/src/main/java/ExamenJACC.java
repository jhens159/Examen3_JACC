
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorio
 */
public class ExamenJACC {
        public void imprimir(int[][] matriz){
            for (int[] matriz1 : matriz) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(matriz1[j] + "\t");
                }
                System.out.println("");
            }
    }
     public int[][] ejercicio6JACC(int dimen, int NumInit){
          System.out.println("Ejercicio 6JACC: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                  if ( j<i+1){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }   
              }contador=0;
          }
          return matriz;
     }
         public int[][] ejercicio9JACC(int dimen, int NumInit){
          System.out.println("Ejercicio 9JACC: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                  if (j>=dimen-(i+1)){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
          return matriz;
     } 
          public int[][] ejercicio12JACC(int dimen, int NumInit){
          System.out.println("Ejercicio 12JACC: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
              for (int j = matriz[0].length-1; j>=0; j--) {
                  if (j>=i){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
          return matriz;
     }
           public int[][] ejercicio26JACC(int dimen, int NumInit){
         System.out.println("Ejercicio 26JACC: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = 0; i< matriz.length ; i ++) {
                if(contador%2==0){
                    for (int j = matriz[0].length-1; j>=0; j--) { 
                    matriz[i][j]=NumInit; 
                    NumInit++;
                    contador++;
         }
         }else{
               for (int j = 0; j< matriz.length ; j ++) {
                matriz[i][j]=NumInit;
                NumInit++;
                contador++;
                }
            } 
          } contador=0;         
    return matriz;
    }
          
 
public static void main(String[] args) {
               Scanner o=new Scanner(System.in);
               ExamenJACC or=new ExamenJACC();
               System.out.println("Ingrese la dimencion de la matriz: ");
               int din=o.nextInt();
               System.out.println("Ingrese el numero de inicio: ");
               int ini=o.nextInt();
               System.out.println("\n");
               or.imprimir(or.ejercicio6JACC(din, ini));
               or.imprimir(or.ejercicio9JACC(din, ini));
               or.imprimir(or.ejercicio12JACC(din, ini)); 
               or.imprimir(or.ejercicio26JACC(din, ini));
}
}

