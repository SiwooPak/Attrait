package www.model.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
	@Autowired
	ICartDAO cartDAO;

	@Scheduled(cron = "* * 0/1 * * *")
	public void delete() {
		try {
			boolean flag = cartDAO.delete();
			if(flag) System.out.println("1�ð��� ���� ��ٱ��� ������ �����Ǿ����ϴ�.");	
			else System.out.println("������ ��ٱ��� ������ �����ϴ�.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
