public class ContaBanco {

    public int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void imprimirDetalhes(){
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Cliente: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if(tipo == "CC"){
            this.setSaldo(50f);
        } if (tipo == "CP") {
            this.setSaldo(150f);
        }
        System.out.println("conta aberta com sucesso");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("conta ainda tem " + saldo + "reais");
        } if (this.getSaldo() < 0) {
            System.out.println("Conta em débito, fechamento impossível");
        } else {
            this.setStatus(false);
            System.out.println("conta fechada com sucesso");
        }

    }

    public void depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("impossível depositar em uma conta fechada!");
        }

    }

    public void sacar(float valor){
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("saldo insuficiente para saque");
            }
        } else{
            System.out.println("impossivel sacar de uma conta fechada");
        }

    }

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo()=="CC"){
            v = 12;
        } if (this.getTipo()=="CP"){
            v = 20;
        } if (this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("mensalidade paga por " + this.getDono());
            } else {
            System.out.println("impossivel pagar conta fechada");
        }



    }

    public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status){
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.setSaldo(0f);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
