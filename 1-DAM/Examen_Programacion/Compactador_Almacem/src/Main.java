public void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int array[] = {10, 20, 30, 40, 50};
    int arrayGrande[] = new int[array.length + 1];
    int numeroInsertar = scanner.nextInt();
    int pos = 0;
    for (int i = 0; i < array.length; i++) {
        if (numeroInsertar > array[i]) {
            pos++;
        }
    }
    for (int i = 0; i < pos; i++) {
        arrayGrande[i] = array[i];
    }
    arrayGrande[pos] = numeroInsertar;
    for (int i = pos; i < array.length; i++) {
        arrayGrande[i + 1] = array[i];
    }
    for (int i = 0; i < arrayGrande.length; i++) {
        System.out.print(arrayGrande[i] + " ");
    }

}