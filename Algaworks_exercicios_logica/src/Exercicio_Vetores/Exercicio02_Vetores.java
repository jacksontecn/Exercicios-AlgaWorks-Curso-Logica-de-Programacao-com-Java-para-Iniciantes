package Exercicio_Vetores;

public class Exercicio02_Vetores {
    public static void main(String[] args) {
        Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
        Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
        Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
        Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

        Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
        Integer semana = 0;
        Double resultado = 0.0;
        Double somarSemana = 0.0;

        for (int i = 0; i < mes.length; i++){

            for (int y = 0; y < mes[i].length; y++){
                somarSemana += mes[i][y];
            }
            if (resultado < somarSemana){
                resultado = somarSemana;
                semana = i + 1;
                somarSemana = 0.0;
            }else {
                somarSemana = 0.0;
            }

        }

        switch (semana){
            case 1:
                System.out.println("A primeira semana teve o maior faturamento do mês com o valor de R$: " + resultado);
                break;
            case 2:
                System.out.println("A segunda semana teve o maior faturamento do mês com o valor de R$: " + resultado);
                break;
            case 3:
                System.out.println("A terceira semana teve o maior faturamento do mês com o valor de R$: " + resultado);
                break;
            case 4:
                System.out.println("A quarta semana teve o maior faturamento do mês com o valor de R$: " + resultado);
                break;
            default:
                System.err.println("Nenhuma semana se destacou no faturamento semanal.");
                System.exit(0);

        }

    }
}
