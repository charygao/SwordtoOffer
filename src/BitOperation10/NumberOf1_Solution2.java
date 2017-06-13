package BitOperation10;

/**        
 * Title:��������1�ĸ���     
 * Description: ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 * 
 * ����˼�룺��һ��������ȥ1֮���ٺ�ԭ����������λ�����㣬�õ��Ľ���൱�ڰ�ԭ������
 * �����Ʊ�ʾ�е����ұ�һ��1���0
 * 
 * @author rico       
 * @created 2017��6��4�� ����5:37:32    
 */      
public class NumberOf1_Solution2 {
	  
	/**     
	 * @description �����������������м���1��ѭ������
	 * @author rico       
	 * @created 2017��6��5�� ����3:27:58     
	 * @param n
	 * @return     
	 */
	public int NumberOf1(int n) {
		int count = 0;
		while (n != 0) {
			++count;  
			n = (n-1) & n;  // ��һ��������ȥ1,�ٽ����ԭ������������,��Ѹ��������ұߵ�1���0
		}
		return 	count;
	}
	
	public static void main(String[] args) {
		System.out.println(new NumberOf1_Solution2().NumberOf1(-5));
		System.out.println(new NumberOf1_Solution2().NumberOf1(5));
	}
}