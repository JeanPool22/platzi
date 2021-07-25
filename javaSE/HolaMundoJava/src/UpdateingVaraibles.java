public class UpdateingVaraibles {
    public static void main(String[] args) {
        int salary = 1000;

        //bono $200
        //salary = salary + 200;
        salary += 200;
        System.out.println(salary);

        //persion $50 descuento
        //salary = salary - 50;
        salary -= 50;
        System.out.println(salary);

        //2 horas extra %30 c/u
        //comida $45
        //salary = salary + (2 * 30) - 45;
        salary += (2 * 30) - 45;
        System.out.println(salary);

        //Actualizando cadensa de texto
        String employeeName = "Jean Zambrano";
        employeeName = employeeName + " Hernandez";
        System.out.println(employeeName);
    }
}
