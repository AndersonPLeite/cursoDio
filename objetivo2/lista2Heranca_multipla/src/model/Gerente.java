package model;

public class Gerente  extends Funcionario implements Investidor{

    private String ticker;
    private int qtdeCotas;

    public Gerente() {
    }
    public Gerente(String nome, double salario, String ticker, int qtdeCotas) {

        super(nome, salario);
        this.ticker = ticker;
        this.qtdeCotas = qtdeCotas;
    }

    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public String getTicker() {
        return "";
    }

    @Override
    public void setTicker(String ticker) {

    }

    @Override
    public int getQtdeCotas() {
        return qtdeCotas;
    }

    @Override
    public void setQtdeCotas(int qtdeCotas) {

    }
}