
package pila;

public class Carrera {
    private String pais;
    private String ciudad;
    private int idCarrera;

    public Carrera(String pais, String ciudad, int idCarrera) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.idCarrera = idCarrera;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }
    
    

    @Override
    public String toString() {
        return "Pais: "  + this.pais + " - Ciudad: " + this.ciudad ;
    }

    
    
    
}
