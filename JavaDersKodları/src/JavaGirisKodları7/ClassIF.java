package JavaGirisKodlarý7;

public class ClassIF {
	public interface IDeneme {
		public int metod();
	}

	public class ClassIF2 implements IDeneme {
		public int metod() {

			return 0;
		}

		public class ClassIF2_2 implements IDeneme {

			public int metod() {

				return 0;
			}

		}

	}
}
