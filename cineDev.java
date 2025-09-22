import java.util.Scanner;

public class cineDev{ 
        
    



    public static void main(String[] args) {
        // Inicializa a matriz com 'L' (assentos livres)
        char[][] salaDeCinema = new char[10][20];

        for (int i = 0; i < salaDeCinema.length; i++) {
            for (int j = 0; j < salaDeCinema[i].length; j++) {
                salaDeCinema[i][j] = 'L';
            }
        }

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Mapa de Assentos");
            System.out.println("2. Comprar Ingresso");
            System.out.println("3. Cancelar Compra");
            System.out.println("4. Relatório de Ocupação");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exibirMapa(salaDeCinema);
                    break;
                case 2:
                    comprarIngresso(salaDeCinema, scanner);
                    break;
                case 3:
                    cancelarCompra(salaDeCinema, scanner);
                    break;
                case 4:
                    exibirRelatorioOcupacao(salaDeCinema);
                    break;
                case 5:
                    System.out.println("Saindo do sistema. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }

    // Exibe o mapa de assentos
    public static void exibirMapa(char[][] sala) {
        System.out.print("Assentos:   ");
        for (int j = 0; j < sala[0].length; j++) {
            System.out.printf("%2d ", j + 1);
        }
        System.out.println();

        for (int i = 0; i < sala.length; i++) {
            System.out.printf("Fileira %2d: ", i + 1);
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print("[" + sala[i][j] + "]");
            }
            System.out.println();
        }
    }

    // Compra um ingresso
    public static void comprarIngresso(char[][] sala, Scanner scanner) {
        System.out.print("Informe o número da fileira (1 a 10): ");
        int fileira = scanner.nextInt();
        System.out.print("Informe o número do assento (1 a 20): ");
        int assento = scanner.nextInt();

        if (fileira < 1 || fileira > 10 || assento < 1 || assento > 20) {
            System.out.println("Assento inválido! Tente novamente.");
            return;
        }

        if (sala[fileira - 1][assento - 1] == 'X') {
            System.out.println("Assento já está ocupado!");
        } else {
            sala[fileira - 1][assento - 1] = 'X';
            System.out.println("Ingresso comprado com sucesso!");
        }
    }

    // Cancela uma compra
    public static void cancelarCompra(char[][] sala, Scanner scanner) {
        System.out.print("Informe o número da fileira (1 a 10): ");
        int fileira = scanner.nextInt();
        System.out.print("Informe o número do assento (1 a 20): ");
        int assento = scanner.nextInt();

        if (fileira < 1 || fileira > 10 || assento < 1 || assento > 20) {
            System.out.println("Assento inválido! Tente novamente.");
            return;
        }

        if (sala[fileira - 1][assento - 1] == 'L') {
            System.out.println("O assento já está livre.");
        } else {
            sala[fileira - 1][assento - 1] = 'L';
            System.out.println("Compra cancelada com sucesso.");
        }
    }

    // Exibe relatório de ocupação
    public static void exibirRelatorioOcupacao(char[][] sala) {
        int total = 0;
        int ocupados = 0;

        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                total++;
                if (sala[i][j] == 'X') {
                    ocupados++;
                }
            }
        }

        int livres = total - ocupados;
        double percentual = ((double) ocupados / total) * 100;

        System.out.println("\n=== RELATÓRIO DE OCUPAÇÃO ===");
        System.out.println("Total de assentos: " + total);
        System.out.println("Assentos ocupados: " + ocupados);
        System.out.println("Assentos livres: " + livres);
        System.out.printf("Percentual de ocupação: %.2f%%\n", percentual);
    }
}

    
    
    
    

        
        
        
      