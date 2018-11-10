
public class HashMain {

	class Node {
		Object data;
		Node next, link;
		int rem;

		public Node(Object data) {
			this.data = data;
		}
	}

	Node head;

	boolean add(Object data) {
		System.out.println("data=" + data);
		Node n = new Node(data);
		if (head == null) {
			head = n;
			head.rem = (int) data % 11;
			return true;
		}
		Node t = head, temp = head;
		Node prev = head;
		while (t != null) {
			prev = t;
			if (t.rem > (int) data % 11) {

				n.next = prev;

				if (prev == head)
					head = n;
				else
					temp.next = n;
				n.rem = (int) data % 11;
				return true;

			} else if (t.rem == (int) data % 11) {
				while (t.link != null) {
					t = t.link;
				}
				t.link = n;
				t.rem = (int) data % 11;
				return true;
			}
			temp = t;
			t = t.next;
		}
		prev.next = n;
		n.rem = (int) data % 11;
		return true;
	}

	@Override
	public String toString() {
		Node t = head;
		while (t != null) {
			System.out.println("(" + t.data + " " + t.rem + ")");
			Node v = t;
			while (v.link != null) {
				System.out.println("(" + v.link.data + " " + v.rem + ")");
				v = v.link;
			}
			t = t.next;
		}
		return "";
	}
}
