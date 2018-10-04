package trabalho1;

/**
 *
 * @author salmo
 */
public class ContaEspecial extends Contas {
    private int limite;
    private int multa;

    /**
     *
     * @param multa
     */
    public void descontar(double multa){
        sacar(this.getSaldo()*(-(multa/100)));
    }    
    
    /**
     *
     * @return
     */
    @Override
    public String tipoConta(){
        return "Especial";
    }
    
    /**
     *
     * @return
     */
    public int getLimite() {
        return limite;
    }

    /**
     *
     * @return
     */
    public int getMulta() {
        return multa;
    }

    /**
     *
     * @param limite
     */
    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    /**
     *
     * @param multa
     */
    public void setMulta(int multa) {
        this.multa = multa;
    }
}
