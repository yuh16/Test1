import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DualSort {

	public static void main(String[] args) throws IOException {

		String ds[] = args;
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		for (int i = 0; i < ds.length; i++) {
			if (ds[i] != null) {
				int a = Integer.parseInt(ds[i]);
				if (a % 2 == 0) {
					list2.add(a);
				} else {
					list1.add(a);
				}
			}
		}
		Collections.sort(list1);
		Collections.sort(list2);
		Collections.reverse(list2);
		list1.addAll(list2);
		int n = list1.size();
		int sortnums[] = new int[n];
		for (int j = 0; j < n; j++) {
			sortnums[j] = (int) list1.get(j);
			System.out.print(sortnums[j]);
			System.out.print(" ");
		}
		System.out.print("\n");
	}

}

