package www.model.memo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import www.utility.attrait.DBClose;
import www.utility.attrait.DBOpen;


public class MemoTest {

	public static void main(String[] args) throws Exception {
		Resource rs = new ClassPathResource("META-INF/attrait.xml"); // 寃쎈줈李얠쓬
		BeanFactory factory  = new XmlBeanFactory(rs); // 媛앹껜�뱾�쓣 �깮�꽦�븿
		MemoDAO dao = (MemoDAO)factory.getBean("mdao");
		
		read(dao);

		
	}

	
	private static void read(MemoDAO dao) {
		MemoDTO dto=dao.read(1);
		p(dto);
		
	}
	
	private static void p(MemoDTO dto) {
		p("踰덊샇: "+dto.getMemono());
		p("�젣紐�: "+dto.getTitle());
		p("�궡�슜: "+dto.getContent());
		p("議고쉶�닔: "+dto.getViewcnt());
		p("�벑濡앸궇吏�: "+dto.getWdate());
		p("grpno: "+dto.getGrpno());
		p("indent: "+dto.getIndent());
		p("ansnum: "+dto.getAnsnum());
		
	}

	private static void p(String string) {
		System.out.println(string);
		
	}
}
