package www.model.category;

import java.util.List;
import java.util.Map;

public interface ICategoryService {
	List<CategoryDTO> list(Map map) throws Exception;  //paging 처리 안함
	CategoryDTO read(String ccode) throws Exception;
	boolean create(CategoryDTO dto) throws Exception;
	boolean update(CategoryDTO dto) throws Exception;
	boolean delete(Map map) throws Exception;
	boolean create_sub(CategoryDTO dto) throws Exception;
	List<CategoryDTO> list_main() throws Exception;
	List<CategoryDTO> list_sub(String parent_id) throws Exception;
}
