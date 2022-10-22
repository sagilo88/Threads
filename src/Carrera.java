class Animal{

    private String nombre;
    private int prioridad;
    private int resvalar;
    private long caer;
    private static int posicion;
    public int getPosicion() {
        return posicion;
    }
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getResvalar() {
        return resvalar;
    }
    public void setResvalar(int resvalar) {
        this.resvalar = resvalar;
    }
    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public long getCaer() {
        return caer;
    }

    public void setCaer(long caer) {
        this.caer = caer;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
class Carrera {
    public static void main(String[] args) {
        Animal liebre=new Animal();
        liebre.setPrioridad(7);
        liebre.setResvalar(40);
        liebre.setNombre("Liebre");
        Animal tortuga=new Animal();
        tortuga.setPrioridad(3);
        tortuga.setResvalar(5);
        tortuga.setNombre("Tortuga");
        Animal caballo=new Animal();
        caballo.setPrioridad(8);
        caballo.setResvalar(45);
        caballo.setNombre("Caballo");
        Animal perro=new Animal();
        perro.setPrioridad(5);
        perro.setResvalar(25);
        perro.setNombre("Perro");

        Correr a1 = new Correr(liebre);
        Correr a2 = new Correr(tortuga);
        Correr a3 = new Correr(caballo);
        Correr a4 =new Correr(perro);

        a1.start();
        a2.start();
        a3.start();
        a4.start();
        try {
            a1.wait((liebre.getCaer() * 10000));
            a2.wait((tortuga.getCaer() * 10000));
            a3.wait((caballo.getCaer() * 10000));
            a4.wait((perro.getCaer() * 10000));
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
    }
