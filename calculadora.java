import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do seu investimento");
        var investimento = scanner.nextFloat();
        scanner.close();
        var visualizacaoOriginal = investimento*30;
        System.out.println("A sua visualização do anúncio original é: " + visualizacaoOriginal + " pessoas");
        var visualizacaoClickTotal = visualizacaoOriginal * 12 / 100;
        System.out.println("O número de pessoas que clicaram no anúncio foi de: " + visualizacaoClickTotal);
        var compartilhamentoNasRedes = visualizacaoClickTotal * 15 / 100;
        System.out.println("O número de compartilhamento nas redes foi de :" + compartilhamentoNasRedes);
        var visualizacaoCompartilhamento = compartilhamentoNasRedes * 40;
        System.out.println("Devido aos compartilhamentos , o número de pessoas que visualizaram foi de : "
                + visualizacaoCompartilhamento + " pessoas");
       // var numeroDeCompartilhamento = 4 * 40;
        //System.out.println("Número de compartilhamento foi de: " + numeroDeCompartilhamento);
        var resultado = visualizacaoOriginal + visualizacaoClickTotal + compartilhamentoNasRedes
                + visualizacaoCompartilhamento;
        System.out.println(
                "O número total de visualizações originais mais compartilhamentos foi de: " + resultado + " pessoas");

    }
}