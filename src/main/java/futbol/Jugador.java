package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		// TODO Auto-generated constructor stub
		this.golesMarcados=golesMarcados;
		this.dorsal=dorsal;
	}
	
	public Jugador() {
		// TODO Auto-generated constructor stub
		super();
		golesMarcados=289;
		dorsal=7;
	}

	@Override
	public int compareTo(Futbolista f) {
		// TODO Auto-generated method stub
		if(this.getEdad()>=f.getEdad()) {
			return this.getEdad()-f.getEdad();
		} else {
			return f.getEdad()-this.getEdad();
		}
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
	}

}
