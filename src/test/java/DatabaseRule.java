import org.junit.rules.ExternalResource;
import org.sql2o.*;

public class DatabaseRule extends ExternalResource {
    @Override
    protected void before() {
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:1234/wildlife_tracker_test", null, null);  //
    }

    @Override
    protected void after() {
    }
}
