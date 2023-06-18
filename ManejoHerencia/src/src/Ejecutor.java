import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            opcion = entrada.nextInt();
            System.out.println("-------------------------Bienvenido/a-------------------------");
            System.out.println("---                                                        ---");
            System.out.println("---                                                        ---");
            System.out.println("---Escribe una opción:                                     ---");
            System.out.println("---                                                        ---");
            System.out.println("---                                                        ---");
            System.out.println("---1. Ingresar datos para un préstamo de Automóvil         ---");
            System.out.println("---                                                        ---");
            System.out.println("---                                                        ---");
            System.out.println("---2. Ingresar datos para un préstamo Educativo            ---");
            System.out.println("---                                                        ---");
            System.out.println("--------------------------------------------------------------");

            switch (opcion) {
                case 1:
                    System.out.println("Escriba su nombre");
                    String nombre = entrada.nextLine();

                    System.out.println("Escriba su apellido");
                    String apellido = entrada.nextLine();

                    System.out.println("Escriba la ciudad del préstamo");
                    String ciudad = entrada.nextLine();

                    System.out.println("Escriba el tipo de Automóvil");
                    String auto = entrada.nextLine();

                    System.out.println("Marca del automóvil");
                    String marca = entrada.nextLine();

                    Persona gerente = new Persona(nombre, apellido);

                    System.out.println("Escriba el valor del Automóvil");
                    double valorAutomovil = entrada.nextInt();

                    PrestamosAutomovil prs = new PrestamosAutomovil(auto, marca, gerente, valorAutomovil);
                    prs.calcularValorMensual();

                    System.out.println(prs);
                break;

                case 2:
                    System.out.println("Escriba su nombre");
                    String nombre2 = entrada.nextLine();

                    System.out.println("Escriba su apellido");
                    String apellido2 = entrada.nextLine();

                    System.out.println("Escriba la ciudad del préstamo");
                    String ciudad2 = entrada.nextLine();

                    System.out.println("Nivel estudios");
                    String nivel = entrada.nextLine();

                    System.out.println("Centro estudios");
                    String centro = entrada.nextLine();

                    System.out.println("Valor carrera");
                    double valorCarrera = entrada.nextDouble();

                    PrestamoEducativo prsE = new PrestamoEducativo(nivel, centro, valorCarrera);
                    prsE.calcularValorMensual();

                    System.out.println(prsE);
                break;

                default:
                    System.out.println("WRITE A VALID ANSWER JERCK");
                break;
            }


        }while(opcion != 0);

    }
}
