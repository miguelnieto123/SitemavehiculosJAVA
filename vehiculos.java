

public class vehiculos {
        private String marca;
        private String modelo;
        private Integer velocidad;



        public vehiculos(String marca,String modelo,Integer velocidad) {
            this.marca =marca;
            this.modelo=modelo;
            this.velocidad=velocidad;
        }

        public String getMarca() {
            return marca;
        }

        public String setMarca(String marca){
            return this.marca=marca;
        }
        public String getModelo() {
            return modelo;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
        public Integer getVelocidad() {
            return velocidad;
        }

        public void setVelocidad(Integer velocidad) {
            this.velocidad = velocidad;
        }

        public void MostrarInfo(){
            System.out.println("Marca del carro "+marca);
            System.out.println("Modelo del carro "+modelo);
            
        }
        
        public void acelerar() {
        setVelocidad(getVelocidad() + 20);
        System.out.println("El coche acelera rápidamente a " + getVelocidad() + " km/h");
    }

        }
    

