package painel;

import alunos.Aluno;

import java.util.List;
import java.util.Scanner;
//classe para manipular o painel de instruçcao e de apresentacao do projeto
public class Painel extends Aluno {

    private  int option = 8;
    private final String metodo1 = "METODO BUBBLESORT";
    private final String metodo2 = "METODO SELECTIONSORT";
    private final String metodo3 = "METODO INSERCTIONSORT";
    private final String metodo4 = "METODO QUICKSORT";
    private final String metodo5 = "METODO MERGESORT";
    private final String metodo6 = "METODO HEAPSORT";
    private final String metodo7 = "COMPARAR TEMPO DE EXECUCAO ";
    private final String metodo8 = "MANUAL";
    private final String metodo9 = "SAIR";

    public Painel(){//construtor padrao para a classe painel;

    }

    //metodo para desenhar a apresentacao padrao do projeto;
    public void draw(){
        System.out.println("****************************************************************");
        System.out.println("\tTRABALHO DO GREENVILLE!!!\t\n");
        System.out.println(escreverAlunos());
        System.out.println("****************************************************************");
    }

    //metodo criativo para limpar o cmd(nao deixar o terminal poluido com informaçoes);
    public void limparCmd(){
        for(int i=0;i<500;i++){
            System.out.println("\r\n");
        }
    }

    //metodo que imprimi na tela todas as opçoes interativas;
    public void menuIterativo(){

        System.out.println("\n\t ESCOLHA AS SEGUINTES OPÇOES : \n");
        System.out.println("1)METODO BUBBLESORT");
        System.out.println("2)METODO SELECTIONSORT");
        System.out.println("3)METODO INSERCTIONSORT");
        System.out.println("4)METODO QUICKSORT");
        System.out.println("5)METODO MERGESORT");
        System.out.println("6)METODO HEAPSORT");
        System.out.println("7)COMPARAR TEMPO DOS ALGORITMOS ");
        System.out.println("8)MANUAL");
        System.out.println("9)SAIR");

    }

    //metodo para escolher a opcao que o usuario digitar;
    public void chooseAchoice(int num){
        Scanner read = new Scanner(System.in);
           switch (num) {
                case 1:
                    System.out.println("\t"+metodo1);
                    break;

                case 2:
                    System.out.println("\t"+metodo2);
                    break;

                case 3:
                    System.out.println("\t"+metodo3);
                    break;

                case 4:
                    System.out.println("\t"+metodo4);
                    break;

                case 5:
                    System.out.println("\t"+metodo5);
                    break;

                case 6:
                    System.out.println("\t"+metodo6);
                    break;

                case 7:
                    System.out.println("\t"+metodo7);
                    break;

                case 8:
                    System.out.println("\t"+metodo8);
                    break;

                case 9:
                    System.out.println("\t"+metodo9);
                    System.exit(0);
                    break;

                default:
                    System.out.println("opcao invalida!. digite novamente : ");
                    menuIterativo();
                    chooseAchoice((num = read.nextInt()));
            }
    }

}
