package www.model.category;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDAO implements ICategoryDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void setMybatis(SqlSessionTemplate mybatis)	{
		this.mybatis = mybatis;
	}

	@Override
	public List list(Map map) throws Exception {  //paging 처리 안함
		return mybatis.selectList("category.list_admin");
	}

	@Override
	public List<CategoryDTO> list_main() throws Exception {
		return mybatis.selectList("category.list_main");
	}

	@Override
	public List<CategoryDTO> list_sub(String c_code) throws Exception {
		return mybatis.selectList("category.list_sub");
	}

	@Override
	public Object read(Object pk) throws Exception {
		return mybatis.selectOne("category.read", pk);
	}

	@Override
	public boolean create(Object dto) throws Exception {
		return mybatis.insert("category.create", dto)>0;
	}

	@Override
	public boolean update(Object dto) throws Exception {
		return mybatis.update("category.update", dto)>0;
	}

	@Override
	public boolean delete(Object pk) throws Exception {
		return mybatis.delete("category.delete", pk)>0;
	}

	@Override
	public int delete_sub(String parent_id) throws Exception {
		return mybatis.delete("category.delete", parent_id);
	}

	@Override
	public void update_sort_down(Map map) throws Exception {
		mybatis.update("category.update_sort_down", map);
	}


	@Override
	public boolean create_sub(CategoryDTO dto) throws Exception {
		return mybatis.insert("category.create_sub", dto)>0;
	}

	@Override
	public void update_sort_up(int sort_no) throws Exception {
		mybatis.update("category.update_sort_up", sort_no);
	}
	
//	구현x
	@Override
	public int total(Map map) throws Exception {
		return 0;
	}


}
