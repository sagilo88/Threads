class Contador{
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    private int contador=0;

}
class Main {
    public static void main(String[] args) {
        Contador O = new Contador();
        int id=1;
        CustomThread t1=new CustomThread(id, O);
        t1.start();
        CustomThread t2=new CustomThread(id+1,O);
        t2.start();
        CustomThread t3=new CustomThread(id+2,O);
        t3.start();
        CustomThread t4=new CustomThread(id+3,O);
        t4.start();
    }
}