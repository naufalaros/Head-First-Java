class PoorDog {

	private int size;
	private String name;

	public int getSize() {
		return size;
	}

	public void setSize(int s) {
		size = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public static void main(String[] args) {
		PoorDog one = new PoorDog();
		System.out.println("Dog size is " + one.getSize());
		System.out.println("Dog name is " + one.getName());
	}
}