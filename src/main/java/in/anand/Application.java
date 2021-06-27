package in.anand;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.anand.Repository.OrderRepo;
import in.anand.entity.OrderEntity;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		 OrderRepo orderRepo = context.getBean(OrderRepo.class);
			/*
			 * List findAll = orderRepo.findAll(Sort.by("orderName").descending());
			 * findAll.forEach(orders->{ System.out.println(orders); });
			 */
		
		 int pageSize=2;
		 int pageNo=0;
		 
		 PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
		 Page<OrderEntity> page = orderRepo.findAll(pageRequest);	
		 List<OrderEntity> content = page.getContent();
		 content.forEach(orders->{
			 System.out.println(orders);
		 });
		context.close();
	}

}
