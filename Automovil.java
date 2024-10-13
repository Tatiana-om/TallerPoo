//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Automovil {
        // Atributos
        private String marca;
        private String modelo;
        private int año;

        // Constructor
        public Automovil(String marca, String modelo, int año) {
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
        }

        // Métodos
        public void acelerar() {
            System.out.println("El " + marca + " " + modelo + " está acelerando.");
        }

        public void frenar() {
            System.out.println("El " + marca + " " + modelo + " está frenando.");
        }

        public int calcularAntiguedad() {
            int añoActual = 2024; // Puedes reemplazar con el año actual
            return añoActual - año;
        }



}


