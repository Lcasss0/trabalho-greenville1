package metodos;


public class Merge {
    Manual manual;

    public Merge(){//construtor padrao da classe merge com a instanciação do atributo manual do tipo manual;
        this.manual = new Manual();
    }

    // Método que implementa o Merge Sort
    private  void mergeSort(int[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            // Encontra o meio do array
            int meio = (esquerda + direita) / 2;

            // Ordena a primeira metade
            mergeSort(array, esquerda, meio);

            // Ordena a segunda metade
            mergeSort(array, meio + 1, direita);

            // Junta as duas metades
            merge(array, esquerda, meio, direita);
        }
    }

    // Método para juntar os sub-arrays
    private void merge(int[] array, int esquerda, int meio, int direita) {
        // Tamanho dos sub-arrays
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        // Arrays temporários
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copia os dados para os arrays temporários
        for (int i = 0; i < n1; i++) {
            L[i] = array[esquerda + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[meio + 1 + j];
        }

        // Indices iniciais dos sub-arrays
        int i = 0, j = 0;

        // Índice inicial do array mesclado
        int k = esquerda;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes de L[], se houver algum
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copia os elementos restantes de R[], se houver algum
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Método para imprimir o array
    public  void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("posição[%d] : %d \n",i,array[i]);
        }
        System.out.println();
    }

    //retorno da string manual;; classe compoem(composicao) em merge;
    public String manualMerge(){
        return manual.merge;
    }


}
