import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.sql.SQLException;
import java.util.List;

public interface AccountDao {
    public void add(Account account) throws SQLException;
    public void login(Account account, HttpServletRequest request, HttpServletResponse response) throws SQLException;
    public void update(Account account);
    public List<Account> FindAll();
}
