public class Correr extends Thread {
    Animal b=new Animal();
    Correr(Animal a) {

    b.setPrioridad(a.getPrioridad());
    b.setResvalar(a.getResvalar());
    b.setCaer(a.getCaer());
    b.setPosicion(a.getPosicion());
    b.setNombre(a.getNombre());
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            if((Math.random()*100 + b.getResvalar())>=100){
                b.setCaer(b.getCaer()+1);
            }
        }
        System.out.println(b.getNombre() + " ha llegado.");
    }
}
