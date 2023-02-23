

//Faça um programa para o cálculo de uma folha de pagamento,
//
//Sabendo que os descontos são do Imposto de Renda e do INNS (10%), que depende do salário bruto (conforme tabela abaixo) e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
//
//O Salário Líquido corresponde ao Salário Bruto menos os descontos.
//
//O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

package Fgts;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public enum FgtsPlano {
    ;

    public static double calcularINSS(final double salarioBruto) {
        return salarioBruto * 0.1;
    }

    public static double calcularFGTS(final double salarioBruto) {
        return salarioBruto * 0.08;
    }

    public static double calcularPlanoSaude() {
        return 100.0;
    }

    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("Digite o valor do salário bruto: ");
        final double salarioBruto = input.nextDouble();
        final double inss = FgtsPlano.calcularINSS(salarioBruto);
        final double fgts = FgtsPlano.calcularFGTS(salarioBruto);
        final double planoSaude = FgtsPlano.calcularPlanoSaude();
        final double salarioComDescontos = salarioBruto - inss - fgts - planoSaude;

        System.out.println("Descontos:");
        System.out.printf("- INSS: R$%.2f\n", inss);
        System.out.printf("- FGTS: R$%.2f\n", fgts);
        System.out.printf("- Plano de Saúde: R$%.2f\n", planoSaude);
        System.out.printf("Salário líquido: R$%.2f", salarioComDescontos);

    }

}
