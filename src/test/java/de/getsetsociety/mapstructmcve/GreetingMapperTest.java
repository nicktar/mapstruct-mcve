package de.getsetsociety.mapstructmcve;

import de.getsetsociety.mapstructmcve.data.Greeting;
import de.getsetsociety.mapstructmcve.data.GreetingDto;
import de.getsetsociety.mapstructmcve.data.Target;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreetingMapperTest {

    private static final GreetingMapper UUT = GreetingMapper.INSTANCE;

    @Test
    void testUpdatingGreeting() {
        Greeting greeting = new Greeting("Hello", new Target("World"));

        GreetingDto dto = new GreetingDto();
        dto.setPrefix("Ciao");
        Greeting result = UUT.update(greeting, dto, new Target("Ragazzi"));

        assertThat(result).isEqualTo(new Greeting("Ciao", new Target("Ragazzi")));
    }

    @Test
    void testUpdatingGreetingToNullTarget() {
        Greeting greeting = new Greeting("Hello", new Target("World"));

        GreetingDto dto = new GreetingDto();
        dto.setPrefix("Ciao");
        Greeting result = UUT.update(greeting, dto, null);

        assertThat(result).isEqualTo(new Greeting("Ciao", null));
    }

    @Test
    void testUpdatingGreetingToNullTargetWithSameDto() {
        Greeting greeting = new Greeting("Hello", new Target("World"));

        GreetingDto dto = new GreetingDto();
        dto.setPrefix("Hello");
        Greeting result = UUT.update(greeting, dto, null);

        assertThat(result).isEqualTo(new Greeting("Hello", null));
    }

    @Test
    void testUpdatingGreetingToNullTargetWithoutDto() {
        Greeting greeting = new Greeting("Hello", new Target("World"));

        Greeting result = UUT.update(greeting, null, null);

        assertThat(result).isEqualTo(new Greeting("Hello", null));
    }
}