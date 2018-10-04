package trabalho1;

/**
 *
 * @author salmo
 */
public class Contas {
    private String nome;
    private int numero;
    private double saldo;
    
    /**
     *
     * @param valor
     */
    public void depositar(double valor){    
        this.saldo+=valor;        
    }
    
    /**
     *
     * @param valor
     */
    public void sacar(double valor){
            this.saldo-=valor;
            System.out.println("Saque efetuado com sucesso!");        
    }
    
    /*public void transferir(int conta1, int conta2, double valor){
        
    }*/
    
    /**
     *
     * @return
     */
    public String tipoConta(){
        return "Comum";       
    }
    
    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }
    
    /**
     *
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
