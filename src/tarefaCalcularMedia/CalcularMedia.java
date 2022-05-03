package tarefaCalcularMedia;

/**
 * 
 * @author manoel.carvalho
 *
 */

public class CalcularMedia {

	public static void main(String[] args) {
		 notaAnual();
		
		
		
	}
	
	private static void notaAnual() {
		
		double pt = 7.5;
		double st = 6;
		double tt = 8.6;
		double qt = 2;
		
		double totalNotas = pt + st + tt + qt;
		
		if(totalNotas >= 28) {
			System.out.println("A nota final foi: " + totalNotas + " " + "aprovado");
		}else if(totalNotas >= 20 && totalNotas <28) {
			System.out.println("A nota final foi: " + totalNotas + " " + "recuperação");
		}else {
			System.out.println("A nota final foi: " + totalNotas + " " + "reprovado");
		}
		
		
	}
	


}
