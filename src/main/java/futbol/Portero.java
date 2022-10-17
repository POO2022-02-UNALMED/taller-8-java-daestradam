package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		// TODO Auto-generated constructor stub
		this.golesRecibidos=golesRecibidos;
		this.dorsal=dorsal;
	}

	public Portero() {
		// TODO Auto-generated constructor stub
	}

	
	public int compareTo(Portero p) {
		// TODO Auto-generated method stub
		if(this.golesRecibidos>=p.golesRecibidos) {
			return this.golesRecibidos-p.golesRecibidos;
		} else {
			return p.golesRecibidos-this.golesRecibidos;
		}
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
