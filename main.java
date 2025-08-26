public class main {
    public static void main(String[] args) {
        // Crear objetos
        Vehiculo  Ferrari= new Vehiculo("Ferrari", "295 ");
        Vehiculo Toyota = new Coche("Toyota", "Corolla");
        Vehiculo Volvo = new Camion("Volvo", "FH16");

        
        Vehiculo[] listaVehiculos = {Ferrari, Toyota, Volvo};

       
        for (Vehiculo v : listaVehiculos) {
            v.mostrarInfo();
            v.acelerar();

        }
    }
}