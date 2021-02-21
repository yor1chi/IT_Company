import com.company.MyApplication;
import com.company.repositories.EmployeeRepository;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.interfaces.IEmployeeRepository;

public class Main {
    public static void main(String[] args) {
        IDB db = new PostgresDB();
        IEmployeeRepository repo = new EmployeeRepository(db);
        MyApplication app = new MyApplication(repo);
        app.start();
    }
}