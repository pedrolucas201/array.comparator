import javax.swing.*;
import java.util.Arrays;

public class ArraysComparator1 {

    public static void main(String[] args) {
        int[] vet1;
        vet1 = new int[6];
        int[] vet2;
        vet2 = new int[6];
        int i;

        for (i = 0; i < 1; i++){
            String s_vet = JOptionPane.showInputDialog(null, "Digite 5 números: ");
            vet1[5] = Integer.parseInt(s_vet);
        }

        for (i = 0; i < 1; i++){
            String s_vet2 = JOptionPane.showInputDialog(null, "Digite 5 números novamente: ");
            vet2[5] = Integer.parseInt(s_vet2);
        }

        if (Arrays.equals(vet1, vet2)){
            JOptionPane.showMessageDialog(null,"As duas listas são iguais.");
        }

    }

}