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
		Resource rs = new ClassPathResource("META-INF/attrait.xml"); // 경로찾음
		BeanFactory factory  = new XmlBeanFactory(rs); // 객체들을 생성함
		MemoDAOImpl dao = (MemoDAOImpl)factory.getBean("mdao");
		
		read(dao);

		
	}

	
	private static void read(MemoDAOImpl dao) {
		MemoDTO dto=dao.read(1);
		p(dto);
		
	}
	
	private static void p(MemoDTO dto) {
		p("번호: "+dto.getMemono());
		p("제목: "+dto.getTitle());
		p("내용: "+dto.getContent());
		p("조회수: "+dto.getViewcnt());
		p("등록날짜: "+dto.getWdate());
		p("grpno: "+dto.getGrpno());
		p("indent: "+dto.getIndent());
		p("ansnum: "+dto.getAnsnum());
		
	}

	private static void p(String string) {
		System.out.println(string);
		
	}
}
