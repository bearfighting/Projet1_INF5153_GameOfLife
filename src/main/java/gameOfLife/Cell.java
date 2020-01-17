package gameOfLife;

public class Cell {
    private Etats etat;

    public Cell(Etats etat) {
        this.etat = etat;
    }

    public void setEtat(Etats etat) {
        this.etat = etat;
    }

    public Etats getEtat() {
        return etat;
    }

    @Override
    public String toString() {
        return etat == Etats.Dead ? "0" : "1";
    }
}
