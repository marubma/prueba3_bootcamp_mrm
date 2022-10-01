public class Main {
    public static void main(String[] args) {
       Persona persona = new Persona();
       persona.setEdad("28");
       persona.setNombre("Marta");
       persona.setTelefono("000000000");
       System.out.println(persona.getEdad());
       System.out.println(persona.getNombre());
       System.out.println(persona.getTelefono());

    }
}


class Persona {
    private String edad;
    private String nombre;
    private String telefono;
    public void setEdad(String valor) {
        this.edad = valor;
    }
    public String getEdad() {
        return this.edad;
    }
    public void setNombre(String valor) {
        this.nombre = valor;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String valor) {
        this.telefono = valor;
    }
    public String getTelefono() {
        return this.telefono;
    }
}
