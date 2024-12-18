package team.tjusw.elmboot.po;

import java.util.List;

public class Orders {
	private Integer orderId;
	private String userId;
	private Integer businessId;
	private String orderDate;
	private Double orderTotal;
	private Integer daId; 
	private Integer orderState; 

	private Business business;

	private List<OrderDetail> orderDetails;

	public Integer getOrderId() {
		return orderId;
	}

	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public Integer getDaId() {
		return daId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getBusinessId() {
		return businessId;
	}

	public Integer getOrderState() {
		return orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	public void setDaId(Integer daId) {
		this.daId = daId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
}
