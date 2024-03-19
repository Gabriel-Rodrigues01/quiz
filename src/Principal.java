//FACULDADE:Centro Universitário Afredo Nasser.
        //ALUNO:Gabriel Rodrigues Pereira 2ºPeríodo.
        //PROFESSOER: Brenno Pimenta.
        //QUIZ DA SITCOM THE BIG BANG THEORY.
        
        //INICIO DO SCANNER PARA A DIGITAÇÃO DO USUARIO.
        import java.util.Scanner;
        public class Principal{
           public static void main(String[] args) {
               System.out.println("#################################################################");
               System.out.println("##################  THE BIG BANG THEORY   #######################");
               System.out.println("######################################  .QUIZ  ##################");
               System.out.println("#################################################################");
   
               //ATRIBUIÇÃO DA VARIAVEL SCANNER PARA DIGITAÇÃO DO USUARIO.
               Scanner entrada = new Scanner(System.in);
               int continua = 1;
   
               //INICIO DO LAÇO.
               while (continua != 10){
   
                   //INICIO DO QUIZ.
                   System.out.println(" \nEscolhab uma das opções da baara de menu do nosso Quiz \n");
                   System.out.println("  -------------------------------------------------- ");
                   System.out.println(" | 1-iniciar | 2-regras | 3-desenvolverdor | 4-Sair |");
                   System.out.println("  -------------------------------------------------- ");
                   System.out.println("\nNUMERO: ");
                   //INIO DA LEITURA VALOR DO USUARIO.
                   int escolhaMenu = entrada.nextInt();
                   //FIM DA LEITURA DO DIA.
           
           //INICIO DE CASE 
           switch (escolhaMenu) {
               case 1:
               int resp = 0;
               System.out.println("\nconfigurações iniciais do quiz");
               //INICIO DO DELAY.
               try{
               Thread.sleep(2000);
               } catch (Exception e){
                   e.printStackTrace();
               }
                //FIM DODELAY.
   
                //ESCOLHA DO USUARIO.
                System.err.println("1-Inicio   2-Ioltar para o menu ou sair\n");
                System.err.println("Numero: ");
                //FIM DA ESCOLHA.
                int opcusuario = entrada.nextInt();
                switch (opcusuario){
                    case 1:
                       int pt=0;
                         //INICIO DAS QUESTOES.
                         System.out.println("Digite seu nome: " );
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                }
   
   
   
   
   
   
   
   
           }
   
               }
          
          
          
          
          
          
           }
   
        
           
        }