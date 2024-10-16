import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorDivisas conversorDivisas = new ConversorDivisas();
        ConversorTemperaturas conversorTemperaturas = new ConversorTemperaturas();

        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Conversor de Divisas");
            System.out.println("2. Conversor de Temperaturas");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirDivisas(scanner, conversorDivisas);
                    break;
                case 2:
                    convertirTemperaturas(scanner, conversorTemperaturas);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, elige nuevamente.");
            }
        }
    }

    public static void convertirDivisas(Scanner scanner, ConversorDivisas conversorDivisas) {
        while (true) {
            System.out.println("Ingrese la cantidad a convertir:");
            double cantidad = scanner.nextDouble();

            System.out.println("Seleccione la divisa de origen:");
            System.out.println("1. USD (Dólar estadounidense)");
            System.out.println("2. EUR (Euro)");
            System.out.println("3. COP (Peso colombiano)");
            int opcionOrigen = scanner.nextInt();

            System.out.println("Seleccione la divisa de destino:");
            System.out.println("1. USD (Dólar estadounidense)");
            System.out.println("2. EUR (Euro)");
            System.out.println("3. COP (Peso colombiano)");
            int opcionDestino = scanner.nextInt();

            String monedaOrigen = obtenerMonedaPorOpcion(opcionOrigen);
            String monedaDestino = obtenerMonedaPorOpcion(opcionDestino);

            double resultado;
            resultado = conversorDivisas.convertir(monedaOrigen, monedaDestino, cantidad);
            System.out.printf("La conversión de %.2f %s a %s es: %.2f\n", cantidad, monedaOrigen, monedaDestino, resultado);

            System.out.println("¿Desea realizar otra conversión? (sí/no)");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("sí")) {
                break;
            }
        }
    }

    private static String obtenerMonedaPorOpcion(int opcion) {
        switch (opcion) {
            case 1: return "USD";
            case 2: return "EUR";
            case 3: return "COP";
            default: return "USD"; // Por defecto
        }
    }

    public static void convertirTemperaturas(Scanner scanner, ConversorTemperaturas conversorTemperaturas) {
        while (true) {
            System.out.println("Ingrese la cantidad a convertir:");
            double cantidad = scanner.nextDouble();

            System.out.println("Seleccione la unidad de origen:");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            int opcionOrigen = scanner.nextInt();

            System.out.println("Seleccione la unidad de destino:");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            int opcionDestino = scanner.nextInt();

            double resultado = 0.0;
            switch (opcionOrigen) {
                case 1: // Celsius
                    if (opcionDestino == 2) {
                        resultado = conversorTemperaturas.celsiusAFahrenheit(cantidad);
                    } else if (opcionDestino == 3) {
                        resultado = conversorTemperaturas.celsiusAKelvin(cantidad);
                    } else {
                        resultado = cantidad;
                    }
                    break;
                case 2: // Fahrenheit
                    if (opcionDestino == 1) {
                        resultado = conversorTemperaturas.fahrenheitACelsius(cantidad);
                    } else if (opcionDestino == 3) {
                        resultado = conversorTemperaturas.fahrenheitAKelvin(cantidad);
                    } else {
                        resultado = cantidad;
                    }
                    break;
                case 3: // Kelvin
                    if (opcionDestino == 1) {
                        resultado = conversorTemperaturas.kelvinACelsius(cantidad);
                    } else if (opcionDestino == 2) {
                        resultado = conversorTemperaturas.kelvinAFahrenheit(cantidad);
                    } else {
                        resultado = cantidad;
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
                    continue;
            }

            System.out.printf("La conversión es: %.2f\n", resultado);

            System.out.println("¿Desea realizar otra conversión? (sí/no)");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("sí")) {
                break;
            }
        }
    }
}


