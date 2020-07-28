package com.rumos.bank.administration.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class DebitCard extends Card implements Serializable {

	private static final long serialVersionUID = -5196255457840326045L;
	
//	private int id_debitCard;
//	private Account account;
//	private Client titular;
//	private LocalDate creation;
//	private LocalDate expire;
	private final String  type = "D";
	// valor j� levantado hoje (dia)
	// atribui�ao de pin e altera�ao
	//private Integer pin;
	
	
	
	
	public DebitCard(Account account, Client titular) {
		super(account, titular);
	}
		
	public DebitCard(int idCard, Account account, Client titular, LocalDate creation, LocalDate expire) {
		super(account, titular);
		this.idCard = idCard;
		this.account = account;
		this.titular = titular;
		this.creation = creation;
		this.expire = expire;
	}

	@Override
	public String toString() {
		return "DebitCard  Id: " + idCard 
				+ "    Account Id: " + account.getId_account()
				+ "    Made: " + getFormattedCreation()
				+ "  Expire: " + getFormattedExpire()
				+ "    Owner Id: " + titular.getId_client()
				+ "  "+ titular.getName();
	}
		
	//--------------------------------------------------------
	
//	public int getId_debitCard() { return idCard; }
//
//	public Account getAccount() { return account; }
//		
//	public Client getTitular() { return titular; }
//	
//	public LocalDate getCreation() { return creation; }
//	
//	public String getFormattedCreation() {
//		return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(creation);
//	}
//	
//	public void setCreation(LocalDate creation) { this.creation = creation;	}
//
//	public LocalDate getExpire() { return expire; }
//	
//	public String getFormattedExpire() {
//		return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(expire);
//	}
//
//	public void setExpire(LocalDate expire) { this.expire = expire;	}
	
	public String getType() { return type; }

	@Override
	public int hashCode() {
		return Objects.hash(idCard);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) { return true;	}
		if (obj == null) { return false; }
		if (getClass() != obj.getClass()) {	return false; }
		DebitCard other = (DebitCard) obj;
		return idCard == other.idCard;
	}
}

