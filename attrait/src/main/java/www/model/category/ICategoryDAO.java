package www.model.category;

import java.util.List;
import java.util.Map;

import www.DAOInter;

public interface ICategoryDAO extends DAOInter {
	boolean create_sub(CategoryDTO dto) throws Exception;
	List<CategoryDTO> list_main() throws Exception;
	List<CategoryDTO> list_sub(String parent_id) throws Exception;
	void update_sort_up(int sort_no) throws Exception;
	void update_sort_down(Map map) throws Exception;
	int delete_sub(String parent_id) throws Exception;
}
