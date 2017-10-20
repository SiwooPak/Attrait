package www.model.user;

import java.util.Map;

import www.DAOInter;

public interface IUserDAO extends DAOInter {
	public String login(Map map);
}
