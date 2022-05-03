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
		
		double pb = 7.5;
		double sb = 7;
		double tb = 8.6;
		double qb = 8;
		
		double totalNotas = pb + sb + tb + qb;
	
		double mediaFinal = totalNotas / 4;
	
		
		if(mediaFinal >= 7) {
			System.out.printf("Aprovado, nota média final foi =  %.2f %n " , mediaFinal);
		}else if(mediaFinal >= 5 && mediaFinal <7) {
			System.out.printf("Em recuperação, nota média final foi = %.2f %n " , mediaFinal);
		}else {
			System.out.printf("Reprovado, A nota média final foi = %.2f %n " , mediaFinal);
		}
		
	}
	


}
