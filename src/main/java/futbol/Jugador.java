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

	public int compareTo(Futbolista o) {
		// TODO Auto-generated method stub
		if(this.getEdad()>=o.getEdad()) {
			return this.getEdad()-o.getEdad();
		} else {
			return o.getEdad()-this.getEdad();
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

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
