package in.anand.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order1")
public class OrderEntity {
	
	@Id
	@Column(name="order_id")
	private int orderId;
	@Column(name="order_name")
	private String orderName;
	@Column(name="order_cost")
	private Double OrderCost;
	@Override
	public String toString() {
		return "OrderEntity [orderId=" + orderId + ", orderName=" + orderName + ", OrderCost=" + OrderCost + "]";
	}
	
	
	
	

}
