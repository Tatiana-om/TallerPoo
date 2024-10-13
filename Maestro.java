public class Maestro {

        // Atributos
        private String nombre;
        private String materia;
        private int añosExperiencia;

        // Constructor
        public Maestro(String nombre, String materia, int añosExperiencia) {
            this.nombre = nombre;
            this.materia = materia;
            this.añosExperiencia = añosExperiencia;
        }

        // Métodos
        public void enseñar() {
            System.out.println(nombre + " está enseñando " + materia);
        }

        public void corregirExamenes(int cantidadExamenes) {
            System.out.println(nombre + " está corrigiendo " + cantidadExamenes + " exámenes.");
        }
    }

