package in.anand.Repository;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;

import in.anand.entity.OrderEntity;

public interface OrderRepo extends JpaRepository<OrderEntity,Serializable> {
	
	

}
