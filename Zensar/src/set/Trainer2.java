package set;

public class Trainer2 {

		private int id;
		private String name;
		
		/*public int hashCode() {
			int hash= id;
			hash+=name.toLowerCase().hashCode();
			return  hash;
		}
		public boolean equals(Object o) {
			return true;
		}
		*/
		public Trainer2(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
		public String toString() {
			return ("Id-"+id+" |Name-"+name);
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static void main(String[] args) {
			System.out.println("Main of Trainer");
		}
}
