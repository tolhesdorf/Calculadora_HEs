package calculadorahes.projeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String Nome = input.nextLine();

        System.out.println("Digite sua idade: ");
        String Idade = input.nextLine();

        System.out.println("Digite seu salário: ");
        Double Salário = input.nextDouble();

        System.out.println("Digite suas horas mensais trabalhadas: ");
        Double HorasMensais = input.nextDouble();

        System.out.println("Digite sua quantidade de HEs 50%: ");
        Double HorasExtras50 = input.nextDouble();

        System.out.println("Digite sua quantidade de HEs 100%: ");
        Double HorasExtras100 = input.nextDouble();

        Double HE50 = ((Salário / HorasMensais) + (Salário / HorasMensais) * 50 / 100) * HorasExtras50;
        Double HE100 = ((Salário / HorasMensais) + (Salário / HorasMensais) * 100 / 100) * HorasExtras100;

        System.out.println("Nome: " + Nome + "\nIdade: " + Idade + "\nSalário: " + Salário +
                           "\nHoras Extras 50%: " + HE50 + "\nHoras Extras 100%: " + HE100);
    }
}
