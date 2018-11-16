/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alu2016394
 */
public class ControlExcepciones {
    
    static int[] v1 = {10, 20, 30};
    int[] v2 = null;
    static String s1 = "Hola Mon";
    String s2 = "";
    static String[] vS1 = {"programa", "sense", "car Error"};
    String[] vS2 = null;
    
        /*
    Metodo para pedir datos
     */
    public static String pedirCadena(String texto) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena = "";
        do {
            try {
                System.out.println(texto);
                cadena = br.readLine();
                if (cadena.equals("")) {
                    System.out.println("No se puede dejar el campo en blanco.");
                }
            } catch (IOException ex) {
                System.out.println("Error de entrada / salida.");
            }
        } while (cadena.equals(""));
        return cadena;
    }
    //Metodo pedir entero
    public static int pedirEntero(String texto) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        boolean error;
        do {
            try {
                System.out.println(texto);
                num = Integer.parseInt(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("Error de entrada / salida.");
                error = true;
            } catch (NumberFormatException ex) {
                System.out.println("Debes introducir un número entero.");
                error = true;
            }
        } while (error);
        return num;
    }
    
    public static void numeroEntre110() {
        try{
        int hola = pedirEntero("Dime un numero entre el 1 y el 10");
        if (hola>0 && hola<=10){
            System.out.println("El numero es " +hola);      
        }
        else{
            System.out.println("Introduce un numero valido");
        }
        }catch(Exception e){
            System.out.println("\nExcepció capturada al mètode numeroEntre110");
            e.printStackTrace();
            System.out.println("--------------"); 
        }
        
    }
    
    public static void letrasGuion() {
        try{
        String[] splited = s1.split("");
        for (int i=0; i < splited.length ; i++){
            System.out.print(splited[i]+"-");
        }
        }catch(Exception e){
            System.out.println("\nExcepció capturada al mètode letrasGuion");
            e.printStackTrace();
            System.out.println("--------------"); 
        }
    }
    public static void letrasGuion2(){
        try{
        for (int i=0; i < vS1.length ; i++){
            System.out.print(vS1[i]+"-");
        }
        }catch(Exception e){
            System.out.println("\nExcepció capturada al mètode letrasGuion2");
            e.printStackTrace();
            System.out.println("--------------"); 
        }
    }
    public static void numeros() {
        try{
        for (int i = 0; v1.length > i; i++){
            System.out.println(v1[i]);
        }
        }catch(Exception e){
            System.out.println("\nExcepció capturada al mètode numeros");
            e.printStackTrace();
            System.out.println("--------------"); 
        }
    }
    
    public static void menu(){
        System.out.println("1. Mostrar un vector");
        System.out.println("2. Mostrar un String caràcter a caràcter");
        System.out.println("3. Mostrar un array d’Strings caràcter a caràcter");
        System.out.println("4. Pedir un numero entre 1 y 10");
        System.out.println("0. Salir");
    }
    
}
