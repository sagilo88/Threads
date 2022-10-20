public class Correr extends Thread {
    Animal b=new Animal();
    Correr(Animal a) {

    b.setPrioridad(a.getPrioridad());
    b.setResvalar(a.getResvalar());
    b.setCaer(a.isCaer());

    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            if((Math.random()*100 +
        }
    }
}
