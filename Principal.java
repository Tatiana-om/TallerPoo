
public  class Principal {


    public static void main(String[] args) {
        // Crear instancias de Automovil
        Automovil miAuto = new Automovil("Toyota", "Corolla", 2020);
        Automovil autoAmigo = new Automovil("Honda", "Civic", 2018);

        // Llamar a los métodos de los objetos
        miAuto.acelerar();
        autoAmigo.frenar();
        System.out.println("Mi auto tiene " + miAuto.calcularAntiguedad() + " años.");

        // Crear instancias de Maestro
        Maestro profesorMatematicas = new Maestro("Juan Pérez", "Matemáticas", 15);
        Maestro profesoraLengua = new Maestro("María López", "Lengua", 10);

        // Llamar a los métodos de los objetos
        profesorMatematicas.enseñar();
        profesoraLengua.corregirExamenes(20);
    }

}
