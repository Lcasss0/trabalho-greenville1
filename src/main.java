import desempenho.Desempenho;
import metodos.*;
import alunos.Aluno;
import painel.Painel;
import painel.Vetor;
import metodos.*;

import java.sql.Time;
import java.util.Locale;
import java.util.Scanner;


public class main {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Painel painel = new Painel();//classe para desenhar interaçoes do painel;
        Selection selectionSort = new Selection();//classe com o metodo de ordenação selection sort;
        Insertion insertion = new Insertion();//classe com o metodo de ordenação insertion sort;
        Bubble bubble = new Bubble();//classe com o metodo de ordenação bubble sort
        Merge merge = new Merge();//classe com o metodo de ordenação merge sort
        Heap heap = new Heap();//classe com o metodo de ordenação heap sort
        int readint = 0;
        long inicio = 0;
        long fim = 0;


       painel.draw();
       painel.menuIterativo();


       System.out.println("\nDIGITE UMA OPÇÃO : \n");
       int poc = read.nextInt();
       painel.chooseAchoice(poc);
       if(poc == 7){
           System.out.println("\n\t DIGITE O METODO DE ORDENAÇÃO DESEJADO : \n\t");
           int ler = read.nextInt();

           Vetor vetor = new Vetor(100);
           vetor.preencherComNumerosAleatorios();
           vetor.imprimirVetor();
           opcoesEscolha(ler,vetor);

           System.out.println("\n\tDESEJA CONTINUAR O ALGORITMO ?, DIGITE 1 PARA SIM E 2 PARA NAO : \n");
           int escolha1 = continuar(read.nextInt());
           continuarCodigo(escolha1, painel);


       }
       else {

           System.out.println("\n\t DIGITE O INTERVALO DE NUMEROS A SER IMPRESSO NO VETOR : \n");
           readint = read.nextInt();

           Vetor vetor = new Vetor(readint);
           vetor.preencherComNumerosAleatorios();
           vetor.imprimirVetor();

           opcoesEscolha(poc, vetor);
           System.out.println("\n\tDESEJA CONTINUAR O ALGORITMO ?, DIGITE 1 PARA SIM E 2 PARA NAO : \n");
           int escolha1 = continuar(read.nextInt());
           continuarCodigo(escolha1, painel);
       }
    }

    //retorno do intervalo escolhido pelo usuario que sera armazenda na classe Vetor no atributo intervlao por meio de um ponteiro
    public static int intervalo(){
        System.out.println("digite o intervalo de numeros para ser imprimido :");
        return read.nextInt();
    }

    public static void opcoesEscolha(int choice, Vetor vetor){

        Selection selectionSort = new Selection();//classe com o metodo de ordenação selection sort;
        Insertion insertion = new Insertion();//classe com o metodo de ordenação insertion sort;
        Bubble bubble = new Bubble();//classe com o metodo de ordenação bubble sort
        Merge merge = new Merge();//classe com o metodo de ordenação merge sort
        Heap heap = new Heap();//classe com o metodo de ordenação heap sort
        Quick quick = new Quick(vetor.getVetor(),vetor.getTamanhoVetor());
        Painel painel = new Painel();
        long inicio =0;
        long fim =0;


        switch(choice){
            case 1 :
                System.out.println("\n\tORDENADO POR METODO BUBBLESORT\t\n");
                inicio = System.currentTimeMillis();
                bubble.ordernarBubble(vetor.getVetor(),50);
                fim = System.currentTimeMillis();
                Desempenho desempenho = new Desempenho(inicio,fim);
                System.out.println("\ntempo de exucução : "+desempenho.calculoTempo(fim,inicio)+"ms");
                break;

            case 2 :
                System.out.println("\n\tORDENADO POR METODO SELECTIONSORT\t\n");
                long inicio1 = System.currentTimeMillis();
                selectionSort.metodoSort(vetor.getVetor());
                long fim1 = System.currentTimeMillis();
                desempenho= new Desempenho(inicio1,fim1);
                System.out.println("\ntempo de exucução : "+desempenho.calculoTempo(fim1,inicio1)+"ms");
                break;

            case 3 :
                System.out.println("\n\tORDENADO POR METODO INSERTIONSORT\t\n");
                long inicio2 = System.currentTimeMillis();
                insertion.ordernarInsertion(vetor.getVetor(),vetor.getTamanhoVetor());
                long fim2 = System.currentTimeMillis();
                desempenho = new Desempenho(inicio2,fim2);
                System.out.println("\ntempo de execução : "+desempenho.calculoTempo(fim2,inicio2)+"ms");
                break;

            case 4 :
                System.out.println("\n\tORDEANDO POR METODO QUICKSORT\t\n");
                long inicio3 = System.currentTimeMillis();
                quick.quickSort(vetor.getVetor(),0,vetor.getTamanhoVetor()-1);
                quick.imprimirQuickSort(vetor.getVetor());
                long fim3 = System.currentTimeMillis();
                desempenho = new Desempenho(inicio3,fim3);
                System.out.println("\ntempo de execução : "+desempenho.calculoTempo(fim3,inicio3)+ "ms");
                break;

            case 5 :
                System.out.println("\n\tORDENADO POR METODO MERGESORT\t\n");
                long inicio4 = System.currentTimeMillis();
                merge.printArray(vetor.getVetor());
                long fim4 = System.currentTimeMillis();
                desempenho = new Desempenho(inicio4,fim4);
                System.out.println("tempo de execução : "+desempenho.calculoTempo(fim4,inicio4)+"ms");
                break;

            case 6 :
                System.out.println("\n\tORDENADO POR METODO HEAPSORT\t\n");
                long inicio5 = System.currentTimeMillis();
                heap.heapSort(vetor.getVetor());
                long fim5 =System.currentTimeMillis();
                desempenho = new Desempenho(inicio5,fim5);
                System.out.println("\ntempo de execução : "+desempenho.calculoTempo(fim5,inicio5)+"ms");
                break;

            case 7 :
                System.out.println("\n\tCOMPARANDO TEMPO DOS ALGORITMOS :\t\n");
                break;

            case 8 :
                System.out.println("\n\t MANUAL DE AJUDA ! \n\t");
                ajuda(bubble,heap,insertion,merge,quick,selectionSort);
                break;

            case 9 :
                System.out.println("\n\t SAINDO!!!\n\t");
                System.exit(0);
                break;
        }

    }
    public static void ajuda(Bubble bubble, Heap heap, Insertion insertion,Merge merge,Quick quick, Selection selection){

        System.out.println(bubble.manualBubble());
        System.out.println(heap.manualHeap());
        System.out.println(insertion.manualInsertion());
        System.out.println(merge.manualMerge());
        System.out.println(quick.manualQuick());
        System.out.println(selection.manualSelection());
    }
    //verificar se vai continuar ou nao o jogo;
    public static int continuar(int num){
        if(num == 1){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void continuarCodigo(int escolha ,Painel painel){

        Vetor vetor = new Vetor(100);//variavel usada somente para inicializar o construtor da classe Quick.
        Selection selectionSort = new Selection();//classe com o metodo de ordenação selection sort;
        Insertion insertion = new Insertion();//classe com o metodo de ordenação insertion sort;
        Bubble bubble = new Bubble();//classe com o metodo de ordenação bubble sort
        Merge merge = new Merge();//classe com o metodo de ordenação merge sort
        Heap heap = new Heap();//classe com o metodo de ordenação heap sort
        Quick quick = new Quick(vetor.getVetor(),vetor.getTamanhoVetor());

        int readint =0;
        int choose =0;
        int var = 0;

        if(escolha == 1 ){
            while(escolha != 9){
                painel.menuIterativo();

                System.out.println("\n\tDIGITE UMA OPÇÃO : \n");
                painel.chooseAchoice((choose = read.nextInt()));

                //comparação para quando o usuairo querer abrir o menu de ajuda;
                if(choose == 8){
                    System.out.println("\n\t EXPLICAÇÃO DE CADA ALGORITMO\n\t");
                    ajuda(bubble,heap,insertion,merge,quick,selectionSort);
                    System.out.println();
                    painel.menuIterativo();
                    System.out.println("\n\tDIGITE UMA OPÇÃO : \n");
                    painel.chooseAchoice((choose = read.nextInt()));
                }
                //comparação de tempo dos algoritmos de ordenação;
                if(choose == 7){
                    System.out.println("digite qual algoritmo quer ver o desempenho : \n");
                    var = read.nextInt();
                    painel.chooseAchoice(var);


                }

                System.out.println("\n\t DIGITE O INTERVALO DE NUMEROS A SER IMPRESSO NO VETOR  \n");
                readint = read.nextInt();


                vetor.preencherComNumerosAleatorios();
                vetor.imprimirVetor();
                opcoesEscolha(choose, vetor);

            }
        }
        else{
            System.out.println("\n\tENCERRANDO........");
        }
    }
}
