package trabalho1;

import javax.swing.JOptionPane;
        
/**
 *
 * @author Salmo Mascarenhas - salmo.cruz@gmail.com
 */
public class Principal {
    
    /**
     *
     */
    public static Contas c1 = new Contas();

    /**
     *
     */
    public static ContaPoupanca c2 = new ContaPoupanca();

    /**
     *
     */
    public static ContaEspecial c3 = new ContaEspecial();
        
    /**
     *
     * @param args
     */
    public static void main(String args[]){
        JFrameInicio inicio = new JFrameInicio(Principal.c1, Principal.c2, Principal.c3);
        
        //Recebendo Conta Comum
        JOptionPane.showMessageDialog(null,"BEM VINDO!");
        
        JOptionPane.showMessageDialog(null,"Em seguida digite as informações da "
                + "CONTA-COMUM.",null,JOptionPane.INFORMATION_MESSAGE);
        
        c1.setNome(JOptionPane.showInputDialog(null,"Digite o nome do titular:"
                ,"conta-comum",JOptionPane.QUESTION_MESSAGE));
        
        c1.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite "
                + "o número da conta (Ex: 6040):","conta-comum",JOptionPane.QUESTION_MESSAGE)));
        
        c1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null,"Digit"
                + "e o saldo inicial R$:","conta-comum",JOptionPane.QUESTION_MESSAGE)));
        //FIM Recebendo Conta Comum
        
        
        //Recebendo Conta Poupança
        JOptionPane.showMessageDialog(null,"Em seguida digite as informações da "
                + "conta-poupança",null,JOptionPane.INFORMATION_MESSAGE);
        
        c2.setNome(JOptionPane.showInputDialog(null,"Digite o nome do titular:"
                ,"conta-poupança.",JOptionPane.QUESTION_MESSAGE));
        
        c2.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite "
                + "o número da conta (Ex: 6040):","conta-poupança",JOptionPane.QUESTION_MESSAGE)));
        
        c2.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null,"Digit"
                + "e o saldo inicial R$:","conta-poupança",JOptionPane.QUESTION_MESSAGE)));
        
        c2.reajustar(Double.parseDouble(JOptionPane.showInputDialog(null,"Digit"
                + "e a taxa (Ex: 5%):","conta-poupança",JOptionPane.QUESTION_MESSAGE)));
        //FIM Recebendo Conta Poupança
        
        
        //Recebendo Conta Especial
        JOptionPane.showMessageDialog(null,"Em seguida digite as informações da "
                + "conta-especial",null,JOptionPane.INFORMATION_MESSAGE);
        
        c3.setNome(JOptionPane.showInputDialog(null,"Digite o nome do titular:"
                ,"conta-especial.",JOptionPane.QUESTION_MESSAGE));
        
        c3.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite "
                + "o número da conta: (Ex: 6040)","conta-especial",JOptionPane.QUESTION_MESSAGE)));
        
        c3.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null,"Digit"
                + "e o saldo inicial R$:","conta-especial",JOptionPane.QUESTION_MESSAGE)));
        
        c3.setLimite(Integer.parseInt(JOptionPane.showInputDialog(null,"Digit"
                + "e o limite R$:","conta-especial",JOptionPane.QUESTION_MESSAGE)));
        
        c3.setMulta(Integer.parseInt(JOptionPane.showInputDialog(null,"Digit"
                + "e a multa: (Ex: 10%):","conta-especial",JOptionPane.QUESTION_MESSAGE)));
        //FIM Recebendo Conta Especial
        
        
        inicio.setVisible(true);
    }
}
