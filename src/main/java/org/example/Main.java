package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Auto> autos = new ArrayList<>();

        int opcion;
        do{

            System.out.println("\n CONCESIONARIO");
            System.out.println("1. Agregar Auto");
            System.out.println("2. Mostrar Autos");
            System.out.println("3. Actualizar Km");
            System.out.println("4. Verificar Antiguedad");
            System.out.println("5. Verificar Mantenimiento");
            System.out.println("6. Calcular Consumo Combustible");
            System.out.println("7. Combustible");
            System.out.println("Seleccione una Opcion:");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese la placa: ");
                    System.out.print("Ingrese marca: ");
                    System.out.print("Ingrese modelo: ");
                    System.out.print("Ingrese año: ");
                    System.out.print("Ingrese kilometraje: ");
                    System.out.print("Ingrese consumo de combustible (litros/km): ");
                    System.out.print("Ingrese estado: ");

                }

                case 2 -> {
                    if (autos.isEmpty()) {
                        System.out.println("No hay autos registrados.");
                    } else {
                        autos.forEach(auto -> {
                            auto.mostrardetalles();
                            System.out.println("Registrado con Exito");
                        });
                    }
                }

                case 3 -> {
                    System.out.print("Ingrese la placa del auto: ");
                    String placaActualizar = scanner.nextLine();
                    for (Auto auto : autos) {
                        if (auto.getPlaca().equalsIgnoreCase(placaActualizar)) {
                            System.out.print("Ingrese los km recorridos: ");
                            double kmRecorridos = scanner.nextDouble();
                            auto.actualizarkm(kmRecorridos);
                        }
                    }
                }

                case 4 -> {
                    System.out.print("Ingrese la placa del auto: ");
                    String placaAntiguo = scanner.nextLine();
                    for (Auto auto : autos) {
                        if (auto.getPlaca().equalsIgnoreCase(placaAntiguo)) {
                            System.out.println("Antiguedad: " + auto.antiguedad());
                        }
                    }
                }

                case 5 -> {
                    System.out.print("Ingrese la placa del auto: ");
                    String placaMantenimiento = scanner.nextLine();
                    for (Auto auto : autos) {
                        if (auto.getPlaca().equalsIgnoreCase(placaMantenimiento)) {
                            System.out.println("Mantenimiento " + auto.mantenimiento());
                        }
                    }
                }

                case 6 -> {
                    System.out.print("Ingrese la placa del auto: ");
                    String placaConsumo = scanner.nextLine();
                    for (Auto auto : autos) {
                        if (auto.getPlaca().equalsIgnoreCase(placaConsumo)) {
                            System.out.print("Ingrese la distancia recorrida en km: ");
                            double distancia = scanner.nextDouble();
                            double consumo = auto.consumoCombustible(distancia);
                            System.out.println("Consumo " + consumo + " litros.");

                        }
                    }
                }

                case 7 -> {
                    System.out.print("Ingrese la placa del auto: ");
                    String placaRest = scanner.nextLine();
                    for (Auto auto : autos) {
                        if (auto.getPlaca().equalsIgnoreCase(placaRest)) {
                            System.out.print("Ingrese la distancia recorrida en km: ");
                            double distanciaRest = scanner.nextDouble();
                            System.out.print("Ingrese el combustible actual en litros: ");
                            double combustibleAct = scanner.nextDouble();
                            double combustibleFinal = auto.combustibleRest(distanciaRest, combustibleAct);
                            System.out.println("Combustible " + combustibleFinal + " litros.");
                            break;
                        }
                    }
                }

                case 8 -> {
                    System.out.println("Saliendo");
                    scanner.close();
                    return; // Sale del programa
                }

                default -> System.out.println("Opción inválida");
            }
        } while (opcion !=8);
    }
}