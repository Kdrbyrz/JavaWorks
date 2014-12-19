package javaCalisma3;
class InstanceOf{
	public void instanceOf(Object params){
		System.out.println(params instanceof InstanceOf);
	}
}
public class ornek04_operatorler04 {

	public static void main(String[] args) {
		InstanceOf instance=new InstanceOf();
		instance.instanceOf(instance);
	}

}
