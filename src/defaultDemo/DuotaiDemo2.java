package defaultDemo;

/**
 * ʵ�ֶ�̬�ӿ�Ӧ��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��6��23������3:03:48
 */
public class DuotaiDemo2 {
	public static void main(String[] args) {
		UserinfoDao u =new UserinfoBYHibernate();
		u.add();
		u.delete();
	}
}
//�û���Ϣ��
interface UserinfoDao{
	public void add();
	public void delete();
}

class UserinfoBYHibernate implements UserinfoDao{

	@Override
	public void add() {
		System.out.println("�û���Ϣ���ύ��");
	}

	@Override
	public void delete() {
		System.out.println("�û���Ϣ��ɾ����");
	}
	
}