package defaultDemo;

/**
 * 实现多态接口应用
 * @author	 创建人：灰凉
 * @date   创建时间：2019年6月23日下午3:03:48
 */
public class DuotaiDemo2 {
	public static void main(String[] args) {
		UserinfoDao u =new UserinfoBYHibernate();
		u.add();
		u.delete();
	}
}
//用户信息到
interface UserinfoDao{
	public void add();
	public void delete();
}

class UserinfoBYHibernate implements UserinfoDao{

	@Override
	public void add() {
		System.out.println("用户信息已提交！");
	}

	@Override
	public void delete() {
		System.out.println("用户信息已删除！");
	}
	
}