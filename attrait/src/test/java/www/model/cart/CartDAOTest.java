package www.model.cart;

import java.util.*;
import org.junit.*;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import junit.framework.Assert;

public class CartDAOTest {
	/*
	  @Autowired
	private static BeanFactory beans;
	
	@Autowired 
	private static ICartDAO cartdao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Resource resource = new ClassPathResource("/META-INF/attrait.xml");
		beans = new XmlBeanFactory(resource);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
			cartdao = (CartDAO)beans.getBean("cartdao"); 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test @Ignore
	public void insertCartTest() {
		System.out.println("cart insert test~");
		CartDTO cartDTO = new CartDTO();
		cartDTO.setU_id("user1");
		cartDTO.setPcode("AAA001");
		cartDTO.setColor("pink");
		cartDTO.setPsize(90);
		cartDTO.setPname("Ã»ÀÚÄÏ");
		cartDTO.setPrice(50000);
		cartDTO.setQuantity(2);
		cartDTO.setTotal(100000);
		cartDTO.setFname("aaa.jpg");
		Assert.assertTrue(cartdao.create(cartDTO));
	}
	
	@Test @Ignore
	public void cart_listTest() {
		System.out.println("cart list test~");
		Map map = new HashMap();
		String u_id = "user1";
		map.put("u_id", u_id);
		List<CartDTO> list = cartdao.list(map);
		Assert.assertEquals(list.size(), 9);
	}
	
	@Test @Ignore
	public void cart_updateTest(){
		System.out.println("cart update test~");
		Map map = new HashMap();
		map.put("quantity", 3);
		map.put("psize", 100);
		map.put("color", "yellow");
		map.put("cartno", 1);
		Assert.assertTrue(cartdao.update(map));
	}
	
	@Test @Ignore
	public void cart_productDelete(){
		System.out.println("cart product delete test~");
		Map map = new HashMap();
		map.put("cartno", 2);
		map.put("pcode", "AAA001");
		Assert.assertTrue(cartdao.delete(map));
	}
	
	@Test 
	public void cart_Delete() throws Exception{
		System.out.println("cart delete test~");
		Assert.assertTrue(cartdao.delete());
	}
	*/
}
