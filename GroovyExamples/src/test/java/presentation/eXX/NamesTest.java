package presentation.eXX;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

public class NamesTest {

    List<String> names = new ArrayList<String>(){{
        add("Pepa");
        add("Ferda");
        add("Ludmila");
    }};

    @Test
    public void namesContainsFerda(){
        assertThat(names, hasItem("Ferda"));
    }
}
