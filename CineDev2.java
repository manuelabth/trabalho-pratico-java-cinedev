import java.util.Scanner;

public class CineDev2{ 
        
    public static void main(String args[]) {
     // Parte 1 - Matriz bidimensional.
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
   // parte 2 - Loop do menu.
Scanner scanner = new Scanner(System.in);
    
        int opcao;
          do{
             System.out.println("\n === MENU PRINCIPAl === ");
             System.out.println("1. Mapa de Assentos :");
             System.out.println("2. Comprar Ingresso:  :");  
             System.out.println("3. Cancelar Compra :");
             System.out.println("4. Relatório de Ocupação : ");
             System.out.println("5. Sair :");
            System.out.println("Escolha uma opção :");
       
            
            opcao = scanner.nextInt();
           scanner.nextLine();

    
    // Opções do usuario.
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
              
           
          
         
          }        while ( opcao != 5 );
           scanner.close();


    }
}
