//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Classe abstracta Instrument
abstract class Instrument {
    // Atributs de classe
    private String nom;
    private double preu;
    protected static int instancesCreated = 0;

    public Instrument(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
        instancesCreated++;
    }

    // Mètode abstracte
    public abstract void tocar();
}

// Classe Vent que hereta de Instrument
class Vent extends Instrument {
    public Vent(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }
}

// Classe Corda que hereta de Instrument
class Corda extends Instrument {
    public Corda(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}

// Classe Percussio que hereta de Instrument
class Percussio extends Instrument {
    public Percussio(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }
}

public class Main {
    public static void main(String[] args) {
        // Demostració de la càrrega de la classe
        System.out.println("Creació de la primera instància:");
        Vent flauta = new Vent("Flauta", 150);
        flauta.tocar();
        System.out.println("Creació de la segona instància:");
        Corda guitarra = new Corda("guitarra", 300);
        guitarra.tocar();
        System.out.println("Creació de la tercera instància:");
        Percussio bateria=new Percussio("bateria",500);
        bateria.tocar();
        // Accés a un membre estàtic
        System.out.println("\nAccés a un membre estàtic:");
        System.out.println("Nombre d'instàncies creades: " + Instrument.instancesCreated);
    }
}
