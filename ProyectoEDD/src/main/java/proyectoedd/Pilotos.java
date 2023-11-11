
package proyectoedd;

public class Pilotos {
    private String nombre, pais, titularOReserva;
    private int edad, id;

    public Pilotos( String nombre, int edad, String pais, String titularOReserva, int id) {
        this.edad = edad;
        this.nombre = nombre;
        this.pais = pais;
        this.titularOReserva = titularOReserva;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return titularOReserva;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTitularOReserva() {
        return titularOReserva;
    }

    public void setTitularOReserva(String titularOReserva) {
        this.titularOReserva = titularOReserva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    @Override
    public String toString() {
        return  " Nombre: " + this.nombre + " edad: " + this.edad + 
                " País: " + this.pais + "." 
                +" Piloto es: " + this.titularOReserva + "." + 
                " Número de coche de F1 " + this.id;
    }
}
