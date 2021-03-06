/**
 * 
 */
package br.com.nutriCenter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * @author José Caio
 *
 */
@Entity
@Table(name = "avalicao_antropometrica")
public class AvaliacaoAntropometrica extends AvaliacaoNutricional {


	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "Informe a altura")
	@Column(nullable = false)
	private float altura;

	@Max(value = 600, message = "O valor maximo permitido é 600")
	@NotNull(message = "Informe a peso")
	@Column(nullable = false)
	private float peso;
	@Column(name = "paciente_disponivel", nullable = false)
	private boolean isDisponivel;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(name = "braco_direito_relaxado", nullable = false)
	private float bracoDireitoRelaxado;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(name = "braco_esquerdo_relaxado", nullable = false)
	private float bracoEsquerdoRelaxado;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(name = "braco_direito_contraido", nullable = false)
	private float bracoDireitoContraido;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(name = "braco_esquerdo_contraido", nullable = false)
	private float bracoEsquerdoContraido;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(name = "antebraco_direito", nullable = false)
	private float antebracoDireito;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(name = "antebracoEsquerdo", nullable = false)
	private float antebracoEsquerdo;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(name = "punho_direito", nullable = false)
	private float punhoDireito;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(name = "punho_esquerdo", nullable = false)
	private float punhoEsquerdo;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(nullable = false)
	private float pescoco;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(nullable = false)
	private float ombro;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(nullable = false)
	private float peitoral;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(nullable = false)
	private float cintura;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(nullable = false)
	private float abdomen;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(nullable = false)
	private float quadril;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(name = "panturrilha_direita", nullable = false)
	private float panturrilhaDireita;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(name = "panturrilha_esquerda", nullable = false)
	private float panturrilhaEsquerda;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(name = "coxa_direita", nullable = false)
	private float coxaDireita;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(name = "coxa_esquerda", nullable = false)
	private float coxaEsquerda;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(name = "coxa_proximal_direita", nullable = false)
	private float coxaProximalDireita;

	@Max(value = 3, message = "O valor maximo permitido é 3")
	@NotNull(message = "O campo deve ser preenchido")
	@Column(name = "coxa_proximal_esquerda", nullable = false)
	private float coxaProximalEsquerda;


	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isDisponivel() {
		return isDisponivel;
	}

	public void setDisponivel(boolean disponivel) {
		isDisponivel = disponivel;
	}

	public float getBracoDireitoRelaxado() {
		return bracoDireitoRelaxado;
	}

	public void setBracoDireitoRelaxado(float bracoDireitoRelaxado) {
		this.bracoDireitoRelaxado = bracoDireitoRelaxado;
	}

	public float getBracoEsquerdoRelaxado() {
		return bracoEsquerdoRelaxado;
	}

	public void setBracoEsquerdoRelaxado(float bracoEsquerdoRelaxado) {
		this.bracoEsquerdoRelaxado = bracoEsquerdoRelaxado;
	}

	public float getBracoDireitoContraido() {
		return bracoDireitoContraido;
	}

	public void setBracoDireitoContraido(float bracoDireitoContraido) {
		this.bracoDireitoContraido = bracoDireitoContraido;
	}

	public float getBracoEsquerdoContraido() {
		return bracoEsquerdoContraido;
	}

	public void setBracoEsquerdoContraido(float bracoEsquerdoContraido) {
		this.bracoEsquerdoContraido = bracoEsquerdoContraido;
	}

	public float getAntebracoDireito() {
		return antebracoDireito;
	}

	public void setAntebracoDireito(float antebracoDireito) {
		this.antebracoDireito = antebracoDireito;
	}

	public float getAntebracoEsquerdo() {
		return antebracoEsquerdo;
	}

	public void setAntebracoEsquerdo(float antebracoEsquerdo) {
		this.antebracoEsquerdo = antebracoEsquerdo;
	}

	public float getPunhoDireito() {
		return punhoDireito;
	}

	public void setPunhoDireito(float punhoDireito) {
		this.punhoDireito = punhoDireito;
	}

	public float getPunhoEsquerdo() {
		return punhoEsquerdo;
	}

	public void setPunhoEsquerdo(float punhoEsquerdo) {
		this.punhoEsquerdo = punhoEsquerdo;
	}

	public float getPescoco() {
		return pescoco;
	}

	public void setPescoco(float pescoco) {
		this.pescoco = pescoco;
	}

	public float getOmbro() {
		return ombro;
	}

	public void setOmbro(float ombro) {
		this.ombro = ombro;
	}

	public float getPeitoral() {
		return peitoral;
	}

	public void setPeitoral(float peitoral) {
		this.peitoral = peitoral;
	}

	public float getCintura() {
		return cintura;
	}

	public void setCintura(float cintura) {
		this.cintura = cintura;
	}

	public float getAbdomen() {
		return abdomen;
	}

	public void setAbdomen(float abdomen) {
		this.abdomen = abdomen;
	}

	public float getQuadril() {
		return quadril;
	}

	public void setQuadril(float quadril) {
		this.quadril = quadril;
	}

	public float getPanturrilhaDireita() {
		return panturrilhaDireita;
	}

	public void setPanturrilhaDireita(float panturrilhaDireita) {
		this.panturrilhaDireita = panturrilhaDireita;
	}

	public float getPanturrilhaEsquerda() {
		return panturrilhaEsquerda;
	}

	public void setPanturrilhaEsquerda(float panturrilhaEsquerda) {
		this.panturrilhaEsquerda = panturrilhaEsquerda;
	}

	public float getCoxaDireita() {
		return coxaDireita;
	}

	public void setCoxaDireita(float coxaDireita) {
		this.coxaDireita = coxaDireita;
	}

	public float getCoxaEsquerda() {
		return coxaEsquerda;
	}

	public void setCoxaEsquerda(float coxaEsquerda) {
		this.coxaEsquerda = coxaEsquerda;
	}

	public float getCoxaProximalDireita() {
		return coxaProximalDireita;
	}

	public void setCoxaProximalDireita(float coxaProximalDireita) {
		this.coxaProximalDireita = coxaProximalDireita;
	}

	public float getCoxaProximalEsquerda() {
		return coxaProximalEsquerda;
	}

	public void setCoxaProximalEsquerda(float coxaProximalEsquerda) {
		this.coxaProximalEsquerda = coxaProximalEsquerda;
	}
}
