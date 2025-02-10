public class Cliente {
   privete String nome;
   privete int id;
   privete double saldo;
   privete String endereco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSaldo() {
        return saldo;
    }
    public double setSaldo(double saldo) {
       return this.saldo = saldo;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /*
     * Metodo para relizar a conta do valor do item comprado e
     * atualizar o novo saldo do cliente
     */
    public void fazerCompra(double valor){
        if (saldo >= valor) {
          setSaldo(saldo - valor);
        }
    }

}
