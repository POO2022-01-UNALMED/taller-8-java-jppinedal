package futbol;

public abstract class Futbolista implements Comparable<Object> {
	private String nombre;
    private int edad;
    private final String posicion;
    
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
    }
    
    public boolean equals(Futbolista futbolista) {
		if(this == futbolista) {
			return true;
		}else {
			return false;
		}
	}
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }
    public abstract boolean jugarConLasManos();
}

