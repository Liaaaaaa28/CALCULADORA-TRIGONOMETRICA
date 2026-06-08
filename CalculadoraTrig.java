import java.util.Scanner;

public class CalculadoraTrig {
    public static void main(String[] args) {
//_______________________________________________________________________________________________________________________
// Declaracion de variables

Scanner Scanner = new Scanner(System.in); // Scanner para obtener la funcion que el usuario desee

int opcion = -1;

while (opcion != 0) {
System.out.println("------------------------------------------------------------------------");
System.out.println("Escoja la funcion que desea calcular: ");
System.out.println("------------------------------------------------------------------------");

System.out.println("1. sin \n2. cos \n3. tan \n4. arcsin \n5. arcos \n6. arctan \n7. sinh \n8. cosh \n9. tanh \n0. Salir");
System.out.println("------------------------------------------------------------------------");

opcion = Scanner.nextInt();

//_______________________________________________________________________________________________________________________
// Calcular el sin de un angulo 
if (opcion == 1) {;
    System.out.println("Ingrese el angulo en radianes: ");
    double angulo = Scanner.nextDouble();
    double resultado = Math.sin(angulo);
    System.out.println("El resultado de sin(" + angulo + ") es: " + resultado);
  
}
//_______________________________________________________________________________________________________________________
//Calcular el cos de un angulo
else if (opcion == 2) {
    System.out.println("Ingrese el angulo en radianes: ");
    double angulo = Scanner.nextDouble();
    double resultado =Math.cos(angulo);
    System.out.println("El resultado de cos(" + angulo + ") es: " +resultado );
}
//_______________________________________________________________________________________________________________________
// Calcular la can de un angulo
else if (opcion == 3) {
    System.out.println("Ingrese el angulo en radianes: ");
    double angulo =Scanner.nextDouble();
    double resultado =Math.tan(angulo);
    System.out.println("El resultado de tan("+ angulo + ") es: " + resultado);
    
}
//_______________________________________________________________________________________________________________________

// Calcular el Arcoseno de un angulo.
else if (opcion == 4) {
    System.out.println("Ingrese el angulo en radianes: ");
    double angulo =Scanner.nextDouble();
    double resultado =Math.asin(angulo);
    System.out.println("El resultado del Arcoseno("+ angulo + ") es: " + resultado);
    
}
//_______________________________________________________________________________________________________________________

// Calcular el Arcocoseno de un angulo.
else if (opcion == 5) {
    System.out.println("Ingrese el angulo en radianes: ");
    double angulo =Scanner.nextDouble();
    double resultado =Math.acos(angulo);
    System.out.println("El resultado del Arcocoseno("+ angulo + ") es: " + resultado);
    
}
//_______________________________________________________________________________________________________________________

// Calcular la Arcotangente de un angulo.
else if (opcion == 6) {
    System.out.println("Ingrese el angulo en radianes: ");
    double angulo =Scanner.nextDouble();
    double resultado =Math.atan(angulo);
    System.out.println("El resultado de Arcotangente("+ angulo + ") es: " + resultado);
    
}
//_______________________________________________________________________________________________________________________
}// cierre del while

Scanner.close();
}// cierre del metodo main

}// cierre de la clase CalculadoraTrig
