package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Hello world!");
		// StandardCalculator calc = new StandardCalculator();

		// calc.add(Double.MAX_VALUE, 1.0);

		// calc.printResult();
		// ScientificCalculator calc = new ScientificCalculator();

		// calc.add(Double.MAX_VALUE, 1.0);

		// calc.printResult();

		LogicCalculator calc = new LogicCalculator();
		calc.OR(8,6);
		calc.printResult();
	}

}
