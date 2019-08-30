package Estrutura;

import java.util.Scanner;


public class ListaContatos {

    public static void main(String[] args) {



        String[] empresa = new String[100];
        String[] nome = new String[100];
        String[] telefone = new String[100];

        for (int i = 0; i < 10; i++) {
            empresa[i]="";
            nome[i]="";
            telefone[i]="";           
        }
        
        String opcao="";
        String continuar="";
        int posicao=0;
        String nomeExcluir="";
        
        
        Scanner leia = new Scanner(System.in);

        do {

            System.out.println("Adicionar - Carregar - Excluir - Sair");
            opcao = leia.nextLine();

            switch (opcao) {
                case "Adicionar":
                
                    do {
                        System.out.print("Digite a Empresa:");
                        empresa[posicao]=leia.nextLine();
                        
                        System.out.print("Digite o Nome :");
                        nome[posicao]=leia.nextLine();
                        
                        System.out.print("Digite o Telefone:");
                        telefone[posicao]=leia.nextLine();
                        
                        System.out.print("Deseja Continuar?");
                        continuar = leia.nextLine();
                        
                        posicao++;
                        
                    } while (continuar.equals("Sim"));
                    

                    break;

                case "Carregar":
                    for (int i = 0; i < 100;  i++) {
                        
                        if (!nome[i].equals("")){
                            
                        System.out.println("Empresa:" + empresa[i] + 
                                " Nome:" + nome[i] +  " Telefone:" + 
                                telefone[i]);
                        }
                    }
                    break;

                case "Excluir":
                    System.out.println("Quem deseja excluir:");
                    nomeExcluir = leia.nextLine();

                    for (int i = 0; i < 100; i++) {
                        if (nome[i].equals(nomeExcluir)){
                            nome[i]="";
                            telefone[i]="";
                                   
                        }
                    }
                    

                    break;

                case "Sair":
                    
                    System.out.println("Programa Finalizado");
                    return;

                default:
                    
                    System.out.println("Opção Invalida!");
                    
                    break;
                    
            }

        } while (!opcao.equals("Sair"));

    }
}
