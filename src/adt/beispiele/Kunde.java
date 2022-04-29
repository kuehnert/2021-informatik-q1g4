package adt.beispiele;

public class Kunde {
    String name;
    String sorte;
    long queuedAt;

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
