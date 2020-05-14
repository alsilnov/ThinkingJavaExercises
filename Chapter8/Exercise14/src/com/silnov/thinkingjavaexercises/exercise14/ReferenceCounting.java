package com.silnov.thinkingjavaexercises.exercise14;

class Shared {
    private long refCount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        System.out.println("Create " + this);
    }
    public void addRef() {
        ++refCount;
    }
    public void subRef() {
        --refCount;
    }
    protected void finalize() {
        if(refCount != 0) {
            System.out.println("NOT Disposing " + this + " because refCount == " + refCount);
        }
    }
    protected void dispose() {
        if(--refCount == 0) {
            System.out.println("Disposing " + this);
        }
    }
    public String toString() {
        return "Shared " + id;
    }
    public long getId() {
        return id;
    }
}
class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        System.out.println("Create " + this + " Shared " + shared.getId());
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        System.out.println("Disposing " + this + " Shared " + shared.getId());
        shared.dispose();
    }
    public String toString() {
        return "Composing " + id;
    }
}
class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared_1 = new Shared();
        Shared shared_2 = new Shared();
        Composing[] composing = { new Composing(shared_1), new Composing(shared_1), new Composing(shared_1), new Composing(shared_1), 
            new Composing(shared_2), new Composing(shared_2), new Composing(shared_2), new Composing(shared_2), new Composing(shared_2) };
        for(Composing c : composing) {
            c.dispose();
        }
        new Composing(new Shared());
        System.gc();
    }
}