package pacote_principal;

public class ClasseCarro {
	private String empresa;
	private String modelo;
	private String placa;
	private String cor;
	private int anoFabricaçao;
	String TipoTurbo;

	public String getTipoTurbo() {
		return TipoTurbo;
	}

	public void setTipoTurbo(String tipoTurbo) {
		TipoTurbo = tipoTurbo;
	}
		
	
	public void verificarIPVA() {
		if (this.getAnoFabricaçao() < 2007) {
			System.out.println("Seu carro tem mais de 15 anos, nao e necessario pagar IPVA");}
		}
	
	ClasseCarro troca(ClasseCarro carro1, ClasseCarro carro2) {
		carro2.setEmpresa(carro1.getEmpresa());
		carro2.setModelo(carro1.getModelo());
		carro2.setPlaca(carro1.getEmpresa());
		return carro2;
	
	}
	
	public String getEmpresa() {
		return empresa;
	}
	public String getModelo() {
		return modelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	public String getCor() {
		return cor;
	}
	public int getAnoFabricaçao() {
		return anoFabricaçao;
	}
	
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setAnoFabricaçao(int anoFabricaçao) {
		this.anoFabricaçao = anoFabricaçao;
	}
}
