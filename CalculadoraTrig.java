import java.util.Scanner;

public class CalculadoraTrig {
    public static void main(String[] args) {
//_______________________________________________________________________________________________________________________

System.out.println("escoja la funcion que desea calcular: ");

System.out.println("1. sin \n2. cos \n3. tan \n4. arcsin \n5. arcos \n6. arctan \n7. sinh \n8. cosh \n9. tanh");

Scanner Scanner = new Scanner(System.in); // Scanner para obtener la funcion que el usuario desee

// calcular el sin de un angulo 
int opcion = Scanner.nextInt();
if (opcion == 1) {
    System.out.println("Ingrese el angulo en radianes: ");
    double angulo = Scanner.nextDouble();
    double resultado = Math.sin(angulo);
    System.out.println("El resultado de sin(" + angulo + ") es: " + resultado);
    Scanner.close();
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

}
}