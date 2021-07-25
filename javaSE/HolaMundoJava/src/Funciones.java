public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        // Area de un circulo
        // PI * r2
        double area = circleAre(y);
        System.out.println(area);

        // Area de una esfera
        // 4*PI*r2
        sphereArea(y);

        // Volumen de una esfera
        // (4/3)*PI*r3
        sphereVolumen(y);

        System.out.println("Pesos a dolares: " + converToDolar(200, "COL"));
    }
    
    public static double circleAre(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }
    
    public static double sphereVolumen(double r) {
        return (4 / 3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     * 
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COL
     * @return quantity Devulelve la cantidad actualizada en dolares
     */
    public static double converToDolar(double quantity, String currency) {
        // MXN COL
        switch (currency) {
        case "MXN":
            quantity = quantity * 0.052;
            break;
        case "COL":
            quantity = quantity * 0.00031;
        default:
            break;
        }
        return quantity;
    }
}
