import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("insira um numero:");
        int numero = sc.nextInt();

        String arquivoTabuada = "tabuada_" + numero + ".txt";

        try {
            FileWriter escritor = new FileWriter(arquivoTabuada);

            for (int i = 1; i <= 10; i++) {
                escritor.write(numero + " x " + i + " = " + (numero * i) + "\n");
            }
            escritor.close();
            System.out.println("o arquivo " + arquivoTabuada + " foi criado com sucesso!");

        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}

