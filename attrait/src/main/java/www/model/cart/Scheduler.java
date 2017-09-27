package www.model.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
	@Autowired
	CartDAO cartDAO;

	@Scheduled(cron = "* * 0/1 * * *")
	public void delete() {
		try {
			boolean flag = cartDAO.delete();
			if(flag) System.out.println("1시간이 지나 장바구니 내용이 삭제되었습니다.");	
			else System.out.println("삭제할 장바구니 내용이 없습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
