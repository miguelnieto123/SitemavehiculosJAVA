

public class Vehiculo {
  
    private String marca;
    private String modelo;
    private int velocidad;

  
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad >= 0) {
            this.velocidad = velocidad;
        } else {
            System.out.println("La velocidad no puede ser negativa.");
        }
    }

    
    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo + " | Velocidad: " + velocidad + " km/h");
    }

   
    public void acelerar() {
        velocidad += 10;
        System.out.println("El vehículo acelera a " + velocidad + " km/h");
    }
}


class Coche extends Vehiculo {
    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }

  
    @Override
    public void acelerar() {
        setVelocidad(getVelocidad() + 20);
        System.out.println("El coche acelera rápidamente a " + getVelocidad() + " km/h");
    }
}


class Camion extends Vehiculo {
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    
    @Override
    public void acelerar() {
        setVelocidad(getVelocidad() + 8);
        System.out.println("El camión acelera lentamente a " + getVelocidad() + " km/h");
    }
}