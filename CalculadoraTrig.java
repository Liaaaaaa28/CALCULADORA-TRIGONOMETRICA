import java.util.Scanner;

public class CalculadoraTrig {
    public static void main(String[] args) {
//_______________________________________________________________________________________________________________________
// Declaracion de variables

Scanner Scanner = new Scanner(System.in); // Scanner para obtener la funcion que el usuario desee

int opcion = -1;

while (opcion != 0) {

System.out.println("escoja la funcion que desea calcular: ");

System.out.println("1. sin \n2. cos \n3. tan \n4. arcsin \n5. arcos \n6. arctan \n7. sinh \n8. cosh \n9. tanh \n0. salir");

opcion = Scanner.nextInt();

//_______________________________________________________________________________________________________________________
// calcular el sin de un angulo 
if (opcion == 1) {;
    System.out.println("Ingrese el angulo en radianes: ");
    double angulo = Scanner.nextDouble();
    double resultado = Math.sin(angulo);
    System.out.println("El resultado de sin(" + angulo + ") es: " + resultado);
  
}
//_______________________________________________________________________________________________________________________
//calcular el cos de un angulo
else if (opcion == 2) {
    System.out.println("Ingrese el angulo en radianes: ");
    double angulo = Scanner.nextDouble();
    double resultado =Math.cos(angulo);
    System.out.println("El resultado de cos(" + angulo + ") es: " +resultado );
}
//_______________________________________________________________________________________________________________________
// calcular la tan de un angulo
else if (opcion == 3) {
    System.out.println("Ingrese el angulo en radianes: ");
    double angulo =Scanner.nextDouble();
    double resultado =Math.tan(angulo);
    System.out.println("El resultado de tan("+ angulo + ") es: " + resultado);
    
}
//_______________________________________________________________________________________________________________________
}// cierre del while

Scanner.close();
}// cierre del metodo main

}// cierre de la clase CalculadoraTrig
