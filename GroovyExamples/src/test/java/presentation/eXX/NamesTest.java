package presentation.eXX;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NamesTest {

    List<String> names = new ArrayList<String>() {{
        add("Pepa");
        add("Ferda");
        add("Ludmila");
    }};

    @Test
    public void namesContainsFerda() {
        assertThat(names, hasItem("Ferda"));
    }

    //TODO odebrat public
    @Test
    public void convert() {
        List<Integer> lengths = getSizes(names);
        assertThat(lengths, is(Arrays.asList(new Integer[]{4, 5, 7})));
    }

    private List<Integer> getSizes(List<String> names) {
        //TODO predelat na collect
        List<Integer> lengths = new ArrayList<Integer>();
        for (String name : names) {
            lengths.add(name.length());
        }
        return lengths;
    }
}
