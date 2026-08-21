package www.cibertec;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static double calcularPrecioPostre ( int tipo){
            double precio = 0.0;

            if (tipo == 1) {
                precio = 6.0;  // Tres leches
            } else if (tipo == 2) {
                precio = 8.0;  // Cheesecake
            } else {
                precio = 10.0; // Torta de chocolate
            }

            return precio;
        }

        public static void main (String[]args){

            String cliente = "Manuel";
            int cantidadPorciones = 4, opcionPostre = 3;
            double precioUnitario, totalAcumulado = 0.0;

            String nombrePostre = "";

            switch (opcionPostre) {
                case 1:
                    nombrePostre = "Tres Leches";
                    break;
                case 2:
                    nombrePostre = "Cheesecake";
                    break;
                case 3:
                    nombrePostre = "Torta de Chocolate";
                    break;
            }
            precioUnitario = calcularPrecioPostre(opcionPostre);

            for (int i = 1; i <= cantidadPorciones; i++) {
                totalAcumulado = totalAcumulado + precioUnitario;
            }

            // Salida de resultados
            System.out.println("TICKET DE CAFETERÍA");
            System.out.println("Cliente: " + cliente);
            System.out.println("Postre: " + nombrePostre);
            System.out.println("Cantidad: " + cantidadPorciones);
            System.out.println("TOTAL A PAGAR: S/. " + totalAcumulado);


        }
    }
