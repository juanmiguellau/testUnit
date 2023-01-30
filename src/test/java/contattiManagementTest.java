import org.example.Contatto;
import org.example.contattiManagement;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import java.util.*;
public class contattiManagementTest {

    public contattiManagement c=new contattiManagement();

@BeforeEach
public void SetUp() {
    c.addContact(1,"carlo", "manfredi");
    c.addContact(2,"michele", "giordano");
    c.addContact(3,"carmine", "cirillo");

}


    @Test
    public void addContact() {

        String ris=c.addContact(4,"juan","lau" );
        Assert.assertEquals("ok",ris);
    }


    @Test
    public void upDateContact() {
        c.upDateContac(1,"angelo", "catanzaro");
        Assert.assertEquals(c.readContattoId(1),"angelo");
    }

    @Test
    public void deleteContact() {
    c.deleteContac(1);
    Assert.assertEquals(c.sizeContatto(),2);
    }


    @Test
    public void upDate() {

        String res= c.upDateContac(10,"angelo", "catanzaro");
        Assert.assertEquals("ko",res);
    }
}
