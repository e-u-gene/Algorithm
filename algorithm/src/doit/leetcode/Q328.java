package doit.leetcode;

public class Q328 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
s
	class Solution {
		public ListNode oddEvenList(ListNode head) {
			
			// head 값이 없을경우를 if문으로 한 번 걸러주고 시작한다.
			if (head == null || head.next == null)
				return head;
			
			
			// 리스트노드의 odd는 맨 첫번째값이다.
			ListNode odd = head;
			// 리스트 노드의 even은 head.next 
			// head의 next가 바로 뒤에있는 짝수번째 노드값의 주소를 가지고 있기때문
			ListNode even = head.next;
			// 따라서 even의 head값은 even이 된다.
			ListNode evenhead = even;
			
			// while문으로 홀수도 짝수도 더이상 가져올 next값이 없을때까지 가져온다
			while (odd.next != null && even.next != null) {
				// 홀 짝 홀 짝 으로 계속 들어온다면 짝수head의 next값은 항상\
				// 홀수노드의 주소를 가지고 있는다.
				// 따라서 odd.next는 even.next가 되어 바로 다음 홀수번째
				//노드값을 가져온다
				odd.next = even.next;
				
				// 홀수들을 여기서 odd.next는 even.next이므로
				// 홀수번째 노드들은 전부 짝수번째 노드의 next값
				// 즉, 짝수 바로 뒤에 있는 홀수노드들이 된다.
				odd = odd.next;
				
				
				// even.next를 odd.next로 선언해준다
				// odd.next는 바로 뒤 짝수노드의 주소를 가지고 있으므로!
				even.next = odd.next;
				
				// 그렇게 even은 짝수노드들만 가지고 있게 된다!
				even = even.next;
			}
			// while문이 끝나면 더이상 노드들이 없으므로
			// 홀수노드의 next값을 짝수노드의 head로 설정해주면
			// 홀수노드들 다음 바로 짝수노드가 오게 정렬된다.
			odd.next = evenhead;
			return head;
		}
	}

}
