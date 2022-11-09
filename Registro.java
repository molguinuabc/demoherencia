public class Registro {
    Persona persona;
    public Registro(Persona p) {
       this.persona = p;
    }
    
    public String realizarRegistro() {
        return "Realizando registro de "+ persona.getNombre();
    }
}
