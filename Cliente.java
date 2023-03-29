public class Cliente {

    public String nome;
    private Telefone t;
    private int cpf;

    public Cliente(String nome, int cpf, Telefone t) {

        this.nome = nome;
        this.cpf = cpf;
        this.t = t; 

    }



    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {

        this.cpf = cpf;
    }



    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "o nome do cliente é " + this.nome + " seu cpf é de " + this.cpf + " e seu dd" + this.t.getdd() + " seu numero é " + this.t.getnumero();
    }



}
