public class CustomThread extends Thread {
    int id;
    Contador conta;
    CustomThread (int id,Contador c){
        this.id=id;
        this.conta=c;
    }
    public void run() {
        for(int i=0;i<500;i++){
            this.conta.setContador(this.conta.getContador()+1);
        }
        System.out.printf("Hola, soy %d y mi contador es:%d\n", this.id,this.conta.getContador());
    }

}
