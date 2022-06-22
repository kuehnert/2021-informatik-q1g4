package adt.beispiele;

public class Kunde {
    String name;
    String sorte;
    long queuedAt;

    @Override
    public boolean equals(Object other) {
        if (!other.getClass().getSimpleName().equals("Kunde")) {
            return false;
        }

        Kunde otherKunde = (Kunde) other;
        return name.equals(otherKunde.name) && sorte.equals(otherKunde.sorte);
    }

    public Kunde(String name, String sorte) {
        setName(name);
        setSorte(sorte);
        queuedAt = System.currentTimeMillis();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSorte() {
        return sorte;
    }

    public void setSorte(String sorte) {
        this.sorte = sorte;
    }

    public long getQueuedAt() {
        return queuedAt;
    }

    @Override
    public String toString() {
        return name + " will " + sorte;
    }
}
