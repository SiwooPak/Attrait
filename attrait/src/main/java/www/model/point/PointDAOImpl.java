package www.model.point;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import www.model.common.IDAO;

@Repository
public class PointDAOImpl implements IDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void setMybatis(SqlSessionTemplate mybatis) {
		this.mybatis = mybatis;
	}
	
	@Override
	public List<?> list(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object read(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(int no) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int no) {
		// TODO Auto-generated method stub
		return false;
	}

}
