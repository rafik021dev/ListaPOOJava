class BombaCombustivel {

    private String sTipoCombustivel;
    private double dValorLitro;
    private double dQtdCombustivel;

    public BombaCombustivel(String sTipoCombustivel, double dValorLitro, double dQtdCombustivel) {
        this.sTipoCombustivel = sTipoCombustivel;
        this.dValorLitro = dValorLitro;
        this.dQtdCombustivel = dQtdCombustivel;
    }

    public void abastecerPorValor(double dValor) {
        double dLitros = dValor / dValorLitro;
        if (dLitros <= dQtdCombustivel) {
            dQtdCombustivel -= dLitros;
            System.out.println
        }
    }

}
    