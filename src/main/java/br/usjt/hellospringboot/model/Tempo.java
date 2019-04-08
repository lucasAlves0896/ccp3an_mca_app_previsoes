/*Nome do dia na semana, temperatura
mínima, temperatura máxima, humidade relativa do ar e um campo textual para uma
descrição sucinta.*/

package br.usjt.hellospringboot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Tempo implements Serializable{
	private static final long serialVersionUID = 1L;	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String diasemana;
	private String descricao;
	private Double tempmini;
	private Double tempmaxi;
	private Double humidade;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDiasemana() {
		return diasemana;
	}


	public void setDiasemana(String diasemana) {
		this.diasemana = diasemana;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Double getTempmini() {
		return tempmini;
	}


	public void setTempmini(Double tempmini) {
		this.tempmini = tempmini;
	}


	public Double getTempmaxi() {
		return tempmaxi;
	}


	public void setTempmaxi(Double tempmaxi) {
		this.tempmaxi = tempmaxi;
	}


	public Double getHumidade() {
		return humidade;
	}


	public void setHumidade(Double humidade) {
		this.humidade = humidade;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	//getters/setters
	
	
}
