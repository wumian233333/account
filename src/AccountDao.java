import java.sql.SQLException;
import java.util.List;

public interface AccountDao {
    public void add(Account account) throws SQLException;
    public void del(String name);
    public void update(Account account);
    public List<Account> FindAll();
}
