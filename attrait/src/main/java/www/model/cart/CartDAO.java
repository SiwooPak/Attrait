package www.model.cart;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAO implements ICartDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void setMybatis(SqlSessionTemplate mybatis) {
		this.mybatis = mybatis;
	}

	@Override
	public List list(Map map) throws Exception {
		return mybatis.selectList("cart.list", map);
	}

	@Override
	public boolean create(Object dto) throws Exception {
		return mybatis.insert("cart.create", dto)>0;
	}
	
	@Override
	public boolean update(Object dto) throws Exception {
		return mybatis.insert("cart.update", dto)>0;
	}

	@Override
	public boolean delete(Object pk) throws Exception {
		return mybatis.delete("cart.deleteProduct", pk)>0;
	}

	@Override
	public boolean delete() throws Exception {
		return mybatis.delete("cart.deleteCart")>0;
	}

	@Override
	public int total(Map map) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Object read(Object pk) throws Exception {
		return null;
	}
		
}
