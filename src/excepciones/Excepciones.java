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
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    
    static ControlExcepciones CE = new ControlExcepciones();
    static int opcion;
    
    public static void main(String[] args) {
        // TODO code application logic here
        do {
            CE.menu();
            opcion = CE.pedirEntero("Dime una opcion");
            if (opcion == 1){
                CE.numeros();
                System.out.println("\n");
            }
            if (opcion == 2){
                CE.letrasGuion();
                System.out.println("\n");
            }
            if (opcion == 3){
                CE.letrasGuion2();
                System.out.println("\n");
            }
            if (opcion == 4){
                CE.numeroEntre110();
                System.out.println("\n");
            }
            if (opcion >= 5){
                System.out.println("Opcion incorrecta");
                System.out.println("\n");
            }
        }while (opcion != 0);
        {
        }  
    }    
}

/*

Ejercicio1 Definiciones:

1. java.lang.Throwable:

The java.lang.Throwable class is the superclass of all errors and exceptions in the Java language.
Only objects that are instances of this class (or one of its subclasses) are thrown by the Java Virtual Machine
or can be thrown by the Java throw statement.

2. java.lang.Exception

The class Exception and its subclasses are a form of Throwable that indicates conditions that a reasonable application might want to catch.
The class Exception and any subclasses that are not also subclasses of RuntimeException are checked exceptions. 
Checked exceptions need to be declared in a method or constructor's throws clause if they can be thrown by the execution of the method 
or constructor and propagate outside the method or constructor boundary.

3. java.lang.RuntimeException

RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine.
RuntimeException and its subclasses are unchecked exceptions. 
Unchecked exceptions do not need to be declared in a method or constructor's throws clause
if they can be thrown by the execution of the method or constructor and propagate outside the method 
or constructor boundary.

4. java.lang.ArithmeticException

Thrown when an exceptional arithmetic condition has occurred. 
For example, an integer "divide by zero" throws an instance of this class. 
ArithmeticException objects may be constructed by the virtual machine as if suppression
were disabled and/or the stack trace was not writable.

5. java.lang.IndexOutOfBoundsException

Thrown to indicate that an index of some sort (such as to an array, to a string, or to a vector) is out of range.
Applications can subclass this class to indicate similar exceptions.

6. java.lang.StringIndexOutOfBoundsException 

Thrown by String methods to indicate that an index is either negative or greater than the size of the string. 
For some methods such as the charAt method, this exception also is thrown when 
the index is equal to the size of the string.

7. java.lang.NullPointerException

Thrown when an application attempts to use null in a case where an object is required. These include:
Calling the instance method of a null object.
Accessing or modifying the field of a null object.
Taking the length of null as if it were an array.
Accessing or modifying the slots of null as if it were an array.
Throwing null as if it were a Throwable value.

8. java.lang.NoSuchElementException

Thrown by the nextElement method of an Enumeration to indicate that there are no more elements in the enumeration.

9. java.lang.InputMismatchException

Thrown by a Scanner to indicate that the token retrieved does not match the pattern for the expected type, or that the token is out of range for the expected type.

10. java.lang.IllegalStateException

Signals that a method has been invoked at an illegal or inappropriate time. 
In other words, the Java environment or Java application is not in an appropriate state for the requested operation.

11. java.lang.IllegalArgumentException

Thrown to indicate that a method has been passed an illegal or inappropriate argument.

*/
