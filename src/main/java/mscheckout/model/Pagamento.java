package mscheckout.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pagamento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPagamento;
	private String desconto;
	private String tipo;
	private String status;
	public Long getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(Long idPagamento) {
		this.idPagamento = idPagamento;
	}
	public String getDesconto() {
		return desconto;
	}
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
