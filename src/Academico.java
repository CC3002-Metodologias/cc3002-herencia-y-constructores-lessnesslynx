public class Academico extends Persona {

    public Academico(String nombre, String ocupacion, int edad) {
        super(nombre, ocupacion, edad);
    }

    public void dormir() {
        System.out.println("ZzzZzZ");
    }

    public void crearPapel(){
        System.out.println("Paper");
    }

}
