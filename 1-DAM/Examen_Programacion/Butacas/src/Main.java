//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        SalaTeatro salaTeatro = new SalaTeatro(3, 3);
        salaTeatro.buscarAsientosLibres(3);
        salaTeatro.buscarAsientosLibres(2);
        salaTeatro.buscarAsientosLibres(1);
        salaTeatro.buscarAsientosLibres(44);
        salaTeatro.buscarAsientosLibres(3);
        salaTeatro.buscarAsientosLibres(3);
        salaTeatro.mostrarMatriz();

    }
}
