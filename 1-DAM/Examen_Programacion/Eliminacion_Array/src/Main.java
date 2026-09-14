//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    int[] numeros = {10, 20, 30, 40, 50};
    int[] numerosEliminar = new int[numeros.length - 1];
    Scanner scanner = new Scanner(System.in);
    int numeroEliminar = scanner.nextInt();
    int posicionNum = 0;
    boolean existe = true;
    int posicionExiste = 0;
    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] == numeroEliminar) {
            existe = false;
            posicionNum = i;
        }
    }
    if (!existe) {
        for (int i = 0; i < posicionNum; i++) {
            numerosEliminar[i] = numeros[i];
        }
        for (int i = posicionNum + 1; i < numerosEliminar.length; i++) {
            numerosEliminar[i - 1] = numeros[i];
        }
        for (int i = 0; i < numerosEliminar.length; i++) {
            System.out.print(numerosEliminar[i] + " ");
        }
    }
}
