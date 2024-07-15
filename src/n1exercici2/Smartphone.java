package n1exercici2;

// Classe Smartphone que hereta de Telèfon i implementa Camera i Rellotge
class Smartphone extends Telefon implements Camera, Rellotge {
    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void fotografiar() {
        System.out.println("S’està fent una foto");
    }

    @Override
    public void alarma() {
        System.out.println("Està sonant l’alarma");
    }
}