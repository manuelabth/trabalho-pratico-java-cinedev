import java.util.Scanner;

public class cineDev {
    public static void main(String args[]) {
      
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
          
        }
   public static void main(String args[]) {
    inicializarSala();
Scanner scanner = new Scanner(System.in);
        int opcao;
          do{
              exibirMenu();
 
           opcao = scanner.nextInt();
           scanner.nextLine();
           
            switch ( opcao){ 
                case 1:
              exibirMapaAssentos( Scanner);
                    break;
                case 2:
                    comprarIngresso( Scanner);
                      break;
                case 3:
                    cancelarCompra();
                      break;
                case 4:
                    exibirRelatorioOcupacao();
                     break;  
                case 5:
                     System.out.println( "Saindo do sistema. Obrigado!");
                      break;
                default :
            System.out.println( " Opção invàlida! Tente novamente");
            }
            
            System.out.println();
          }        while ( opcao != 5 );
          
          scanner.close();
        }

}
    
    
    
    
    
    
    
    
    
    
    

        
        
        
      