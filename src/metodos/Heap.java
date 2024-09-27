package metodos;

public class Heap {
    Manual manual;


    public Heap(){
        this.manual = new Manual();

    }
    public void heapSort(int[] array) {
        int n = array.length;

        // Construir o Max-Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extrair elementos um a um do heap
        for (int i = n - 1; i > 0; i--) {
            // Mover a raiz atual (maior elemento) para o final do array
            trocar(array, 0, i);

            // Chamar heapify no heap reduzido
            heapify(array, i, 0);
        }
        for(int i=0;i<array.length;i++){
            System.out.printf("posição[%d] : %d\n",i,array[i]);
        }
    }

    // Método para transformar uma subárvore em um Max-Heap
    private  void heapify(int[] array, int n, int i) {
        int maior = i;  // Inicialmente, o maior valor é o nó raiz
        int esquerda = 2 * i + 1; // Filho da esquerda
        int direita = 2 * i + 2;  // Filho da direita

        // Se o filho da esquerda for maior que a raiz
        if (esquerda < n && array[esquerda] > array[maior]) {
            maior = esquerda;
        }

        // Se o filho da direita for maior que o maior até agora
        if (direita < n && array[direita] > array[maior]) {
            maior = direita;
        }

        // Se o maior não é a raiz
        if (maior != i) {
            trocar(array, i, maior);

            // Recursivamente transformar o sub-heap afetado em Max-Heap
            heapify(array, n, maior);
        }
    }
    // Método auxiliar para trocar dois elementos no array
    private  void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public String manualHeap(){
        return manual.heap;
    }



}
