package Pacote;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		List<Pessoa> p = new ArrayList<Pessoa>();
		
		Estudante e = new Estudante("Gabriel", "09/08/1998", 6977458, "Análise de Desenvolvimento de Sistemas");
		Professor pr = new Professor("Lucas","05/06/1997", 15789463, "Progrmação");
		
		p.add(e);
		p.add(pr);
		
		for(Pessoa ps : p) {
			System.out.println(ps.toString() );
		}
	}
}
