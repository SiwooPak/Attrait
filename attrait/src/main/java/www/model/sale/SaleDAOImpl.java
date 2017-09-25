package www.model.sale;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import www.model.common.IDAO;

@Repository
public class SaleDAOImpl implements SaleDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void setMybatis(SqlSessionTemplate mybatis) {
		this.mybatis = mybatis;
	}

	/* (non-Javadoc)
	 * @see www.model.sale.SaleDAO#list(java.util.Map)
	 */
	@Override
	public List<SaleDTO> list(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see www.model.sale.SaleDAO#read(int)
	 */
	@Override
	public SaleDTO read(int ssno) {
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
