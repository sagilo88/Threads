class Animal{
    private int prioridad;

    public int getResvalar() {
        return resvalar;
    }

    public void setResvalar(int resvalar) {
        this.resvalar = resvalar;
    }

    public boolean isCaer() {
        return caer;
    }

    public void setCaer(boolean caer) {
        this.caer = caer;
    }

    private int resvalar;
    private boolean caer;

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
}
class Carrera {
    public static void main(String[] args) {
        Animal liebre=new Animal();
        liebre.setPrioridad(7);
        liebre.setResvalar(40);
        Animal tortuga=new Animal();
        tortuga.setPrioridad(3);
        tortuga.setResvalar(5);
        Animal caballo=new Animal();
        caballo.setPrioridad(8);
        caballo.setResvalar(45);
        Animal perro=new Animal();
        perro.setPrioridad(5);
        perro.setResvalar(25);

        Correr a1 = new Correr(liebre);
        Correr a2 = new Correr(tortuga);
        Correr a3 = new Correr(caballo);
        Correr a4 =new Correr(perro);


    }
}
