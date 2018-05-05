package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelUtilTest {
	@Test
	public void a_b_cをABCに変えられるか() {
		String expected = "ABC";
		String actual = SnakeCamelUtil.snakeToCamelcase("a_b_c");
		assertThat(actual, is(expected));
	}
	@Test
	public void i_want_to_eat_cakeをIWantToEatCakeに変えられるか() {
		String expected = "IWantToEatCake";
		String actual = SnakeCamelUtil.snakeToCamelcase("i_want_to_eat_cake");
		assertThat(actual, is(expected));
	}
	@Test
	public void aaaをAaaに変えられるか() {
		String expected = "Aaa";
		String actual = SnakeCamelUtil.snakeToCamelcase("aaa");
		assertThat(actual, is(expected));
	}
	@Test
	public void ABCをa_b_cに変えられるか() {
		String expected = "a_b_c";
		String actual = SnakeCamelUtil.camelToSnakecase("ABC");
		assertThat(actual, is(expected));
	}
	@Test
	public void IWantToEatCakeをi_want_to_eat_cakeに変えられるか() {
		String expected = "i_want_to_eat_cake";
		String actual = SnakeCamelUtil.camelToSnakecase("IWantToEatCake");
		assertThat(actual, is(expected));
	}
	@Test
	public void Aaaをaaaに変えられるか() {
		String expected = "aaa";
		String actual = SnakeCamelUtil.camelToSnakecase("Aaa");
		assertThat(actual, is(expected));
	}
}
