public class Main {
    public static void main(String[] args) {
       Persona persona = new Persona();
       persona.setEdad(28);
       persona.setNombre("Marta");
       persona.setTelefono(696780999);
       System.out.println(persona.getEdad());
       System.out.println(persona.getNombre());
       System.out.println(persona.getTelefono());

    }
}


class Persona {
    private int edad;
    private String nombre;
    private int telefono;
    public void setEdad(int valor) {
        this.edad = valor;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setNombre(String valor) {
        this.nombre = valor;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(int valor) {
        this.telefono = valor;
    }
    public int getTelefono() {
        return this.telefono;
    }
}
