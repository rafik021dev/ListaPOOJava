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
            System.out.printf("Foram abastecidos %.2f litros. Combustível restante na bomba: %.2f litros%n", dLitros, dQtdCombustivel);
        } else {
            System.out.println("Combustível insuficiente na bomba.");
        }
    }

    public void abastecerPorLitro(double litros) {
        if (litros <= dQtdCombustivel) {
            double dValorPagar = litros * dValorLitro;
            dQtdCombustivel -= litros;
            System.out.printf("Valor a pagar: R$ %.2f. Combustível restante na bomba: %.2f litros%n", dValorPagar, dQtdCombustivel);
        } else {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        }
    }

    public void alterarValor(double dNovoValor) {
        dValorLitro = dNovoValor;
        System.out.println("Novo valor por litro: R$ " + dValorLitro);
    }

    public void alterarCombustivel(String novoTipo) {
        sTipoCombustivel = novoTipo;
        System.out.println("Novo tipo de combustível: " + sTipoCombustivel);
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        dQtdCombustivel = novaQuantidade;
        System.out.println("Nova quantidade de combustível: " + dQtdCombustivel + " litros");
    }


}