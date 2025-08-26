public class main {
    public static void main(String[] args) {

        vehiculos Todoterreno= new vehiculos("Mazda" , "CX5", 0);

        vehiculos Deportivo= new vehiculos("Ferrari" , "296 GTB", 0);
        vehiculos Ciudad= new vehiculos("Renault" , "sandero 1.6", 0);

        vehiculos[] listaVehiculos = {Todoterreno, Deportivo,Ciudad};

        for (vehiculos v : listaVehiculos) {
            v.MostrarInfo();
            v.acelerar();

}
    
    }
}
