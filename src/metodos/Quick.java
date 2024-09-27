package metodos;
import painel.Vetor;

public class Quick {
   Manual manual;
   private int[]vetor ;
   private int size;
   private int temp;

   private int indicePivo;

   public Quick(int[]vetor , int size){
       super();
       this.manual = new Manual();
       this.vetor = vetor;
       this.size = size;
   }
   //metodo recursivo para a ordenação do vetor por posiçao;
    public  void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            // Particiona o array e retorna o índice do pivô
            indicePivo = partition(array, inicio, fim);

            // Recursivamente aplica o Quicksort nas sublistas
            quickSort(array, inicio, indicePivo - 1); // Parte antes do pivô
            quickSort(array, indicePivo + 1, fim);    // Parte depois do pivô
        }
    }
    //metodo para imprimir o vetor ordenado;
    public void imprimirQuickSort(int[] array){
       for(int i=0;i<size;i++){
           System.out.printf("posiçao[%d] : %d \n",i,array[i]);
       }
    }

    // Método para particionar o array em relação ao pivô
    private  int partition(int[] array, int inicio, int fim) {
        // Escolhemos o último elemento como o pivô
        int pivo = array[fim];
        int i = inicio - 1; // Índice do menor elemento

        for (int j = inicio; j < fim; j++) {
            // Se o elemento atual é menor ou igual ao pivô, faz a troca
            if (array[j] <= pivo) {
                i++; // Incrementa o índice do menor elemento
                trocar(array, i, j);
            }
        }

        // Troca o pivô para sua posição correta
        trocar(array, i + 1, fim);

        return i + 1; // Retorna o índice do pivô
    }

    // Método auxiliar para trocar dois elementos no array
    private  void trocar(int[] array, int i , int j) {
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    //metodo para imprimir a manual do quicksort
    public String manualQuick(){
        return manual.quick;
    }
}
