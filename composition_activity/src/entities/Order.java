package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private Client client;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	List<OrderItem> itens = new ArrayList<>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status) {
		super();
		this.moment = moment;
		this.status = status;
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItens() {
		return itens;
	}

	public void addItem(OrderItem item) {
		itens.add(item);
	}
	
	public void removeItem(OrderItem item) {
		itens.remove(item);
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public Double totalValue() {
		Double sum = 0.0;
		for (OrderItem orderItem : itens) {
			sum += orderItem.subTotal();
		}
		return sum;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Client: " + client.getName() + "(" + sdf2.format(client.getBirthDate()) + ")" + " - " + client.getEmail() + "\n");
		sb.append("Order itens: \n");
		for (OrderItem orderItem : itens) {
			sb.append(orderItem.getProduct().getName() 
			+ ", $" + orderItem.getProduct().getPrice() 
			+ " Quantity: " 
			+ orderItem.getQuantity() 
			+ ", Subtotal: " + orderItem.subTotal() + "\n");
		}
		sb.append("Total price: " + totalValue());
		return sb.toString();
	}
	
}