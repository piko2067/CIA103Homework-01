package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Hw01 {
//	請建立一個Collection物件並將以下資料加入:
//	Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//	Object物件、“Snoopy”、BigInteger(“1000”)
//
//	印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//	移除不是java.lang.Number相關的物件
//	再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
	public static void main(String[] args) {
		Collection list = new LinkedList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add("Kitty");
		list.add("Object物件");
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		System.out.println("使用Iterator");
		Iterator objs = list.iterator();
		{
			while (objs.hasNext())
				System.out.println(objs.next());
		}
		System.out.println();

		System.out.println("使用傳統for");
		for (int i = 0; i < list.size(); i++) {
			Object obj = ((LinkedList) list).get(i);
			System.out.println(obj);
		}
		System.out.println();

		System.out.println("使用foreach");
		for (Object obj1 : list) {
			System.out.println(obj1);
		}
		System.out.println();

		Iterator<Object> iterator = list.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			if (!(obj instanceof Number)) {
				iterator.remove(); // 移除非 Number 的物件
			}
		}

		// 再次印出集合所有元素（使用 foreach）
		System.out.println("移除非 Number 相關物件後:");
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
