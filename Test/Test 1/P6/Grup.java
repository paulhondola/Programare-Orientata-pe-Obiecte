import java.util.*;

class Grup extends Destinatar {

	private Set<Destinatar> membri = new HashSet<>();

	public Grup(String nume) {
		this.nume = nume;
	}

	public void inscrie(Destinatar destinatar) {
		if (membri.contains(destinatar)) {
			System.out.println("Destinatarul este deja membru al grupului");
		} else {
			membri.add(destinatar);
		}
	}

	public void receptioneaza(Utilizator utilizator, String mesaj) {
		for (Destinatar destinatar : membri) {
			destinatar.receptioneaza(utilizator, mesaj);
		}
	}
}
