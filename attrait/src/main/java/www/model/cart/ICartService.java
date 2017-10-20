package www.model.cart;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

public interface ICartService {
	List<CartDTO> list(Map map) throws Exception;

	boolean create(CartDTO dto) throws Exception;

	void delete(List<Integer> cartno) throws Exception;
}
