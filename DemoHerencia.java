public class DemoHerencia {
    public static void main(String[] args) {
       

        //System.out.println(p.realizaActividadesDiarias());  

        Estudiante e = new Estudiante(20,"Joe","Computacion");

        //System.out.println(e.realizaActividadesDiarias());

        Registro r = new Registro(e);

        System.out.println(r.realizarRegistro());

        r = new Registro(new Profesor(50,"Jane", "Torturar"));

        System.out.println(r.realizarRegistro());
    }
}
