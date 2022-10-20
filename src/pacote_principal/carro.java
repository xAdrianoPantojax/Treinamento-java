package pacote_principal;

import java.util.ArrayList;
import java.util.Collection;

public class carro {
	public static void main(String[] args) {
	ClasseCarro carro1 = new ClasseCarro();
	ClasseCarro carro2 = new ClasseCarro();
	
	carro1.setEmpresa("Mitsubichi");
	carro1.setModelo("Eclipse");
	carro1.setPlaca("XYZ-3124");
	carro1.setCor("Roxo");
	carro1.setAnoFabricaçao(2006);
	
	carro2.setEmpresa("Fiat");
	carro2.setModelo("Uno");
	carro2.setPlaca("XWY-5121");
	carro2.setCor("Azul");
	carro2.setAnoFabricaçao(2014);
	
	CarroEsportivo CarroEsp1 = new CarroEsportivo();
	CarroEsportivo CarroEsp2 = new CarroEsportivo();
	
	CarroEsp1.setEmpresa("Ferrari");
	CarroEsp1.setModelo("Roma");
	CarroEsp1.setPlaca("XDC-1928");
	CarroEsp1.setCor("Dourado");
	CarroEsp1.setAnoFabricaçao(2012);
	CarroEsp1.setTipoTurbo("V8");
	
	CarroEsp2.setEmpresa("BMW");
	CarroEsp2.setModelo("x5");
	CarroEsp2.setPlaca("JBM-3094");
	CarroEsp2.setCor("Azul");;
	CarroEsp2.setAnoFabricaçao(2013);
	CarroEsp2.setTipoTurbo("V8");
	
	
	ArrayList<ClasseCarro> ListaCarros = new ArrayList<ClasseCarro>();
	
	ListaCarros.add(carro1);
	ListaCarros.add(carro2);
	ListaCarros.add(CarroEsp1);
	ListaCarros.add(CarroEsp2);
	
	
	
	for( int i = 0 ; i < ListaCarros.size() ;i++) {
		ClasseCarro ref = (ClasseCarro) ListaCarros.get(i);
		System.out.println("Empresa: " + ref.getEmpresa());
		System.out.println("Modelo: " + ref.getModelo());
		System.out.println("Placa: " + ref.getPlaca());
		System.out.println("Cor: " + ref.getCor());
		System.out.println("Ano de Fabricacao: " + ref.getAnoFabricaçao());
		if(ref.getTipoTurbo() == null) {
		
		} else {
			System.out.println("Tipo de Turbo: " + ref.TipoTurbo);
		}
		System.out.println("-------------------");
	}
	
	
	
	
	
	
	}

	
	}

