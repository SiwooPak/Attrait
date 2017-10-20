package www.model.category;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService{
	
	@Autowired
	private ICategoryDAO category_dao;
	
	@Override
	public List<CategoryDTO> list(Map map) throws Exception {
		return category_dao.list(map);
	}
	
	@Override
	public List<CategoryDTO> list_main() throws Exception {
		return category_dao.list_main();
	}

	@Override
	public List<CategoryDTO> list_sub(String parent_id) throws Exception {
		return category_dao.list_sub(parent_id);
	}

	@Override
	public CategoryDTO read(String ccode) throws Exception {
		return (CategoryDTO)category_dao.read(ccode);
	}

	@Override
	public boolean create(CategoryDTO dto) throws Exception {
		return category_dao.create(dto);
	}

	@Override
	public boolean update(CategoryDTO dto) throws Exception {
		return category_dao.update(dto);
	}

	@Override
	public boolean delete(Map map) throws Exception {
		boolean flag=false;
		int cnt = category_dao.delete_sub((String)map.get("ccode"));
		flag = category_dao.delete((String)map.get("ccode"));
		category_dao.update_sort_down(map);
		return flag;
	}
	
	@Override
	public boolean create_sub(CategoryDTO dto) throws Exception {
		boolean flag = category_dao.create_sub(dto);
		category_dao.update_sort_up(dto.getSort_no());
		return flag;
	}

}
