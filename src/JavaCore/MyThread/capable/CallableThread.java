package JavaCore.MyThread.capable;

import java.util.concurrent.Callable;

/**
* @arithmetics ��
* @author �� masuo
* @date ��2021��5��14�� ����8:35:03
*  :
*/
public class CallableThread implements Callable<String>{

	@Override
	public String call() throws Exception {
		//  �߳�ҵ���߼�
		System.out.println("callable thread");
		return null;
	}

}
