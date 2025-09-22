public class CineDev {
    public static void main(String[] args) {
//Inicializa a matriz com 'L' (assentos livres)

        char[][] salaDeCinema = new char[10][20];

        for (int i = 0; i < salaDeCinema.length; i++) {
            for (int j = 0; j < salaDeCinema[i].length; j++) {
                salaDeCinema[i][j] = 'L';
            }
        }
        System.out.print("Assentos:   ");
        for (int j = 0; j < salaDeCinema[0].length; j++) {
            System.out.printf("%2d ", j + 1);
        }
        System.out.println();

        for (int i = 0; i < salaDeCinema.length; i++) {
            System.out.printf("Fileira %2d: ", i + 1);
            for (int j = 0; j < salaDeCinema[i].length; j++) {
                System.out.print("[" + salaDeCinema[i][j] + "]" );
            }
            System.out.println();
        }
    // Exibe o menu principal
             Scanner scanner = new Scanner(System.in);
    
        int opcao;
          do{
             System.out.println("\n === MENU PRINCIPAl === ");
             System.out.println(" 1. Mapa de Assentos :");
             System.out.println(" 2. Comprar Ingresso:  :");  
             System.out.println(" 3. Cancelar Compra :");
             System.out.println(" 4.Relatório de Ocupação : ");
             System.out.println(" 5.Sair :");
            System.out.println(" Escolha uma opção :");
           
            switch ( opcao){ 
                case 1:
              exibirMapa( salaDeCinema);
                    break;
                case 2:
                    comprarIngresso(salaDeCinema, Scanner);
                      break;
                case 3:
                    cancelarCompra(salaDeCinema, Scanner);
                      break;
                case 4:
                    exibirRelatorioOcupacao(salaDeCinema);
                     break;  
                case 5:
                     System.out.println( "Saindo do sistema. Obrigado!");
                      break;
                default :
            System.out.println( " Opção invàlida! Tente novamente");
            }
              
           opcao = scanner.nextInt();
           scanner.nextLine();
           
          
         
          }        while ( opcao != 5 );
           scanner.close();

private static void comprarIngresso(Scanner scanner) {
        System.out.println("Digite a fileira (1-10): ");
        int fileira = sc.nextInt();
        System.out.println("Digite o assento (1-20): ");
        int assento = sc.nextInt();

        if (validarPosicao(fileira, assento)) {
            if (sala[fileira - 1][assento - 1] == 'L') {
                sala[fileira - 1][assento - 1] = 'X';
                System.out.println("Ingresso comprado com sucesso!");
            } else {
                System.out.println("Assento já está ocupado. Tente outro.");
            }
        } else {
            System.out.println("Número de fileira ou assento inválido.");
        }
    }

    private static void cancelarCompra(Scanner scanner) {
        System.out.println("Digite a fileira (1-10): ");
        int fileira = sc.nextInt();
        System.out.println("Digite o assento (1-20): ");
        int assento = sc.nextInt();

        if (validarPosicao(fileira, assento)) {
            if (sala[fileira - 1][assento - 1] == 'X') {
                sala[fileira - 1][assento - 1] = 'L';
                System.out.println("Compra cancelada com sucesso!");
            } else {
                System.out.println("Este assento já está livre.");
            }
        } else {
            System.out.println("Número de fileira ou assento inválido.");
        }
    }