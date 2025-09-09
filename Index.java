import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.50, 1000);

        int iOpcao;
        do {
            System.out.println("\n=== MENU BOMBA DE COMBUSTÍVEL ===");
            System.out.println("1 - Abastecer por valor");
            System.out.println("2 - Abastecer por litro");
            System.out.println("3 - Alterar valor por litro");
            System.out.println("4 - Alterar tipo de combustível");
            System.out.println("5 - Alterar quantidade de combustível");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            iOpcao = scanner.nextInt();

            switch (iOpcao) {
                case 1:
                    System.out.print("Digite o valor em R$: ");
                    double dValor = scanner.nextDouble();
                    bomba.abastecerPorValor(dValor);
                    break;
                case 2:
                    System.out.print("Digite a quantidade em litros: ");    
                    double dLitros = scanner.nextDouble();
                    bomba.abastecerPorLitro(dLitros);
                    break;
                case 3:
                    System.out.print("Digite o novo valor por litro: ");
                    double dNovoValor = scanner.nextDouble();
                    bomba.alterarValor(dNovoValor);
                    break;
                case 4:
                    System.out.print("Digite o novo tipo de combustível: ");
                    scanner.nextLine();
                    String sNovoTipo = scanner.nextLine();
                    bomba.alterarCombustivel(sNovoTipo);
                    break;
                case 5:
                    System.out.print("Digite a nova quantidade de combustível: ");
                    double dNovaQtd = scanner.nextDouble();
                    bomba.alterarQuantidadeCombustivel(dNovaQtd);
                    break;
                case 0:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (iOpcao != 0);

        scanner.close();
    }
}
