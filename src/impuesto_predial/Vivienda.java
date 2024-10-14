
package impuesto_predial;


public class Vivienda {
    private String matricula;
    private String direccion;
    private String nombrePropietario;
    private String apellidoPropietario;
    private String barrio;

    public Vivienda() {
    }

    public Vivienda(String numeroMatricula, String direccion, String nombrePropietario, String apellidoPropietario, String barrio) {
        this.matricula = numeroMatricula;
        this.direccion = direccion;
        this.nombrePropietario = nombrePropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.barrio = barrio;
    }

    public String getNumeroMatricula() {
        return matricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.matricula = numeroMatricula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getApellidoPropietario() {
        return apellidoPropietario;
    }

    public void setApellidoPropietario(String apellidoPropietario) {
        this.apellidoPropietario = apellidoPropietario;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    @Override
    public String toString(){
        return "Matricula: " + matricula + " Direccion: " + direccion + " Nombre del propietario: "
                +nombrePropietario + " Apellido: " + apellidoPropietario + " Barrio: " + barrio;
    }
    
}
