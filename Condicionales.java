import java.util.Scanner; //Importar la libreria Scanner para la entrada del usuario

public class Condicionales{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Solicitar al usuario su edad
        System.out.println("Ingresa tu Edad: ");
        int edad = scanner.nextInt();
    

        //Condicionales para verificar la edad
        if (edad >=18) {
            System.out.println("Eres mayor de edad.");
        } else if (edad >=13 && edad < 18 ){
            System.out.println("Eres un adolecente.");
        }else{
            System.out.println("Eres un niño");
        }

        scanner.close(); // Cerramos el scanner
    }
}