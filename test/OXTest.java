
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OXTest {
    @Test
    public void shouldCreateOXObjectCorrectly(){
       OX ox = new OX();
       // " 012\n0---\n1---\n2---\n"
       assertEquals(" 012\n0---\n1---\n2---\n",ox.getTableString());
    }
}