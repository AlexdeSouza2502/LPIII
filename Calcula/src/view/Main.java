package view;

import model.*;

public class Main {

	public static void main(String[] args) {
		Tax strategy = new IPI();
		
		FinalPrice fp = new FinalPrice();
		fp.setStrategy(strategy);
		
		double finalPrice = fp.calculateFinalPrice(100000, 0.1);
		
		System.out.printf("Preço final com IPI: %.2f\n", finalPrice);
		
		strategy = new ISS(ISSAliquot.MACHADO);
		
		fp.setStrategy(strategy);
		finalPrice = fp.calculateFinalPrice(1000, 0.3);
		
		System.out.printf("Preço final do serviço com ISS: %.2f", finalPrice);

	}

}
