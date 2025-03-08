import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bienvenido ingresa la hora deseada en formato 0-23 !");
        byte hora = scanner.nextByte();
        System.out.println("bienvenido ingresa los minutos 0-60 !");
        int minutos = scanner.nextInt();

        if (hora <= 23 && hora >= 0 && minutos <= 60 && minutos >= 0) {
            if (minutos == 0) {
                System.out.println("la hora ingresada es : " + hora + ":" + minutos);

                switch (hora) {
                    case hora == 1 || hora == 13:
                        if (hora == 1) {
                            System.out.println("son las una y punto de la mañana  ");

                        } else {
                            System.out.println("son las una de la tarde ");
                        }
                        break;

                    default:
                        break;
                }

            }
        } else {

            System.out.println("la hora ingresada no es valida");
        }

        scanner.close();
    }
}
