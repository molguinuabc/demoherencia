public class Estudiante extends Persona{

    String carrera;

    public Estudiante(int edad, String nombre, String carrera) {
        super(edad, nombre);
        this.carrera = carrera;
        this.edad = 10;
    }
    
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public String realizaActividadesDiarias() {
        return "\nProgramando y estudiando\n";
    }
}
