package www.model.admin_board;

import www.model.common.IDAO;

public interface Admin_BoardDAO extends IDAO {

	boolean create(Admin_BoardDTO dto);
}
