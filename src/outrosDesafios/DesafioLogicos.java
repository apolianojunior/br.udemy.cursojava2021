package outrosDesafios;

public class DesafioLogicos {

	public static void main(String[] args) {

		// trabalho na terça
		// trabalho na quinta

		// se os dois forem V -> TV 50 polegadas + sorvete
		// se somente 1 for V -> TV 32 polegadas + sorvete
		// se os dois forem F -> Ficar em casa, sem sorvete, mais saudavel

		boolean trabalho1 = false;
		boolean trabalho2 = true;

		if (trabalho1 && trabalho2) {
			System.out.println("A família comprou a TV 50\"e tomou sorvete");
		} else if (trabalho1 || trabalho2) {
			System.out.println("A família comprou a TV 32\"e tomou sorvete");
		} else if (!trabalho1 && !trabalho2) {
			System.out.println("A família ficou em casa");
		}
	}
}
