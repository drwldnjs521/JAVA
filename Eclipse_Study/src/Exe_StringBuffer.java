
public class Exe_StringBuffer {
	public static void main(String[] args) {
		StringBuffer st = new StringBuffer();
		st.append("Hi ");
		st.append("my ");
		st.append("name ");
		st.append("is ");
		st.append("Jeewon ");
		st.insert(14, "Lee ");
		System.out.println(st.toString());
		System.out.println(st.substring(0,2));
	}

}
