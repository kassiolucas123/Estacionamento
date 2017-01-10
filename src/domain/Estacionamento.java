package domain;

import javax.swing.JOptionPane;

public class Estacionamento {
	private static Estacionamento instance;
	private Veiculo[] estacionamento;
	private String nome;
	public String listarArmazenavel = " ";

	public static Estacionamento getInstance() {
		if (Estacionamento.instance == null) {
			Estacionamento.instance = new Estacionamento();
		}
		return instance;
	}

	private Estacionamento() {
		this.nome = "Estacionamento 666";
		this.estacionamento = new Veiculo[10];
	}

	public void adicionaVeiculo(Veiculo veiculo) {
		for (int i = 0; i < estacionamento.length; i++) {
			if (estacionamento[i] == null) {
				estacionamento[i] = veiculo;
				break;
			}
		}
	}

	private boolean consultarVeiculo(String placa) {
		for (int i = 0; i < estacionamento.length; i++) {
			if (estacionamento[i].getPlaca().equals(placa)) {
				return true;
			}
		}
		return false;
	}

	public String listarEstacionamento() {
		for (int i = 0; i < estacionamento.length; i++) {
			if (estacionamento[i] != null) {
				listarArmazenavel += "Modelo: " + estacionamento[i].getModelo() + " Placa: "
						+ estacionamento[i].getPlaca();
			} else {
				continue;
			}
		}
		return listarArmazenavel;
	}

	public void removerEstacionamento(int vaga) {
		for (int i = 0; i < estacionamento.length; i++) {
			if (i == vaga && estacionamento[i] != null) {
				estacionamento[i] = null;
			}
		}
	}

}
