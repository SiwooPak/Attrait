package www.model.cart;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CartService implements ICartService {

	@Autowired
	private ICartDAO cartDAO;
	
	@Override
	public List<CartDTO> list(Map map) throws Exception {
		return cartDAO.list(map);
	}

	@Override
	public boolean create(CartDTO dto) throws Exception {
		return cartDAO.create(dto);
	}
	
	@Override
	public void delete(List<Integer> cartno) throws Exception {
		for(int no : cartno) {
			cartDAO.delete(no);
		}
	}

}
